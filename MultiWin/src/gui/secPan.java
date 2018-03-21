package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class secPan extends JPanel implements ActionListener {
	private mainPan mP;
	private JButton bt1;
	private JButton bt2;
	secPan(mainPan pn)
	{
		mP= pn;
		
		bt1 = new JButton ("Noire");
		bt2 = new JButton ("Gris");
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		this.add(bt1);
		this.add(bt2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.bt1)
		{
			this.mP.setBgColor(Color.BLACK);
		}
		if (e.getSource() == this.bt2)
		{
			this.mP.setBgColor(Color.GRAY);
		}
	}

}
