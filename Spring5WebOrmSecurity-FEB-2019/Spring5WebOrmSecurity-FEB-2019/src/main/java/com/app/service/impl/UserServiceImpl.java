package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.model.User;
import com.app.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao dao;
	@Autowired
	private BCryptPasswordEncoder ncoder;
	
	@Transactional
	public Integer saveUser(User user) {
		//encode password before save
		user.setUserPwd(ncoder.encode(user.getUserPwd()));
		return dao.saveUser(user);
	}
	
	@Transactional(readOnly=true)
	public User getUserByEmail(String email) {
		return dao.getUserByEmail(email);
	}

}
