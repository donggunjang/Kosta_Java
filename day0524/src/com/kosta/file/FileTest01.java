package com.kosta.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

//사람의 이름,주소,전화를 입력 받아 출력하는 프로그램
public class FileTest01 {
	public static void main(String[] args) {
		String name, addr, phone;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력:");
		name = sc.next();
		System.out.println("주소 입력:");
		addr = sc.next();
		System.out.println("전화번호 입력:");
		phone = sc.next();
		
		System.out.println("이름"+name);
		System.out.println("주소"+addr);
		System.out.println("전화번호"+phone);
	}
}
