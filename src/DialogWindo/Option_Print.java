package DialogWindo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Option_Print {

	public static void main(String[] args) {
		
		ImageIcon icon = new ImageIcon("hello.png");
		JOptionPane.showMessageDialog(null, "Enter correct passwort","Title",JOptionPane.PLAIN_MESSAGE,icon);

	}

}
