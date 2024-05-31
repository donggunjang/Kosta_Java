package com.kosta.exam01;

import java.util.HashSet;
import java.util.Iterator;


public class SetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("사과");
		set.add("수박");
		set.add("딸기");
		set.add("오렌지");
		
		System.out.println(set);
		
		//Set자체에는 반복 실행할 수 있는 기능이 없다
		//Iterator 반복자
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String row = iter.next();
			System.out.println(row);
		}
	}

}
