package ShowInput;

import javax.swing.JOptionPane;

public class Test2 {
	public static void main(String[] args) {
		
		String f_name = JOptionPane.showInputDialog(null,"Enter your Father name: ", "Its a Title",JOptionPane.QUESTION_MESSAGE);
		String l_name = JOptionPane.showInputDialog(null,"And Last name Enter please","Last name",JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(null,"Your Father name is: " +f_name +" "+l_name);
	}
}
