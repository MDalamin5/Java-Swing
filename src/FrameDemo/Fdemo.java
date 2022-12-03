package FrameDemo;
import javax.swing.JFrame;
public class Fdemo {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(400,300);
		//frame.setLocationRelativeTo(null);
		//frame.setLocation(300,50);
		frame.setBounds(400,250,500,500);
		frame.setTitle("Welcome to java Programe");
		frame.setResizable(false);

	}

}
