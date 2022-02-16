package com.chainsys.groceryshop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.chainsys.groceryshop.model.Loginmodel;

public class Mapper implements RowMapper<Loginmodel> {

	@Override
	public Loginmodel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Loginmodel login =new Loginmodel();
		login.setUserName(rs.getString("user_name"));
		login.setPassword(rs.getString("password"));
		return login;
	}

	
		
}