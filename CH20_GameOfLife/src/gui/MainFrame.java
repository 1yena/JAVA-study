package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;


public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GamePanel gamePanel = new GamePanel();
	
	public MainFrame() {
		super("Game Of Life"); 	// 타이틀명
		
		setLayout(new BorderLayout()); 			// 레이아웃 구역 설정
		add(gamePanel, BorderLayout.CENTER); 	// 게임 패널을 가운데 위치
		
		
		addKeyListener(new KeyAdapter() {			// 키 이벤트를 대기하면서 발생 시 아래 코드 실행
			public void keyPressed(KeyEvent e) {	// 키보드를 키를 눌렀을 때
//				System.out.println("키 눌렀음");
				int code = e.getKeyCode();			// 어떤 키를 눌렀는지 키의 종류를 숫자로 저장
				switch (code) {		// 숫자값에 따라 출력.
				case 32:
//					System.out.println("스페이스바");
					gamePanel.next();
					break;
				case 8:
//					System.out.println("백 스페이스바");
					gamePanel.clear();
					break;
				case 10:
//					System.out.println("엔터");
					gamePanel.randomize();
					break;

				}
				
			}
			
		}); 
		
		
		setSize(1200, 800); 		// 창 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 // 창을 닫을 때 바로 프로그램을 종료
		setVisible(true); 		// 보이게 설정.
		
	}

}
