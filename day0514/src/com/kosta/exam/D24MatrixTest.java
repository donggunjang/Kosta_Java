package com.kosta.exam;
/*
  	  0 1 2
  	0 [][][]
  	1 [][][]
  	2 [][][]
  	3 [][][]
 */
public class D24MatrixTest {

	public static void main(String[] args) {
		
		int [][]a = new int[4][3];
		//각 배열의 요소에 1부터 1씩 증가한 값을 차례로 저장
		
		int n=1;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = n++;
			}
		}
		for(int i=0; i<a.length; i++) {
			for(int j=0; j < a[i].length; j++) {
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
	}

}
