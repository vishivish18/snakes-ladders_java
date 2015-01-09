import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DisplayBox extends JFrame implements ActionListener  
{

	JFrame disp;
	JLabel bck;
	JLabel bcknum[]= new JLabel[100];
	int j=100;
	JPanel controls,scoreboard;
	JLabel blue,red,green,yellow;
	JLabel mBlue,mRed,mGreen,mYellow;
	JButton dice;
	JTextArea console;
	JScrollPane sp;
	int originalValue;
	
	int p1=0,p2=0,p3=0,p4=0;
	int count=1;
	int flag=0;
	
	JLabel bplayer,rplayer,gplayer,yplayer;
	Container c;
	
	public DisplayBox()
	{
		
	disp = new JFrame("Snakes & Ladders");
	controls= new JPanel();
	bck = new JLabel(new ImageIcon("images//a.png"));
	blue = new JLabel(new ImageIcon("images//blue.png"));
	red= new JLabel(new ImageIcon("images//red.png"));
	green= new JLabel(new ImageIcon("images//green.png"));
	yellow= new JLabel(new ImageIcon("images//yellow.png"));
	
	mBlue = new JLabel(new ImageIcon("images//blue.png"));
	mRed= new JLabel(new ImageIcon("images//red.png"));
	mGreen= new JLabel(new ImageIcon("images//green.png"));
	mYellow= new JLabel(new ImageIcon("images//yellow.png"));
	
	
	dice = new JButton("Throw Dice");
	bplayer= new JLabel("Player 1");
	rplayer= new JLabel("Player 2");
	gplayer= new JLabel("Player 3");
	yplayer= new JLabel("Player 4");
	console = new JTextArea(20,25);
	sp = new JScrollPane(console);
	
	
	//l1 = new JButton[100];
	}
	public void init()
	{
	c = disp.getContentPane();
	c.setBackground(Color.white);
	disp.setLayout(null);
	disp.setVisible(true);
	disp.setSize(1366,720);
	disp.setDefaultCloseOperation(EXIT_ON_CLOSE);
	/*for(int i=0;i<100;i++)
	{	
		bcknum[i]=new JLabel(""+(j));
		disp.add(bcknum[i]);
		j--;
		
		
	}*/
	disp.add(blue);
	blue.setBounds(10,30,23,23);
	disp.add(bplayer);
	bplayer.setBounds(65,25,100,30);
	
	disp.add(red);
	red.setBounds(10,60,23,23);
	disp.add(rplayer);
	rplayer.setBounds(65,55,100,30);
	
	
	disp.add(green);
	green.setBounds(10,90,23,23);
	disp.add(gplayer);
	gplayer.setBounds(65,85,100,30);
	
	
	disp.add(yellow);
	yellow.setBounds(10,120,23,23);
	disp.add(yplayer);
	yplayer.setBounds(65,115,100,30);
	
	disp.add(mBlue);
	disp.add(mRed);
	disp.add(mGreen);
	disp.add(mYellow);
	
	
	disp.add(bck);
	bck.setBounds(200,0,665,668);
	
	disp.add(controls);
	controls.setBounds(1050,0,300,720);
	controls.setBackground(Color.white);
	
	//controls.add(console);
	//console.setBounds(0,0,100,200);
	//console.setBackground(Color.CYAN);
	//console.setEditable(false);
	controls.add(sp);
	sp. setVerticalScrollBarPolicy( JScrollPane. VERTICAL_SCROLLBAR_ALWAYS );
	controls.add(dice);
	dice.setBounds(0,0,100,20);
	dice.addActionListener(this);
	
	
	}
	

	public static void main(String [] args)
	{
		
		DisplayBox db = new DisplayBox();
		db.init();
		
	}
	
	
	
	public int Snakes(int psnakes,int player)
	{
		
		if(psnakes==24)
		{
			console.append("\nPlayer"+player+" You Got Bitten by Snake...Tough Luck!!");
			psnakes=1;
			count=player;
		}
		else if(psnakes==55)
		{
			console.append("\nPlayer"+player+" You Got Bitten by Snake...Tough Luck!!");
			psnakes=13;
			count=player;
		}
		else if(psnakes==71)
		{
			console.append("\nPlayer"+player+" You Got Bitten by Snake...Tough Luck!!");
			psnakes=29;
			count=player;
		}
		else if(psnakes==88)
		{
			console.append("\nPlayer"+player+" You Got Bitten by Snake...Tough Luck!!");
			psnakes=67;
			count=player;
		}
		
		else if(psnakes==99)
		{
			console.append("\nPlayer"+player+" You Got Bitten by Snake...Tough Luck!!");
			psnakes=6;
			count=player;
		}
		
	
		return psnakes;
		
	}
	
	public int Ladders(int pladder,int player)
	{
		if(pladder==8)
		{
			console.append("\nPlayer"+player+" You Got A Ladder... Throw Again");
			pladder=31;
			count=player;
		}
		else if(pladder==15)
		{
			console.append("\nPlayer"+player+" You Got A Ladder... Throw Again");
			pladder=97;
			count=player;
		}
		else if(pladder==42)
		{
			console.append("\nPlayer"+player+" You Got A Ladder... Throw Again");
			pladder=81;
			count=player;
		}
		else if(pladder==66)
		{
			console.append("\nPlayer"+player+" You Got A Ladder... Throw Again");
			pladder=87;
			count=player;
		}
		
		
		
		return pladder;
		
	}
	
	
	public void movePlayers(int mplayer,JLabel choice,int xpaxis,int xnaxis)
	{
		
			if(mplayer<=10)
			{
					if(mplayer!=8)
					{
						choice.setBounds(xpaxis+(67*mplayer),620,23,23);
					}
					else
					{
						
						choice.setBounds(xpaxis+536,620,23,23); 
						
						//for(int w=0;w<999999999;w++);
						choice.setBounds(xpaxis+670,425,23,23);
						disp.validate();
						disp.repaint();
						
						
					}

			
			}
		
			else if(mplayer>10 &&mplayer<=20)
			{
				
				if(mplayer!=15)
				{	
				mplayer=mplayer-10;
				choice.setBounds(xnaxis-(mplayer*67),555,23,23);
				}
				else
				{
				choice.setBounds(xpaxis+268,35,23,23);	
				
				}
				
			}
			
			else if(mplayer>20 &&mplayer<=30)
			{
				
				if(mplayer!=24)
				{	
				mplayer=mplayer-20;
				choice.setBounds(xpaxis+(67*mplayer),490,23,23);
				}
				else
				{
				choice.setBounds(xpaxis+67,620,23,23);	
				
				}
				
			}
			else if(mplayer>30 &&mplayer<=40)
			{
				
				mplayer=mplayer-30;
				choice.setBounds(xnaxis-(67*mplayer),425,23,23);
				
				
			}
			
			else if(mplayer>40 &&mplayer<=50)
			{
				
				if(mplayer!=42)
				{	
				mplayer=mplayer-40;
				choice.setBounds(xpaxis+(67*mplayer),360,23,23);
				}
				else
				{
				choice.setBounds(xpaxis+67,100,23,23);	
				
				}
				
			}
			else if(mplayer>50 &&mplayer<=60)
			{
				
				if(mplayer!=55)
				{	
				mplayer=mplayer-50;
				choice.setBounds(xnaxis-(67*mplayer),295,23,23);
				}
				else
				{
					choice.setBounds(xnaxis-(67*3),555,23,23);	
				
				}
				
			}
		
			else if(mplayer>60 &&mplayer<=70)
			{
				
				if(mplayer!=66)
				{	
				mplayer=mplayer-60;
				choice.setBounds(xpaxis+(67*mplayer),230,23,23);
				}
				else
				{
					choice.setBounds(xpaxis+(67*7),100,23,23);	
				
				}
				
			}
		
			else if(mplayer>70 &&mplayer<=80)
			{
				
				mplayer=mplayer-70;
				choice.setBounds(xnaxis-(67*mplayer),165,23,23);
				
				
			}
			
			else if(mplayer>80 &&mplayer<=90)
			{
				
				if(mplayer!=88)
				{	
				mplayer=mplayer-80;
				choice.setBounds(xpaxis+(67*mplayer),100,23,23);
				}
				else
				{
					choice.setBounds(xpaxis+(67*7),230,23,23);	
				
				}
				
			}
			
			else if(mplayer>90 &&mplayer<100)
			{
				
				if(mplayer!=99)
				{	
				mplayer=mplayer-90;
				choice.setBounds(xnaxis-(67*mplayer),35,23,23);
				}
				else
				{
					choice.setBounds(xpaxis+(67*6),620,23,23);	
				
				}
				
			}
			
			
		
		/*
		else if(player==2)
		{	
		mRed.setBounds(232,620,23,23);
		}
		else if(player==3)
		{	
		mGreen.setBounds(204,645,23,23);
		}
		
		else if(player==4)
		{	
		mYellow.setBounds(232,645,23,23);
		}
		*/
		
	}
	
	public void actionPerformed(ActionEvent a) 
	{
		DiceThrow dt = new DiceThrow();
		if(a.getSource()==dice)
		{
			
		if(count==1)
			{	
				
				console.append("Chance of player 1\n");
				originalValue=p1;
				
				p1=dt.rand(p1);
				if(p1==100)
				{
					console.append(dt.toString());
					JOptionPane.showMessageDialog(null,"Player 1 is the Winner !!!!!!!!!!!!!!");
					console.setText("");
					p1=0;
					p2=0;
					p3=0;
					p4=0;
					
					
				}
				
				else if(p1>100)
				{
					console.append(dt.toString());
					console.append("You Got more than 100!!\nYou can't move\nWait for next chance\n");
					p1=originalValue;
					console.append("Values of p1 p2 p3 p4 are:"+p1+","+p2+","+p3+","+p4+"\n");
					count=2;
				}
				else
				{	
				console.append(dt.toString());
		
				console.append("Values of p1 p2 p3 p4 are:"+p1+","+p2+","+p3+","+p4+"\n");
				movePlayers(p1,mBlue,134,871);
				
					if(p1==8 || p1 ==15 || p1==42 || p1==66)
					{
						
						p1=Ladders(p1,1);
						console.append("\nAfter ladder Values of p1 p2 p3 p4 are:\n"+p1+","+p2+","+p3+","+p4+"\n");
						
					}
					else if(p1==24 || p1 ==55 || p1==71 || p1==88 || p1==99)
					{
						
						p1=Snakes(p1,1);
						console.append("\nAfter Snake BiteValues of p1 p2 p3 p4 are:\n"+p1+","+p2+","+p3+","+p4+"\n");
						count=2;
					}
					else
					{
						count=2;
					}	
				}
			}
		  else if(count==2)
			{	
				
			  	console.append("Chance of player 2\n");
				originalValue=p2;
				
				p2=dt.rand(p2);
				if(p2==100)
				{
					console.append(dt.toString());
					JOptionPane.showMessageDialog(null,"Player 2 is the Winner !!!!!!!!!!!!!!");
					console.setText("");
					p1=0;
					p2=0;
					p3=0;
					p4=0;
					count=1;

				}
				
				else if(p2>100)
				{
					console.append(dt.toString());
					console.append("You Got more than 100!!\nYou can't move\nWait for next chance");
					p2=originalValue;
					console.append("Values of p1 p2 p3 p4 are:"+p1+","+p2+","+p3+","+p4+"\n");
					count=3;
				}
			  
			  
				else
				{
			  		
					console.append(dt.toString());
					console.append("Values of p1 p2 p3 p4 are:"+p1+","+p2+","+p3+","+p4+"\n");
					movePlayers(p2,mRed,150,887);
						if(p2==8 || p2 ==15 || p2==42 || p2==66)
						{
							p2=Ladders(p2,2);
							console.append("\nAfter ladder Values of p1 p2 p3 p4 are:\n"+p1+","+p2+","+p3+","+p4+"\n");
							
						}
						else if(p2==24 || p2 ==55 || p2==71 || p2==88 || p2==99)
						{
							
							p2=Snakes(p2,2);
							console.append("\nAfter Snake BiteValues of p1 p2 p3 p4 are:\n"+p1+","+p2+","+p3+","+p4+"\n");
							count = 3;
						}
						else
						{
							count=3;
						}	
			   }	
			
			}
				
				
			else if(count==3)
			{	
				
				console.append("Chance of player 3\n");
				originalValue=p3;
				
				p3=dt.rand(p3);
				if(p3==100)
				{
					console.append(dt.toString());
					JOptionPane.showMessageDialog(null,"Player 3 is the Winner !!!!!!!!!!!!!!");
					console.setText("");
					p1=0;
					p2=0;
					p3=0;
					p4=0;
					count=1;
				}
				
				else if(p3>100)
				{
					console.append(dt.toString());
					console.append("You Got more than 100!!\nYou can't move\nWait for next chance");
					p3=originalValue;
					console.append("Values of p1 p2 p3 p4 are:"+p1+","+p2+","+p3+","+p4+"\n");
					count=4;
				}
				
				
				
				else
				{		
					 console.append(dt.toString());
					 console.append("Values of p1 p2 p3 p4 are:"+p1+","+p2+","+p3+","+p4+"\n");
					 movePlayers(p3,mGreen,166,903);
						 if(p3==8 || p3 ==15 || p3==42 || p3==66)
							{
								p3=Ladders(p3,3);
								console.append("\nAfter ladder Values of p1 p2 p3 p4 are:\n"+p1+","+p2+","+p3+","+p4+"\n");
								
							}
							else if(p3==24 || p3 ==55 || p3==71 || p3==88 || p3==99)
							{
								
								p3=Snakes(p3,3);
								console.append("\nAfter Snake BiteValues of p1 p2 p3 p4 are:\n"+p1+","+p2+","+p3+","+p4+"\n");
								count=4;
							}
							else
							{
								count=4;
							}	
					
				}
			}	
			
			else if(count==4)
			{	
				
				
				
				console.append("Chance of player 4\n");
				originalValue=p4;
				
				p4=dt.rand(p4);
				if(p4==100)
				{
					console.append(dt.toString());
					JOptionPane.showMessageDialog(null,"Player 4 is the Winner !!!!!!!!!!!!!!");
					console.setText("");
					p1=0;
					p2=0;
					p3=0;
					p4=0;
					count=1;

				}
				
				else if(p4>100)
				{
					console.append(dt.toString());
					console.append("You Got more than 100!!\nYou can't move\nWait for next chance\n");
					p4=originalValue;
					console.append("Values of p1 p2 p3 p4 are:"+p1+","+p2+","+p3+","+p4+"\n");
					count=1;
				}
				
				
				
				else
				{
						 console.append(dt.toString());
						 console.append("Values of p1 p2 p3 p4 are:"+p1+","+p2+","+p3+","+p4+"\n");
						 movePlayers(p4,mYellow,175,912);
							 if(p4==8 || p4 ==15 || p4==42 || p4==66)
								{
									p4=Ladders(p4,4);
									console.append("\nAfter ladder Values of p1 p2 p3 p4 are:\n"+p1+","+p2+","+p3+","+p4+"\n");
									
								}
								else if(p4==24 || p4 ==55 || p4==71 || p4==88 || p4==99)
								{
									
									p4=Snakes(p4,4);
									console.append("\nAfter Snake BiteValues of p1 p2 p3 p4 are:\n"+p1+","+p2+","+p3+","+p4+"\n");
									count=1;
								}
								else
								{
									count=1;
								}	
				 
				} 
		
			}	 
				
		
		
		}
		
	
		
		
		
	}


}
