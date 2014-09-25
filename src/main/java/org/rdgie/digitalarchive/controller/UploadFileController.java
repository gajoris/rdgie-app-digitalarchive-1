package org.rdgie.digitalarchive.controller;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.BindException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.rdgie.digitalarchive.form.UploadItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadFileController {
	private String uploadFolderPath;
	ServletConfig config;

	public String getUploadFolderPath() {
		return uploadFolderPath;
	}

	public void setUploadFolderPath(String uploadFolderPath) {
		this.uploadFolderPath = uploadFolderPath;
	}
	@RequestMapping(value = "/afterUpload", method = RequestMethod.GET)
	public String uploadSuccess(ModelMap model, HttpServletRequest request,
			HttpServletResponse response) {
		model.addAttribute("uploadItem",new UploadItem());
		return "savereport";
	}
	@RequestMapping(value = "/uploadfile", method = RequestMethod.POST)
	public String create(UploadItem uploadItem, HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors,
			HttpSession session) {
		
		try {

			MultipartFile filea = uploadItem.getFileData();

			InputStream inputStream = null;
			OutputStream outputStream = null;
			if (filea.getSize() > 0) {
				inputStream = filea.getInputStream();
				String path = "/home/john/elfinder/uploads/";
				outputStream = new FileOutputStream(path
						+ filea.getOriginalFilename());
				System.out.println("====22=========");
				System.out.println(filea.getOriginalFilename());
				System.out.println("=============");
				int readBytes = 0;
				byte[] buffer = new byte[8192];
				while ((readBytes = inputStream.read(buffer, 0, 8192)) != -1) {
					System.out.println("===ddd=======");
					outputStream.write(buffer, 0, readBytes);
				}
				outputStream.close();
				inputStream.close();
				session.setAttribute("success", "File Uploaded Successfully");
				session.setAttribute("uploadFile",
						path + filea.getOriginalFilename());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/afterUpload";
	}
}
