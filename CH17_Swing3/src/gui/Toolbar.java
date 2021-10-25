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
		System.out.println("¹öÆ°ÀÌ Å¬¸¯!");
		colorChanger.changColor(color);
	}
	
}

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;
	
	
	public Toolbar(ColorChangeListener colorChanger) {
		
		final JButton redButton = new JButton("ÁÂ±òÂ¦");
		final JButton blueButton = new JButton("¿ì±òÂ¦");
		
		redButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorChanger.changColor(Color.PINK);  // ¸¶¿ì½º Å¬¸¯ ½Ã ½ÇÇà
			}
			
		});
		
		// ¶÷´Ù½Ä
		blueButton.addActionListener(e->colorChanger.changColor(Color.cyan));
			
		
		
		add(redButton);
		add(blueButton);
		
	}
	
	


}
