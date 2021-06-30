package com.test.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.test.test.model.Users;

public class UsersDao {
	
	private PreparedStatement pstmt = null;
	private Connection c = null;
	private ResultSet rs = null;
	
	public void signUp(Users user)  {
		try {
			c = getConnection();
			
			String sql = "INSERT INTO USERS "
					   + "VALUES(?, ?, ?)";
			
			pstmt = c.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPwd());
			pstmt.setString(3, user.getPhoneNo());
			
			pstmt.executeUpdate();
			
			System.out.println("회원가입 완료!");
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			finally_close();
			
		}
	}

	public Users singIn(String id, String pwd) {
		Users user = new Users();
		try {
			c = getConnection();
			
			String sql = "SELECT * FROM users "
					   + "WHERE id = ? "
					   + "AND pwd = ?";
			
			pstmt = c.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			
			rs = pstmt.executeQuery();
			rs.next();  // 첫번쨰 데이터를 향하
			
			user.setId(rs.getString("id"));
			user.setPwd(rs.getString("pwd"));
			user.setPhoneNo(rs.getString("phoneNo"));
			
			System.out.println("로그인 성공 ");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("로그인 실패 ");
			e.printStackTrace();
		} finally {
			finally_close();
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		return user;
		
	}
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); // forName으로된 클래스를 찾는다 
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_exam?serverTimezone=Asia/Seoul", "bbbb412", "alsWn96976");
	}
	

	private void finally_close() {
		try {
			c.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
