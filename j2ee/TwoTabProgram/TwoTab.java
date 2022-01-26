import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
/*
<applet code="TwoTab" width=400 height=100>
</applet>
*/
public class TwoTab extends JApplet 
{
	public void init() 
	{
		//Frame f = (Frame)this.getParent().getParent();
		//setTitle("TAB example");
		setSize(400,400);
		//f.setLocation(400,100);
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("BG ColorChange", new BgChange());
		jtp.addTab("Calculator", new Calc());
		getContentPane().add(jtp);
	}
}
class BgChange extends JPanel implements ActionListener 
{
	private JButton red,blue,refresh;
	public BgChange() 
	{
		setBackground(Color.pink);
		red = new JButton("Red");
		blue = new JButton("Blue");
		refresh = new JButton("Refresh");
		red.addActionListener(this);
		blue.addActionListener(this);
		refresh.addActionListener(this);
		add(red);
		add(blue);
		add(refresh);
	}
	public void actionPerformed(ActionEvent e) 
	{
		JButton s = (JButton) e.getSource();   //get the source of the event
		if ( s == red)  setBackground(Color.red);
		else if ( s == blue) setBackground ( Color.blue);
		else if ( s == refresh) setBackground ( Color.pink);
   }
}
class Calc extends JPanel implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	String s1="",s2;
	Frame f;Panel p2;
	JTextField t;int n1,n2;
	//Color lightGreen = new Color(172, 255, 193);
	Color lightBlue = new Color (0, 102, 255);

	public Calc()
	{
		setLayout(new GridLayout(2,1));
		t=new JTextField();
		t.setFont(new Font("Tahoma", Font.PLAIN, 40));
		t.setBounds(15, 15, 327, 80);
		t.setColumns(10);
		t.setHorizontalAlignment(SwingConstants.RIGHT);
		//t.setForeground(Color.WHITE);
		t.setForeground(Color.BLUE);
		add(t);
		p2=new Panel();
		p2.setLayout(new GridLayout(4,4));
		b1=new JButton("1");  b1.addActionListener(this); 
		b2=new JButton("2");  b2.addActionListener(this);
		b3=new JButton("3");  b3.addActionListener(this);
		b4=new JButton("+");  b4.addActionListener(this);
		b5=new JButton("4");  b5.addActionListener(this);
		b6=new JButton("5");  b6.addActionListener(this);
		b7=new JButton("6");  b7.addActionListener(this);
		b8=new JButton("-");  b8.addActionListener(this);
		b9=new JButton("7");  b9.addActionListener(this);	
		b10=new JButton("8");  b10.addActionListener(this);
		b11=new JButton("9");  b11.addActionListener(this);
		b12=new JButton("*");  b12.addActionListener(this);
		b13=new JButton("c");  b13.addActionListener(this);
		b14=new JButton("0");  b14.addActionListener(this);
		b15=new JButton("/"); b15.addActionListener(this);
		b16=new JButton("=");  b16.addActionListener(this);
		
		b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		b13.setBackground(Color.BLUE);
		b13.setForeground(Color.WHITE);
		b16.setForeground(Color.WHITE);
		b16.setBackground(Color.BLUE);
		b4.setBackground(lightBlue);
		b4.setForeground(Color.WHITE);
		b8.setForeground(Color.WHITE);
		b8.setBackground(lightBlue);
		b12.setForeground(Color.WHITE);
		b15.setForeground(Color.WHITE);
		b12.setBackground(lightBlue);
		b15.setBackground(lightBlue);
		
		b1.setForeground(Color.BLUE);
		b2.setForeground(Color.BLUE);
		b3.setForeground(Color.BLUE);
		b5.setForeground(Color.BLUE);
		b6.setForeground(Color.BLUE);
		b7.setForeground(Color.BLUE);
		b9.setForeground(Color.BLUE);
		b10.setForeground(Color.BLUE);
		b11.setForeground(Color.BLUE);
		b14.setForeground(Color.BLUE);
		
		b1.setBorder(new RoundedBorder(20));
		b2.setBorder(new RoundedBorder(20));
		b3.setBorder(new RoundedBorder(20));
		b4.setBorder(new RoundedBorder(20));
		b5.setBorder(new RoundedBorder(20));
		b6.setBorder(new RoundedBorder(20));
		b7.setBorder(new RoundedBorder(20));
		b8.setBorder(new RoundedBorder(20));
		b9.setBorder(new RoundedBorder(20));
		b10.setBorder(new RoundedBorder(20));
		b11.setBorder(new RoundedBorder(20));
		b12.setBorder(new RoundedBorder(20));
		b13.setBorder(new RoundedBorder(20));
		b14.setBorder(new RoundedBorder(20));
		b15.setBorder(new RoundedBorder(20));
		b16.setBorder(new RoundedBorder(20));

		p2.add(b1);p2.add(b2);p2.add(b3);p2.add(b4);
		p2.add(b5);p2.add(b6);p2.add(b7);p2.add(b8);
		p2.add(b9);p2.add(b10);p2.add(b11);p2.add(b12);
		p2.add(b13);p2.add(b14);p2.add(b16);p2.add(b15);
		add(p2);
	}
	public void actionPerformed(ActionEvent e1)
	{
		String str=e1.getActionCommand();
		if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/"))
		{
			String str1=t.getText();
			s2=str;
			n1=Integer.parseInt(str1);
			s1="";
		}
		else if(str.equals("="))
		{
			String str2=t.getText();
			n2=Integer.parseInt(str2);
			int sum=0;
			if(s2=="+")
			sum=n1+n2;
			else if(s2=="-")
			sum=n1-n2;
			else if(s2=="*")
			sum=n1*n2;
			else if(s2=="/")
			sum=n1/n2;
			String str1=String.valueOf(sum);
			t.setText(""+str1);
			s1="";
		}
		else if(str.equals("c"))
		{
			t.setText("");
		}
		else
		{
			s1+=str;
			t.setText(""+s1);
		}
	}
	private static class RoundedBorder implements Border 
	{
		private int radius;

		RoundedBorder(int radius) 
		{
			this.radius = radius;
		}

		public Insets getBorderInsets(Component c) 
		{
			return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
		}

		public boolean isBorderOpaque() 
		{
			return true;
		}

		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) 
		{
			g.drawRoundRect(x, y, width-1, height-1, radius, radius);
		}
	}

}
