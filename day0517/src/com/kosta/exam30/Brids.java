package com.kosta.exam30;

public class Brids {
	private String name;
	private int length;
	private int weight;
//	static int distance;
//	static int high;
//	static String space;
	
	
//	public static int getDistance() {
//		return distance;
//	}
//	public static void setDistance(int distance) {
//		Brids.distance = distance;
//	}
//	
//	public static int getHigh() {
//		return high;
//	}
//	public static void setHigh(int high) {
//		Brids.high = high;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Brids(String name, int length, int weight) {
		this.name = name;
		this.length = length;
		this.weight = weight;
	}
	public Brids() {
		
	}
	
	@Override
	public String toString() {
		return "Brids [name=" + name + ", length=" + length + "cm, weight=" + weight + "g]";
	}
	
	public void printWings() {
		System.out.println(name+"가 날개짓을 시작했습니다.");
	}
	
	public void printFly(int distance, int high) {
		System.out.println(name+"가 "+high+"m상공에서 "+distance+"m만큼 비행을 했습니다.");
	}
	
	public void printLanding(int high, String space) {
		System.out.println(name+"가 "+high+"m상공에서 "+space+"로 착지 했습니다.");
	}
	
}
