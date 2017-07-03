package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.util.ConnectionUtil;

public class BookDAO {
	
	
	
	public void save(Book book) {
		Connection connection = ConnectionUtil.getConnection();

		String sql = "INSERT INTO book_details(book_name,author,price) VALUES(?,?,?)";
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, book.getBook_name());
			pst.setString(2,book.getAuthor());
			pst.setInt(3,book.getPrice());

			pst.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		}

		
	public void newPrice(Book book) {
		Connection connection = ConnectionUtil.getConnection();

		String sql = "UPDATE book_details SET price=? WHERE book_name=?";

		PreparedStatement pst;
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, book.getPrice());
			pst.setString(2, book.getBook_name());

			pst.executeUpdate();
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			}

	public void delete(Book book) {
		Connection connection = ConnectionUtil.getConnection();

		String sql = "DELETE FROM book_details WHERE book_name=?";

		PreparedStatement pst;
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, book.getBook_name());
			pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Book> viewAll() {
		Connection connection = ConnectionUtil.getConnection();

		String sql = "SELECT book_name,author,price FROM book_details";

		PreparedStatement pst;
		try {
			pst = connection.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			List<Book> books = new ArrayList<Book>();
			System.out.println(books.size());
			while (rs.next()) {
				Book book1 = new Book();
				book1.setBook_name(rs.getString(1));
				book1.setBook_name(rs.getString(2));
				book1.setPrice(rs.getInt(3));
				books.add(book1);
			}

			return books;
		
} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
			public List<Book> viewBook(Book book) {
		Connection connection = ConnectionUtil.getConnection();

		String sql = "SELECT book_name,author,price FROM book_details WHERE book_name=?";

		PreparedStatement pst;
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, book.getBook_name());

			ResultSet rs = pst.executeQuery();
			List<Book> books = new ArrayList<>();

			while (rs.next()) {

				Book book1 = new Book();
				book1.setBook_name(rs.getString(1));
				book1.setAuthor(rs.getString(2));
				book1.setPrice(rs.getInt(3));
				books.add(book1);
			}
			System.out.println(books.size());
			return books;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
			}
	}
