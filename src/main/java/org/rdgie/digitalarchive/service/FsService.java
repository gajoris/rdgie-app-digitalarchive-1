package org.rdgie.digitalarchive.service;

import java.io.IOException;

import org.rdgie.digitalarchive.service.FsItem;
import org.rdgie.digitalarchive.service.FsSecurityChecker;
import org.rdgie.digitalarchive.service.FsServiceConfig;
import org.rdgie.digitalarchive.service.FsVolume;

public interface FsService
{
	FsItem fromHash(String hash) throws IOException;

	String getHash(FsItem item) throws IOException;

	FsSecurityChecker getSecurityChecker();

	String getVolumeId(FsVolume volume);

	FsVolume[] getVolumes();

	FsServiceConfig getServiceConfig();
}