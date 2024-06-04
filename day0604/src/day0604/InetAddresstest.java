package day0604;

import java.net.*;

public class InetAddresstest {

	public static void main(String[] args) {
		try{
//			InetAddress addr = Inet4Address.getByName("www.naver.com");
			InetAddress []arr = Inet4Address.getAllByName("www.naver.com");
			for(InetAddress addr :arr) {
				System.out.println(addr);
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		

	}

}
