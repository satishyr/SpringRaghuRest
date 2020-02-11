package com.app.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.model.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private IUserDao dao;
	
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		//1. Load Model class user object
		User user=dao.getUserByEmail(username);
		//2. convert String role to Set<GA>
		Set<GrantedAuthority> roles=new HashSet<>();
		for(String role:user.getUserRoles()) {
			roles.add(
					//string -> GA => Adding to Set<GA>
					new SimpleGrantedAuthority(role)
			);
		}
		//3. Model class User to Spring f/w User
		return new org.springframework.security.core.userdetails.User(username, user.getUserPwd(), roles);
	}

}