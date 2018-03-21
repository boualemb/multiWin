package gui;


import javax.swing.JFrame;

public class secWin extends JFrame{

	public secWin (mainPan pn)
	{
		secPan jp = new secPan(pn);
		this.setContentPane(jp);
		this.setTitle("Commande");
		this.setSize(300, 60);
		this.setVisible(true);
	}

}
