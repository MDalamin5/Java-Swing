package FrameDemo;

import javax.swing.JFrame;

public class JFrame2 extends JFrame{
	
	JFrame2(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,500,300,300);
		setTitle("Welcome");
		setResizable(false);
		
	}

	public static void main(String[] args) {
		
		JFrame2 frame = new JFrame2();
		
		frame.setVisible(true);
		
	}

}
