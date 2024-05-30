package com.kosta.exam02;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee []data = new Employee[1000];
		int menu, time, level, timesalary, i = 0;
		String name,eno;
		
		while(true) {
			do {
				System.out.println("월급제를 입력하세요: 1.월급제, 2.시간제, 0.종료:");
				menu = sc.nextInt();
			}while(menu < 0 || menu >2);
			
			if(menu == 0) {
				break;
			}
			System.out.println("사원번호를 입력하세요:");
			eno = sc.next();
			System.out.println("이름을 입력하세요:");
			name = sc.next();
			
			switch(menu) {
				case 1:
					System.out.println("호봉:");
					level = sc.nextInt();
					data[i] = new SalariedEmployee(name, eno, level);
					break;
				case 2:
					System.out.println("시급: ");
					timesalary = sc.nextInt();//시간당 임금
					System.out.println("일한 시간: ");
					time = sc.nextInt(); // 일한 시간
					data[i] = new HourlyEmployee(name, eno, timesalary,time); // 사원 이름, 번호, 시간당 임금, 일한 시간
					break;
			}//end switch
			i++;
		}//end while
		
		for(int j=0; j<i; j++) {
			data[j].computeSalary();
			System.out.println(data[j]);
		}
	}
}