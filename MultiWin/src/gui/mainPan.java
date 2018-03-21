package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class mainPan extends JPanel {
	public Color bgclr = Color.GRAY;
	public mainPan ()
	{
		
	}
	public void setBgColor(Color cr)
	{
		this.bgclr = cr;
		this.repaint();
	}
	@Override
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(bgclr);
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
	}

}
