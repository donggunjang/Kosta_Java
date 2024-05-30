package com.kosta.exam01;

class Person extends Thread{
    private String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(name+"이 밥을 먹어요 ==> "+(i+1));
            try{
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}