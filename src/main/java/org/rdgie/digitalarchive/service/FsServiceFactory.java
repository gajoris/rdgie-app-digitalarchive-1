package org.rdgie.digitalarchive.service;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.rdgie.digitalarchive.service.FsService;

public interface FsServiceFactory
{

	FsService getFileService(HttpServletRequest request, ServletContext servletContext);

}
