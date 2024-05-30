package com.kosta.exam03;

import java.util.ArrayList;
import java.util.List;

public class MapTest {
	public static void main(String[] args) {
		//어떤 사람의 이름, 주소, 전화번호를 리스트에 담아 보자.'
		List<String> data = new ArrayList<String>();
		
		data.add("홍길동");
		data.add("서울시 종로구 종로2가");
		data.add("010-1111-1111");
		
		String addr= data.get(2);
		//위의 코드의 경우 이 사람의 전화번호를 가지고 오려면
		//전화번호가 1번째 인덱스라는 것을 알아야 한다.
		//이것은 때에 따라 헛갈릴 수 있다.
		//각 요소의 데이터를 어떤 의미를 가지고 있을때
		//인덱스로 접근하는 방식 보다는 의미있는 Key로 데이터에 접근
		//하도록 하는 방법이 더 직관적이다.
		//이럴때 사용하는 것이 Map이다.
	}
}
