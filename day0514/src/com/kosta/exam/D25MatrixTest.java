package com.kosta.exam;
/*
		0 [][][][][]
		1 [][]
		2 [][][][][][][][][][]
		
		//배열의 요소에 1부터 1씩 즈아한 값을 차례로 넣어라
*/
public class D25MatrixTest {
	public static void main(String[] args) {
		
		int [][]a = new int[3][];
		int n = 1;
		
		a[0] = new int[5];
		a[1] = new int[2];
		a[2] = new int[10];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = n++;
			}
		}
		
		for(int []arr:a) {
			for(int data:arr) {
				System.out.printf("%5d", data);
			}
			System.out.println();
		}
	}
}
