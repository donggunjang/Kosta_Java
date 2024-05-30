package com.kosta.exam01;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("P");
        Person p1 = new Person("P1");
        Person p2 = new Person("P2");

        p.setPriority(Thread.NORM_PRIORITY);
        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);

        p.start();
        p1.start();
        p2.start();
        
      
    }
}