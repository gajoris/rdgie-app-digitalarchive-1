package org.rdgie.digitalarchive.user.serviceimpl;


import org.rdgie.digitalarchive.domain.*;
import org.rdgie.digitalarchive.user.service.UserService;
import org.rdgie.digitalarchive.userDAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public void addUser(User user) {
		this.userDAO.addUser(user);
	}

	@Override
	@Transactional
	public User checkUser(User user) {
		
		return userDAO.checkUser(user);
	}


}


