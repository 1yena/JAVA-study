package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ColorListener implements ActionListener {
	private ColorChangeListener colorChanger;
	private Color color;
	
	public ColorListener(ColorChangeListener colorChanger, Color color) {
		this.colorChanger = colorChanger;
		this.color = color;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 클릭!");
		colorChanger.changColor(color);
	}
	
}

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;
	
	
	public Toolbar(ColorChangeListener colorChanger) {
		
		final JButton redButton = new JButton("좌깔짝");
		final JButton blueButton = new JButton("우깔짝");
		
		redButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorChanger.changColor(Color.PINK);  // 마우스 클릭 시 실행
			}
			
		});
		
		// 람다식
		blueButton.addActionListener(e->colorChanger.changColor(Color.cyan));
			
		
		
		add(redButton);
		add(blueButton);
		
	}
	
	


}
