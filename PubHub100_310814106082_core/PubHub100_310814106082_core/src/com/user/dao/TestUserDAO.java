package com.user.dao;

import java.sql.SQLException;

import com.user.model.User;

public class TestUserDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// TODO Auto-generated method stub
		
		User user = new User();
		user.setName("jeni");
		user.setEmail_id("jeni@gmail.com");
		user.setPassword("jeniword");

		UserDAO dao = new UserDAO();
		dao.register(user);
		
		System.out.println(user);
		
		User user1=new User();
		dao.login(user1);
		

	}

}
