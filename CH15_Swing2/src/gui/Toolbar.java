package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ColorListener implements ActionListener {
	private MainPanel mainPanel;
	private Color color;
	
	public ColorListener(MainPanel mainPanel, Color color) {
		this.mainPanel = mainPanel;
		this.color = color;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư�� Ŭ��!");
		mainPanel.setBackground(color);
	}
	
}

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;
	
	
	public Toolbar(MainPanel mainPanel) {
		
		final JButton redButton = new JButton("�±�¦");
		final JButton blueButton = new JButton("���¦");
		
		redButton.addActionListener(new ColorListener(mainPanel, Color.pink));
		blueButton.addActionListener(new ColorListener(mainPanel, Color.cyan));
		
		add(redButton);
		add(blueButton);
		
	}
	
	


}
