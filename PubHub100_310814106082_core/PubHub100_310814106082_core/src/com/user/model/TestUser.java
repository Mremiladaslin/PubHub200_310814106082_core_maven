package com.user.model;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();

		user.setId(1);
		System.out.println(user.getId());

		user.setName("remila");
		System.out.println(user.getName());

		user.setEmail_id("remiladaslin@gmail.com");
		System.out.println(user.getEmail_id());

		user.setPassword("daslin");
		System.out.println(user.getPassword());
		
		
		
		System.out.println(user.toString());
	}

}
