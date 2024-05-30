package com.kosta.exam04;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape []data = new Shape[1000];
		int menu;
		int n=0;
		int x,y;
		double width,length,hight,radius;
		
		while(true) {
			do {
				System.out.println("1.사각형, 2.삼각형, 3.직육면체, 4.원기둥, 0.종료");
				System.out.print("도형의 종류를 선택하세요");
				menu = sc.nextInt();
			}while(menu < 0 || menu > 4);
			
			if(menu == 0) {
				break;
			}
			
			System.out.print("도형의 x위치:");
			x = sc.nextInt();
			System.out.print("도형의 y위치:");
			y = sc.nextInt();
			
			
			switch(menu) {
				case 1:
					System.out.print("사각형의 가로:");
					width = sc.nextDouble();
					System.out.print("사각형의 세로:");
					length = sc.nextDouble();
					data[n] = new Rectangle(x, y, width, length);
					break;
				case 2:
					System.out.print("삼각형의 밑변:");
					width = sc.nextDouble();
					System.out.print("삼각형의 높이:");
					hight = sc.nextDouble();
					data[n] = new Triangle(x, y, width, hight);
					break;
				case 3:
					System.out.print("직육면체의 가로:");
					width = sc.nextDouble();
					System.out.print("직육면체의 세로:");
					length = sc.nextDouble();
					System.out.print("직육면체의 높이:");
					hight = sc.nextDouble();
					data[n] = new Cube(x, y, width, length, hight);
					break;
				case 4:
					System.out.print("원기둥의 반지름:");
					radius = sc.nextDouble();
					System.out.print("원기둥의 높이:");
					hight = sc.nextDouble();
					data[n] = new Cylinder(x, y, radius, hight);
					break;
			}
			n++;
			
		}//end while
		for(int j=0; j<n; j++) {
			Shape s = data[j];
			if (s instanceof TwoDimShape) {
				((TwoDimShape)s).calcArea();
			}else {
				((ThreeDimShape)s).calcVolume();
			}
			System.out.println(s);
		}
	}

}
