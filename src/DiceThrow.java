import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DiceThrow extends JFrame implements ActionListener 
{
	
	JFrame check;
	JButton b;
	int p1=0,p2=0,p3=0,p4=0;
	int count=1;
	String p1status,p2status,p3status,p4status;
	String dicevalue;
	DisplayBox db = new DisplayBox();
	public DiceThrow()
	{
		check = new JFrame("CHECK");
		b = new JButton("Throw");	
	}
	
	public void init()
	{
		Container c = check.getContentPane();
		c.setBackground(Color.white);
		check.setLayout(null);
		check.setVisible(true);
		check.setSize(300,300);
		check.setDefaultCloseOperation(EXIT_ON_CLOSE);
		check.add(b);
		b.setBounds(0,0,300,100);
		b.addActionListener(this);
		
	}
	
	
	public int rand(int ran)
	{
		 	int maximum=6;
	        int minimum=1;
	        
	        int randomNum; 
	        randomNum=minimum + (int)(Math.random() * ((maximum - minimum) + 1));
			System.out.println(randomNum);
			
			dicevalue="Dice comes "+randomNum+"\n";
			
			System.out.println("Dice comes"+randomNum);
			ran=ran+randomNum;
			
			return ran;
	}
	
	
	public static void main(String [] args)
	{
		DiceThrow dt = new DiceThrow();
		dt.init();
		
		//System.out.println
		
		
	}

	public String toString()
	{
		return dicevalue;
		
		
	}
	
	
	public void actionPerformed(ActionEvent a) 
	{
		if(a.getSource()==b)
		{
			if(count==1)
			{	
				System.out.println("Chance of player 1");
				
				p1=rand(p1);
				
				System.out.println("Values of p1 p2 p3 p4 are:"+p1+","+p2+","+p3+","+p4);
				p1status="In here Values of p1 p2 p3 p4 are:"+p1+","+p2+","+p3+","+p4;
				count=2;
				returnStatus(p1status);
				
			}
			else if(count==2)
			{	
				System.out.println("Chance of player 2");
				p2=rand(p2);
				System.out.println("Values of p1 p2 p3 p4 are:"+p1+","+p2+","+p3+","+p4);
				count=3;
			}
			else if(count==3)
			{	
				 System.out.println("Chance of player 3");
				 p3=rand(p3);
				 System.out.println("Values of p1 p2 p3 p4 are:"+p1+","+p2+","+p3+","+p4);
				 count=4;
			}
			else if(count==4)
			{	
				System.out.println("Chance of player 4");
				 p4=rand(p4);
				 System.out.println("Values of p1 p2 p3 p4 are:"+p1+","+p2+","+p3+","+p4);
				 count=1;
			}
		}
	
		
		
		
	}
	
	public String returnStatus(String status)
	{
		System.out.println("uhooo"+status); 
		return status; 
		
	}
	
	

}
