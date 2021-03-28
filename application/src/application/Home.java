package application;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Home {

	ImageIcon logo = new ImageIcon(getClass().getResource("logo.png"));
	ImageIcon bkgrd = new ImageIcon(getClass().getResource("home_bg.jpg"));
	ImageIcon medc = new ImageIcon(getClass().getResource("medicines.jpg"));
	ImageIcon lgt1 = new ImageIcon(getClass().getResource("logout.png"));
	ImageIcon cmplogo = new ImageIcon(getClass().getResource("cmp_logo.png"));
	
	public void home_display(String str)
	{
		Home b = new Home();
		JFrame f = new JFrame("Home");
		f.setBounds(-10,-5,1920,1080);
		JLabel bg = new JLabel("",bkgrd,JLabel.CENTER);
		bg.setBounds(-50,-50,1920,1080);
		f.add(bg);
		JLabel l0 = new JLabel();
		l0.setText("Welcome, "+str);
		l0.setFont(new Font("Times New Roman",Font.ITALIC,20));
		l0.setForeground(new Color(53,0,102));
		l0.setBounds(75,75,1000,40);
		try{
            Font font = Font.createFont(Font.TRUETYPE_FONT, Login.class.getResourceAsStream("PantonRustHeavy-GrSh.ttf"));
            l0.setFont(font.deriveFont(Font.ITALIC, 20f));
        }
        catch(Exception e){}
		bg.add(l0);
		JButton med = new JButton(medc);
		med.setBounds(550, 200,150,150);
		bg.add(med);
		JLabel medl = new JLabel("Medicines");
		medl.setBounds(580,360,100,20);
		medl.setFont(new Font("",Font.PLAIN,20));
		medl.setForeground(new Color(53,0,102));
		bg.add(medl);
		JButton cmp = new JButton(cmplogo);
		cmp.setBounds(930, 200,150,150);
		bg.add(cmp);
		JLabel cmpl = new JLabel("Company");
		cmpl.setBounds(963,355,100,30);
		cmpl.setFont(new Font("",Font.PLAIN,20));
		cmpl.setForeground(new Color(53,0,102));
		bg.add(cmpl);
		JButton ret = new JButton("Logout");
		ret.setBounds(770, 580, 100, 50);
		bg.add(ret);
		ret.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame lgt = new JFrame("Logout");
				lgt.setBounds(640,380,250,120);
				lgt.setIconImage(lgt1.getImage());
				JLabel msg = new JLabel("Are you sure you want to logout?");
				msg.setBounds(25,10,200,20);
				lgt.add(msg);
				JButton yes = new JButton("Yes");
				yes.setBounds(25, 40, 75, 30);
				lgt.add(yes);
				JButton no = new JButton("No");
				no.setBounds(135, 40, 75, 30);
				lgt.add(no);
				no.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						lgt.hide();
					}
				});
				yes.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						lgt.hide();
						f.hide();
						new Main().main(null);
					}
				});
				lgt.setLayout(null);
				lgt.setVisible(true);
				lgt.setResizable(false);
			}
		});
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
		f.setIconImage(logo.getImage());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Home b = new Home();
		b.home_display("User");
		//Hemlo guyzz!!
	}
}
