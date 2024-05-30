package com.kosta.exam03;

import java.util.Random;

//난수연습
//사람들 중에서 무작위로 한명을 뽑아서 그 사람 이름을 출력하는
//프로그램을 작성.
public class RandomName {

	public static void main(String[] args) {
		Random r = new Random();
		String []data = {"변시우", "임유나","홍석영","조영흔","유요한","이동준","박성빈",
						"박준수","김예은","이제원","장동건","최모래","최가은","박규희",
						"공희상"};
		
		int n = r.nextInt(data.length);
		String name="";
		for(int i=0; i<100; i++) {
			name = data[i%data.length];
			System.out.print(name);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("*** 당첨자 ***");
		System.out.println(data[n]);
		
	}

}
