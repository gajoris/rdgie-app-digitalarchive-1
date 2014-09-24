package org.rdgie.digitalarchive.controller.executors;

import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.rdgie.digitalarchive.controller.executor.AbstractJsonCommandExecutor;
import org.rdgie.digitalarchive.controller.executor.CommandExecutor;
import org.rdgie.digitalarchive.controller.executor.FsItemEx;
import org.rdgie.digitalarchive.service.FsService;

public class PutCommandExecutor extends AbstractJsonCommandExecutor implements CommandExecutor
{
	@Override
	public void execute(FsService fsService, HttpServletRequest request, ServletContext servletContext, JSONObject json)
			throws Exception
	{
		String target = request.getParameter("target");

		FsItemEx fsi = super.findItem(fsService, target);
		OutputStream os = fsi.openOutputStream();
		IOUtils.write(request.getParameter("content"), os, "utf-8");
		os.close();
		json.put("changed", new Object[] { super.getFsItemInfo(request, fsi) });
	}
}
