package gui;

import java.awt.*;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GamePanel gamePanel = new GamePanel();
	
	public MainFrame() {
		super("Game Of Life"); 	// 타이틀명
		
		setLayout(new BorderLayout()); 			// 레이아웃 구역 설정
		add(gamePanel, BorderLayout.CENTER); 	// 게임 패널을 가운데 위치
		
		
		setSize(1200, 1200); 		// 창 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 // 창을 닫을 때 바로 프로그램을 종료
		setVisible(true); 		// 보이게 설정.
		
	}

}
