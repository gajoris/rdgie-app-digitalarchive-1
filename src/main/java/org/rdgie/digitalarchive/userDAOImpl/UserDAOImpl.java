package org.rdgie.digitalarchive.userDAOImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.rdgie.digitalarchive.domain.User;
import org.rdgie.digitalarchive.userDAO.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

	private static final Logger logger = LoggerFactory
			.getLogger(UserDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addUser(User u) {
		Session session = sessionFactory.getCurrentSession();
		session.save(u);
		logger.info("User saved successfully, Person Details=" + u);
	}

	@Override
	public User checkUser(User user) {

		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(User.class);
		List<User> users = cr.list();

		User foundUser = null;

		for (User u : users) {
			
			if (u.equals(user))
				foundUser = u;
		}
		return foundUser;
	}

}
