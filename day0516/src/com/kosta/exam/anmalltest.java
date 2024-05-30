package com.kosta.exam;
import java.util.Scanner;

public class anmalltest {
	    public static void main(String[] args) {
	        String[] animals = {"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"};

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("정수를 입력하세요:");
	        int input = scanner.nextInt();
	        
	        // 입력된 숫자에 따라 출력할 동물의 인덱스 계산
	        int index = (input - 1) % animals.length;
	        // 배열에서 동물 출력
	        System.out.println(animals[index]);
	}
}
