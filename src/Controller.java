import javax.swing.JFrame;
import javax.swing.JLabel;
import org.javabuilders.swing.SwingJavaBuilder;

public class Controller extends JFrame
{
	private static final long serialVersionUID = -339810386438853857L;
	private Model model;
	private JLabel lblStatus;
	
	public Controller() 
	{
		model = new Model();
		SwingJavaBuilder.build(this);		
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
