
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket();
			InetAddress addr = InetAddress.getByName(args[0]);
			int port = 9002;
			byte []data = args[1].getBytes();
			DatagramPacket packet = 
					new DatagramPacket(data, data.length, addr, port);
			socket.send(packet);
			socket.close();
			
		} catch (Exception e) {
			System.out.println("예외 발생:"+e.getMessage());
		}
		
	}
}
