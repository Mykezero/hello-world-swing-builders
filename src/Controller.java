import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.codehaus.janino.Java.LabeledStatement;
import org.javabuilders.BuildResult;
import org.javabuilders.swing.SwingJavaBuilder;

public class Controller extends JFrame
{
	private BuildResult result;
	private Model model;
	private JLabel lblStatus;
	
	public Controller() 
	{
		model = new Model();
		result = SwingJavaBuilder.build(this);
	}
	
	public Model getModel() 
	{
		return model;
	}
	
	public void login()
	{
		String password = model.getPassword();
		
		if(password.equals("password"))
		{
			lblStatus.setText("Correct password");
		}
		else
		{
			lblStatus.setText("Incorrect password");
		}		
	}
}
