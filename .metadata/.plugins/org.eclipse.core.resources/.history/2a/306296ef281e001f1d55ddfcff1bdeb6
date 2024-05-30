package com.kosta.exam04;

public class TVARSTest {

	public static void main(String[] args) {
		//모금액을 위한 Account 객체를 생성
		Account account = new Account();
		
		//성금자의 이름과 모금액을 위한 account 객체를
		//매개변수로 하여 5명의 성금자 객체를 생성
		Person p1 = new Person("성금자1", account);
		Person p2 = new Person("성금자2", account);
		Person p3 = new Person("성금자3", account);
		Person p4 = new Person("성금자4", account);
		Person p5 = new Person("성금자5", account);
		
		//5명의 성금자가
		//경쟁적으로 입금을 하기 위하여 쓰레드를 가동시킨다.
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		
		try {
			p1.join();
			p2.join();
			p3.join();
			p4.join();
			p5.join();
		}catch(Exception e) {
			
		}
		//전체모금액을 출력한다.
		System.out.println("전체모금액:"+account.getBalance());
	}

}
/*
성금자5의9번째 입금
성금자2의9번째 입금
성금자1의9번째 입금
성금자3의9번째 입금
성금자4의10번째 입금
성금자5의10번째 입금
성금자2의10번째 입금
성금자1의10번째 입금
성금자3의10번째 입금
전체모금액:46000		<----- 금액이 맞지 않음

5명이 1000원씩 10번  입금하여
50000원이 되어야 합니다.

공유자원에 두개이상의 쓰레드가 한번에 접근해서
이런현상이 일어납니다.

한번에 하나의 쓰레드에게만
접근을 허용하려면
"임계영역"을 성정해야 합니다.

자바에서는 임계영역 설정을 하기 위해
메소드 이름 앞에 synchronized 키워드를 붙여줍니다.
 */ 
