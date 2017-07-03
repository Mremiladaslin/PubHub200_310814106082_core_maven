package com.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.user.model.User;
import com.bookapp.util.ConnectionUtil;

public class UserDAO {
	
	public void register(User user) throws ClassNotFoundException, SQLException {
		
		Connection connection = ConnectionUtil.getConnection();
		String sql = "INSERT INTO user_details(NAME,email_id,PASSWORD) VALUES(?,?,?)";
		
		PreparedStatement pst =  connection.prepareStatement(sql);
        pst.setString(1, user.getName());
		pst.setString(2, user.getEmail_id());
		pst.setString(3, user.getPassword());
		pst.executeUpdate();

	}
	public boolean login (User user) throws ClassNotFoundException, SQLException {
		
		Connection connection = ConnectionUtil.getConnection();
		String sql = "SELECT NAME from user_details where email_id=? AND PASSWORD=?";
		PreparedStatement pst =  connection.prepareStatement(sql);

		pst.setString(1, user.getEmail_id());
		pst.setString(2, user.getPassword());
		
		ResultSet rs=pst.executeQuery();
		boolean flag=false;
		if(rs.next())
		{
			flag=true;
		
		}
System.out.println(flag);
		return flag;
}
}


