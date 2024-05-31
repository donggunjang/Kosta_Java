package com.kosta.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("장동건", "010-1234-1111");
		map.put("이동국", "010-1234-2222");
		map.put("손흥민", "010-1234-3333");
		map.put("박지성", "010-1234-4444");

		System.out.println(map);
		
		//Map의 모든 키를 가지고 옵니다.
		Set<String> keyList = map.keySet();
		
		Iterator<String> iter = keyList.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key+" 전화번호:"+map.get(key));
		}
	}
	
}
