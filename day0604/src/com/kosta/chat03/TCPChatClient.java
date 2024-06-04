package com.kosta.chat03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TCPChatClient extends JFrame {
	JTextArea jta;
	JTextField jtf;
	
	//맴버변수로 Socket과 입출력을 위한 스트림을 선언
	Socket socket;
	InputStream is;
	OutputStream os;
	
	public TCPChatClient() {
		try {
			
			//1. Server와 통신하기 위한 소켓을 생성한다.
			socket = new Socket("172.30.1.63", 9003);
			//2. 생성된 소켓을 통해 스트림을 생성한다.
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			jta = new JTextArea();
			jtf = new JTextField(50);
			JScrollPane jsp = new JScrollPane(jta);
			JButton btnSend = new JButton("전송");
			JPanel p = new JPanel();
			
			p.setLayout(new BorderLayout());
			p.add(jtf, BorderLayout.CENTER);
			p.add(btnSend, BorderLayout.EAST);
			add(jsp, BorderLayout.CENTER);
			add(p, BorderLayout.SOUTH);
			
			setSize(400,450);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//서버로 부터 수신된 데이터를 계속하여 받기 위한 쓰레드를 만든다.
			class ClientThread extends Thread{
				byte []data = new byte[100];
				public void run() {
					while(true) {
						try {
							is.read(data);
							jta.append(new String(data)+"\n");
							Arrays.fill(data, (byte)0);
						} catch (Exception e) {
							System.out.println("예외발생: "+e.getMessage());
						}
					}
				}
			}
			
			ClientThread ct = new ClientThread();
			ct.start();
			
			// 전송 버튼을 눌렀을때 서버로 텍스트를 전달하는 이벤트 연결
			btnSend.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//텍스트필드에 써진 글자를 바이트 배열로 갖고 온다.
					byte []data = jtf.getText().getBytes();
					try {
						os.write(data);
					} catch (Exception e1) {
						System.out.println("예외발생: "+e1.getMessage());
					}
				}
			});
			
		
			
		} catch (Exception e) {
			System.out.println("예외 발생: "+e.getMessage());
		
		}
		
	}
	public static void main(String[] args) {
		new TCPChatClient();
		
	}
}
