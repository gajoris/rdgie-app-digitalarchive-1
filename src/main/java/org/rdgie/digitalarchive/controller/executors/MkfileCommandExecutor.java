package org.rdgie.digitalarchive.controller.executors;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.rdgie.digitalarchive.controller.executor.AbstractJsonCommandExecutor;
import org.rdgie.digitalarchive.controller.executor.CommandExecutor;
import org.rdgie.digitalarchive.controller.executor.FsItemEx;
import org.rdgie.digitalarchive.service.FsService;

public class MkfileCommandExecutor extends AbstractJsonCommandExecutor implements CommandExecutor
{
	@Override
	public void execute(FsService fsService, HttpServletRequest request, ServletContext servletContext, JSONObject json)
			throws Exception
	{
		String target = request.getParameter("target");
		String name = request.getParameter("name");

		FsItemEx fsi = super.findItem(fsService, target);
		FsItemEx dir = new FsItemEx(fsi, name);
		dir.createFile();
		json.put("added", new Object[] { getFsItemInfo(request, dir) });
	}
}
