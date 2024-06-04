import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient01 {

	public static void main(String[] args) {
		try {
			//서버에게 요청
			Socket socket = new Socket("172.30.1.63", 9001);
			InputStream is = socket.getInputStream();
			for(int i=1; i<=10; i++) {
				System.out.println("서버로부터 수신된 데이터: "+is.read());
			}
			
			is.close();
			socket.close();
		}catch(Exception e) {
			System.out.println("예외 발생"+e.getMessage());
		}
	}

}
