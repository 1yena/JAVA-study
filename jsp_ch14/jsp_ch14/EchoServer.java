package jsp_ch14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	
	public EchoServer() {
		
		//java.io, java.net, java.sql 거의 예외 가능성이 있는 생성자 또는 메소드임.
		try {
			int port = 8000;
			int cnt = 0; //클라이언트(Client)의 접속 개수를 카운트함.
			ServerSocket server = new ServerSocket(port);
			System.out.println("ServerSocket Start.......");
			while(true) {
				//클라이언트가 접속할 때까지 대기상태가 됨.
				Socket sock = server.accept();	//wait
				EchoThread et = new EchoThread(sock);
				et.start();	//결론적으로 run 메소드 호출.
				cnt++;
				System.out.println("Client" + cnt + "Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//내부클래스로 클라이언트의 대응을 각각 하기 위해 Thread 기능의 클래스 생성.
	//클라이언트 담당은 Thread로 만들어야 한다.(내부클래스)
	class EchoThread extends Thread {
		
		Socket sock;
		BufferedReader in;	//클라이언트가 보내는 메세지 받는 스트림
		PrintWriter out;	//클라이언트로 메세지 보내는 스트림
		
		public EchoThread(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(
					 new InputStreamReader(
						 sock.getInputStream()));
				out = new PrintWriter(
					  sock.getOutputStream(), true/*auto flush*/);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		@Override
		public void run() {
			try {
				//클라이언트가 접속하면 처음으로 받는 메세지
				out.println("Hello Enter BYB to exit");
				while (true) {
					//클라이언트가 메세지 보낼 때까지 대기
					String line = in.readLine();
					if(line==null) {//클라이언트가 접속을 끊을 때
						break;	//while문 탈출						
					} else {
						//클라이언트에서 온 메세지 앞에 Echo 붙여서 반사
						out.println("Echo: " + line);
						if(line.equalsIgnoreCase("BYB")) {
							break;
						}
					}
				} //while
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new EchoServer();

	}

}












