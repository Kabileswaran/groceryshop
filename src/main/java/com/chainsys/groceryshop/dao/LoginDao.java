package com.chainsys.groceryshop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chainsys.groceryshop.model.Loginmodel;

@Repository
@Transactional
public class LoginDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void login(final Loginmodel login) {
		jdbcTemplate.update("insert into logins(user_name, password) values(?, ?)",
				new Object[] { login.getUserName(), login.getPassword() });

	}

	public List<Loginmodel> loginUser() {
		List<Loginmodel> login = jdbcTemplate.query("select * from logins", new Mapper());
		return login;
	}

}
