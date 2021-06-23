package com.test.test.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.test.test.dao.UserDao;
import com.test.test.model.Users;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UserDao usersDao = new UserDao();
		
		
		Users user = new Users();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("id = ");
		user.setId(scan.nextLine());
		
		System.out.println("pwd = ");
		user.setPwd(scan.nextLine());
		
		usersDao.createUser(user);
		
		System.out.println(user);
		
		Users login = new Users();
		
		System.out.println("로그인");
		
		System.out.println("id = ");
		user.setId(scan.nextLine());
		
		System.out.println("pwd = ");
		user.setPwd(scan.nextLine());
		
		usersDao.login(login);
	}

}
