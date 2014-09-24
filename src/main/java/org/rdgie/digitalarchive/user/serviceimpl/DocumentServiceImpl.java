package org.rdgie.digitalarchive.user.serviceimpl;

import org.rdgie.digitalarchive.domain.Document;
import org.rdgie.digitalarchive.user.service.DocumentServices;
import org.rdgie.digitalarchive.userDAO.DocumentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DocumentServiceImpl implements DocumentServices{
	@Autowired
	private DocumentDAO documentDAO;

	public void setDocuementDAO(DocumentDAO documentDAO) {
		this.documentDAO = documentDAO;
	}
	@Override
	@Transactional
	public void addDocument(Document document) {
		this.documentDAO.addDocument(document);		
	}
}
