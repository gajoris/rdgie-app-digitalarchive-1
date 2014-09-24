package org.rdgie.digitalarchive.controller.executors;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.rdgie.digitalarchive.controller.executor.AbstractJsonCommandExecutor;
import org.rdgie.digitalarchive.controller.executor.CommandExecutor;
import org.rdgie.digitalarchive.controller.executor.FsItemEx;
import org.rdgie.digitalarchive.service.FsService;

public class UploadCommandExecutor extends AbstractJsonCommandExecutor implements CommandExecutor
{
	@Override
	public void execute(FsService fsService, HttpServletRequest request, ServletContext servletContext, JSONObject json)
			throws Exception
	{
		List<FileItemStream> listFiles = (List<FileItemStream>) request.getAttribute(FileItemStream.class.getName());
		List<FsItemEx> added = new ArrayList<FsItemEx>();

		System.out.println("===========Inside upload executor");
		String target = request.getParameter("target");
		FsItemEx dir = super.findItem(fsService, target);

		for (FileItemStream fis : listFiles)
		{
			String fileName = fis.getName();
			FsItemEx newFile = new FsItemEx(dir, fileName);
			newFile.createFile();
			InputStream is = fis.openStream();
			OutputStream os = newFile.openOutputStream();

			IOUtils.copy(is, os);
			os.close();
			is.close();

			added.add(newFile);
		}

		json.put("added", files2JsonArray(request, added));
	}
}
