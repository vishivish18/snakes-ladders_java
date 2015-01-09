import java.awt.Color;
import java.awt.Container;
import javax.swing.*;




public class WelcomeScreen 
{
	JFrame screen;
	JLabel back;
	
	public WelcomeScreen()
	{
		
		screen= new JFrame("");
		back= new JLabel(new ImageIcon("images//d.png"));
		
	}
	

	
	public void init()
	{
	Container c = screen.getContentPane();
	c.setBackground(Color.white);
	screen.setLayout(null);
	screen.setVisible(true);
	screen.setSize(1366,720);
	screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	c.add(back);
	back.setBounds(0,0,1336,768);
	
	
	
	}

	
	public static void main(String args[])
	{
	
		WelcomeScreen ws = new WelcomeScreen();
		ws.init();
		
	}
	
	
	
	}
