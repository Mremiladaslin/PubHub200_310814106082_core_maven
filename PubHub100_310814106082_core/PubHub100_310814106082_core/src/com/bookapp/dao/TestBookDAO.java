package com.bookapp.dao;

import java.sql.SQLException;

import com.bookapp.model.Book;

public class TestBookDAO {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			Book book = new Book();
			book.setBook_name("Famous Five");
			book.setPrice(988);
			

			BookDAO dao = new BookDAO();
			//dao.save(book);
			//System.out.println(book);
			
			dao.delete(book);
			System.out.println(book);
			
			//dao.newPrice(book);
			//System.out.println(book);
			
			//dao.viewAll(book);
			//System.out.println(book);
			
			//dao.viewBook(book);
			//System.out.println(book);
		}

}
