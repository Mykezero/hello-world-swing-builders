

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.javabuilders.swing.SwingJavaBuilder;

public class Main 
{
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(() -> 
		{
			SwingJavaBuilder.getConfig().addResourceBundle("View");
			Controller view = new Controller();				
			try 
			{
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				view.setVisible(true);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		});
	}
}