package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUserDao;
import com.app.model.User;

@Repository
public class UserDaoImpl implements IUserDao {
	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public Integer saveUser(User user) {
		return (Integer)ht.save(user);
	}
	
	@Override
	public User getUserByEmail(String email) {
		User user=null;
		List<User> userList=(List<User>) ht.find("from com.app.model.User where userEmail=?",email);
		if(userList!=null && userList.size()>0) {
			user=userList.get(0);
		}
		return user;
	}

}
