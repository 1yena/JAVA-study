package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) {
		super(title); // JFrame�� Ÿ��Ʋ�� �����ϵ��� ��
		
		setLayout(new BorderLayout()); 	   			// ����������â�� ������Ʈ�� ���̱� ����.
		add(new Toolbar(), BorderLayout.NORTH);		// ���������� â�� ��ư ����.
		add(new MainPanel(), BorderLayout.CENTER);  // ���������ӿ� ���̱�(�߾� ��� ��ġ)
		
		setSize(600, 400); // â ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ���� �� �ٷ� ���α׷��� ����
		setVisible(true); 		// ���̰� ����.
		
	}
	
}













