package org.rdgie.digitalarchive.impl;

import org.rdgie.digitalarchive.service.FsServiceConfig;

public class DefaultFsServiceConfig implements FsServiceConfig
{
	private int _tmbWidth;

	public void setTmbWidth(int tmbWidth)
	{
		_tmbWidth = tmbWidth;
	}

	@Override
	public int getTmbWidth()
	{
		return _tmbWidth;
	}
}
