package com.kosta.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

//사람의 이름,주소,전화를 입력 받아 출력하는 프로그램
public class FileTest02 {
	public static void main(String[] args) throws IOException {
		String name, addr, phone;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력:");
		name = sc.next();
		System.out.print("주소 입력:");
		addr = sc.next();
		System.out.print("전화번호 입력:");
		phone = sc.next();
		
		try {
//			FileWriter fw = new FileWriter("c:/data/info.txt");
			//파일을 생성하면 기본적으로 기존의 파일을 덮어쓰기 한다.
			
			FileWriter fw = new FileWriter("c:/data/info.txt", true);
			//파일생성시에 두번째 매개변수(appned mode)에 true를 주면
			//파일이 없다면 새로 만들어 주고
			//파일이 이미 있다면 내용을 추가 해 준다.
			
			fw.write("이름:"+name+"\n");
			fw.write("주소:"+addr+"\n");
			fw.write("전화:"+phone+"\n");
			fw.close();
			System.out.println("파일이 생성 되었습니다.");
			
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
}
