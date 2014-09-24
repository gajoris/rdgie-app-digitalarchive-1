package org.rdgie.digitalarchive.userDAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.rdgie.digitalarchive.domain.Document;
import org.rdgie.digitalarchive.userDAO.DocumentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class DocumentDAOImpl implements DocumentDAO{
	private static final Logger logger = LoggerFactory
			.getLogger(UserDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	@Override
	public void addDocument(Document d) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(d);
		logger.info("Document saved successfully, Docuemnt Details=" + d);
	}

	

}
