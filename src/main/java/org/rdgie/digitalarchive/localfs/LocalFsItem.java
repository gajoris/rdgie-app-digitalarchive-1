package org.rdgie.digitalarchive.localfs;

import java.io.File;

import org.rdgie.digitalarchive.service.FsItem;
import org.rdgie.digitalarchive.service.FsVolume;

import org.rdgie.digitalarchive.localfs.LocalFsVolume;

public class LocalFsItem implements FsItem
{
	File _file;

	FsVolume _volumn;

	public LocalFsItem(LocalFsVolume volumn, File file)
	{
		super();
		_volumn = volumn;
		_file = file;
	}

	public File getFile()
	{
		return _file;
	}

	public FsVolume getVolume()
	{
		return _volumn;
	}

	public void setFile(File file)
	{
		_file = file;
	}

	public void setVolumn(FsVolume volumn)
	{
		_volumn = volumn;
	}
}
