package com.kosta.file;

import java.io.FileNotFoundException;
import java.io.FileReader;

//C:/data/info.txt 파일의 내용을 메모리로 읽어 들여
//화면에 출력하는 프로그램을 만들어 보자.
public class FileReaderTest {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:/data/info.txt");
			int ch;
			while(true) {
				ch = fr.read();
				if(ch == -1) {
					break;
				}
				System.out.print((char)ch);
			}
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
