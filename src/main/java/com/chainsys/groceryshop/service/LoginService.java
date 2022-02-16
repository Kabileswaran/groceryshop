package com.chainsys.groceryshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.groceryshop.dao.LoginDao;
import com.chainsys.groceryshop.model.Loginmodel;

@Service
public class LoginService {
	@Autowired
	private LoginDao loginDao;
	public void logins(final Loginmodel loginmodel) {
		loginDao.login(loginmodel);
		
	}
	public List<Loginmodel> listLoginUser() {
		return loginDao.loginUser();
	}

}
