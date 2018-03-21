package gui;

import javax.swing.JFrame;

public class mainWin extends JFrame {
	mainPan mP;
	public mainWin()
	{
		this.setSize(600, 600);
		this.setTitle("Multi Windows");
		this.setVisible(true);
		mP= new mainPan ();
		this.getContentPane().add(mP);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainWin mW = new mainWin();
		secWin sw = new secWin(mW.mP);
	}

}
