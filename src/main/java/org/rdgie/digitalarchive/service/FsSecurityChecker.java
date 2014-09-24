package org.rdgie.digitalarchive.service;

import java.io.IOException;

import org.rdgie.digitalarchive.service.FsItem;
import org.rdgie.digitalarchive.service.FsService;

public interface FsSecurityChecker
{

	boolean isLocked(FsService fsService, FsItem fsi) throws IOException;

	boolean isReadable(FsService fsService, FsItem fsi) throws IOException;

	boolean isWritable(FsService fsService, FsItem fsi) throws IOException;

}