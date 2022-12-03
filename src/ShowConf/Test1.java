package ShowConf;
import javax.swing.JOptionPane;
public class Test1 {

	public static void main(String[] args) {
		
		int choice=JOptionPane.showConfirmDialog(null, "Do you want to quit?","Title",JOptionPane.YES_NO_OPTION);
		
		if(choice==JOptionPane.YES_OPTION)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("You select No Option");
		}
	}

}
