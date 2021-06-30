package com.test.test.controller;

import java.util.Scanner;

import com.test.test.dao.UsersDao;
import com.test.test.model.Users;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singIn();
		
	}

	private static void singIn() {
		Scanner scan = new Scanner(System.in);
		UsersDao dao = new UsersDao();
		
		System.out.println("=======로그인=======");
		
		System.out.print("id :");
		String id = scan.nextLine();
		
		System.out.print("pwd :");
		String pwd = scan.nextLine();
		
		System.out.println("===================");
		
		Users user = dao.singIn(id, pwd);
		System.out.println(user.getId() + "님 안녕하세요.");
	}

	private static void singUp() {
		Users user = new Users();
		Scanner scan = new Scanner(System.in);
		UsersDao dao = new UsersDao();
		
		System.out.println("=======회원가입=======");
		
		System.out.print("id :");
		String id = scan.nextLine();
		
		System.out.print("pwd :");
		String pwd = scan.nextLine();
		
		System.out.print("phoneNo :");
		String phoneNo = scan.nextLine();
		
		System.out.println("====================");
		
		
		user.setId(id);
		user.setPwd(pwd);
		user.setPhoneNo(phoneNo);
		
		dao.signUp(user);
	}

}

//
//서비스 -> 로직
//컨트롤러 -> 로직과 상관없는

