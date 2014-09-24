package org.rdgie.digitalarchive.util;

import java.io.IOException;

import org.rdgie.digitalarchive.controller.executor.FsItemEx;
import org.rdgie.digitalarchive.service.FsItem;
import org.rdgie.digitalarchive.service.FsService;

public abstract class FsServiceUtils
{
	public static FsItemEx findItem(FsService fsService, String hash) throws IOException
	{
		FsItem fsi = fsService.fromHash(hash);
		if (fsi == null)
		{
			return null;
		}

		return new FsItemEx(fsi, fsService);
	}
}
