package jsp_ch14;

public class ChatProtocol3 {

	public static final String ID = "ID";
	//클라이언트가 서버로부터 <ID:aaa;1234;> 이렇게 보냄.
	//서버는 클라이언트에게 CHATLIST:aaa;bbb;ccc;ddd; 이렇게 보냄.
	
	public static final String CHAT = "CHAT";
	//클라이언트가 서버에게 CHAT:받는아이디;채팅메세지 ex)CHAT:bbb;밥먹자
	//서버가 클라이언트에게 CHAT:받는아이디;채팅메세지 ex)CHAT:aaa;밥먹자
	
	public static final String CHATALL = "CHATALL";
	//클라이언트가 서버에게 CHATALL:채팅메세지 
	//서버가 클라이언트에게 CHATALL:[보내는아이디]채팅메세지
	
	public static final String MESSAGE = "MESSAGE";
	//클라이언트가 서버에게 MESSAGE:받는아이디;쪽지 ex)MESSEGE;bbb;밥먹자 
	//서버가 클라이언트에게 MESSAGE:보내는아이디;쪽지 ex)MESSEGE;aaa;밥먹자 
	
	public static final String CHATLIST = "CHATLIST";
	//클라이언트가 서버에게 CHATLIST:aaa;bbb;ccc;ddd 
	
	
	
}
