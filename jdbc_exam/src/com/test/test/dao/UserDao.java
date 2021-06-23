package com.test.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.test.test.model.Users;

public class UserDao {
	
	public int createUser(Users user) throws ClassNotFoundException, SQLException {
		
		Connection con = getCon();
		
		
		String sql = "insert into users " +"(id, pwd, phoneNo)" +"values(?,?,?)";
		PreparedStatement pstmt =  con.prepareStatement(sql);
		pstmt.setString(1, user.getId());
		pstmt.setString(2, user.getPwd());
		pstmt.setString(3, user.getPhoneNo());
		
		
		return pstmt.executeUpdate();
		
	}

	
	
	public Users login(Users user) throws Exception {
		
		Connection con = getCon();
		
		String sql = "select * from users " + "where id = ? ";
		PreparedStatement pstmt =  con.prepareStatement(sql);
		pstmt.setString(1, user.getId());
		
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		
		if(user.getId().equals(rs.getString("id"))) {
			if(user.getPwd().equals(rs.getString("pwd"))) {
				System.out.println("로그인성공");
			} else {
				System.out.println("로그인 실패11");
			}
		} else {
			System.out.println("로그인 실패22");
			throw new Exception();
		}
		
		user.setPhoneNo(rs.getString("phoneNo"));
		
		
		return user;
	}
	
	
	private Connection getCon() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc_exam?serverTimezone=Asia/Seoul", "root", "1234");
		return con;
	} 

}
