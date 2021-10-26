package gui;

import java.awt.*;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GamePanel gamePanel = new GamePanel();
	
	public MainFrame() {
		super("Game Of Life"); 	// Ÿ��Ʋ��
		
		setLayout(new BorderLayout()); 			// ���̾ƿ� ���� ����
		add(gamePanel, BorderLayout.CENTER); 	// ���� �г��� ��� ��ġ
		
		
		setSize(1200, 1200); 		// â ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 // â�� ���� �� �ٷ� ���α׷��� ����
		setVisible(true); 		// ���̰� ����.
		
	}

}
