package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) {
		super(title); // JFrame의 타이틀을 생성하도록 함
		
		setLayout(new BorderLayout()); 	   			// 메인프레임창에 컴포넌트를 붙이기 위함.
		add(new Toolbar(), BorderLayout.NORTH);		// 메인프레임 창에 버튼 생성.
		add(new MainPanel(), BorderLayout.CENTER);  // 메인프레임에 붙이기(중앙 가운데 위치)
		
		setSize(600, 400); // 창 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을 때 바로 프로그램을 종료
		setVisible(true); 		// 보이게 설정.
		
	}
	
}













