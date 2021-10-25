package gui;

import java.awt.BorderLayout;


import javax.swing.JFrame;



public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) {
		super(title); // JFrame의 타이틀을 생성하도록 함
		
		final MainPanel mainPanel = new MainPanel();
		// mainPanel.setBackground(color.RED);
		
		setLayout(new BorderLayout());
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
		
		
		setSize(600, 400); 		// 창 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을 때 바로 프로그램을 종료
		setVisible(true); 		// 보이게 설정.
	}
	
}













