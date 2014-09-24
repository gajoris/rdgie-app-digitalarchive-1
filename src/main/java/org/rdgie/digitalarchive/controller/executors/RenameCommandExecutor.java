package org.rdgie.digitalarchive.controller.executors;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.rdgie.digitalarchive.controller.executor.AbstractJsonCommandExecutor;
import org.rdgie.digitalarchive.controller.executor.CommandExecutor;
import org.rdgie.digitalarchive.controller.executor.FsItemEx;
import org.rdgie.digitalarchive.service.FsService;

public class RenameCommandExecutor extends AbstractJsonCommandExecutor implements CommandExecutor
{
	@Override
	public void execute(FsService fsService, HttpServletRequest request, ServletContext servletContext, JSONObject json)
			throws Exception
	{
		String target = request.getParameter("target");
		String current = request.getParameter("current");
		String name = request.getParameter("name");

		FsItemEx fsi = super.findItem(fsService, target);
		FsItemEx dst = new FsItemEx(fsi.getParent(), name);
		fsi.renameTo(dst);

		json.put("added", new Object[] { getFsItemInfo(request, dst) });
		json.put("removed", new String[] { target });
	}
}
