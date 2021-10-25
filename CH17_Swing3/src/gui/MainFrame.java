package gui;

import java.awt.BorderLayout;


import javax.swing.JFrame;



public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) {
		super(title); // JFrame�� Ÿ��Ʋ�� �����ϵ��� ��
		
		final MainPanel mainPanel = new MainPanel();
		// mainPanel.setBackground(color.RED);
		
		setLayout(new BorderLayout());
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
		
		
		setSize(600, 400); 		// â ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ���� �� �ٷ� ���α׷��� ����
		setVisible(true); 		// ���̰� ����.
	}
	
}













