package com.kosta.exam10;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			Shape []data = new Shape[1000];
			int x, y, menu, i=0;
			double width, length, radius;
			
			while(true) {
				while(true) {
					System.out.println("도형의 종류를 선택==>[1.사각형, 2.원, 0.종료]");
					menu=sc.nextInt();
					if(menu == 0) {
						break;
					}
					
					System.out.println("도형의 X위치==>");
					x=sc.nextInt();
					System.out.println("도형의 Y위치==>");
					y=sc.nextInt();
					
					switch(menu) {
						case 1:
							System.out.println("사각형의 가로길이==>");
							width = sc.nextDouble();
							System.out.println("사각형의 세로길이==>");
							length = sc.nextDouble();
							data[i] = new Rectangle(x,y,width,length); break;
						case 2:
							System.out.println("원의 반지름==>");
							radius = sc.nextDouble();
							data[i] = new Circle(x,y,radius); break;
					}//end switch0
					i++;	//배열의 인덱스 이자 데이터 수
				}
				for(int j=0; j<i; j++) {
					data[j].calcArea();
					data[j].calcRound();
					System.out.println(data[j]);
					
				}
				break;
			}
	}
}

