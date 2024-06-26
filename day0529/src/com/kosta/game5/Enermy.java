package com.kosta.game5;

import java.util.Random;

public class Enermy extends GraphicObject {
	
	//Enermy를 가로방향으로 왔다 갔다 하도록 한다.
	//맨처음 이동거리를 -10으로 설정하여 왼쪽으로 10만큼 이동.
	Random r = new Random();
	private int dx = -10;
	
	// 적으로 사용할 이미지 파일명을 매개 변수로 전달 받는다
	public Enermy(String name) {
		//부모 클래스 생성자에 전달
		super(name);
		//Enermy의 초기 위치를 500, 0으로 설정.
		x = r.nextInt(2)*500;
		y = 10;
	}

	@Override
	public void update() {
		x += dx;
		if(x<0) { //Enermy가 왼쪽 끝에 도착하면 다시 오른쪽으로 이동
			dx = +10;
		}
		if(x>500) { //Enermy가 오르쪽 끝에 도착하면 다시 왼쪽으로 이동
			dx = -10;
		}
	}
	
}
