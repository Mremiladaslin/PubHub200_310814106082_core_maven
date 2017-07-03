package com.bookapp.util;

import java.sql.SQLException;

import com.bookapp.util.ConnectionUtil;

public class TestConnection {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		System.out.println(ConnectionUtil.getConnection());
	}

}
