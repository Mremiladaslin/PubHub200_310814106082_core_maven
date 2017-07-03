package com.bookapp.model;

public class TestBook {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
		Book book = new Book();

		book.setBook_name("tholkappium");
		System.out.println(book.getBook_name());

		book.setAuthor("kambar");
		System.out.println(book.getAuthor());

		book.setPrice(500);
		System.out.println(book.getPrice());

		System.out.println(book.toString());
	}

}
