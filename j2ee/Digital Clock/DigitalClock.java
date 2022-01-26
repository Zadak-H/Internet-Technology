import java.awt.*;
import java.applet.*;
import java.util.*;
import java.text.*;

/*<applet code = "DigitalClock" width="340" height="180"></applet>*/

public class DigitalClock extends Applet implements Runnable
{
	Thread t, t1;
	public void start()
	{
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		t1 = Thread.currentThread();
		while(t1==t)
		{
			paint(getGraphics());
			try
			{
				setForeground(Color.BLUE);
				t1.sleep(500);
				setForeground(Color.RED);
				t1.sleep(500);
			}
			catch(InterruptedException e){}
		}
	}
	public void paint (Graphics g)
	{
		setBackground(Color.WHITE);
		//setForeground(Color.BLUE);
		g.setFont(new Font("Digital-7", Font.BOLD, 40)); 
		Calendar cal = new GregorianCalendar();
		int hi = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int si = cal.get(Calendar.SECOND);
		String h = Integer.toString(hi);
		String m = Integer.toString(mi);
		String s = Integer.toString(si);
		String ampm = "ampm";
		if(hi<10)
			h = "0"+h;
		if(mi<10)
			m = "0"+m;
		if(si<10)
			s = "0"+s;
		
		int am_pm = cal.get(Calendar.AM_PM);
		if (am_pm == 0) 
			ampm = "AM";
		else
			ampm = "PM";
		
		g.drawString(h+" : "+m+" : "+s, 30,100);
		g.setFont(new Font("Digital-7", Font.BOLD + Font.ITALIC, 25)); 
		g.drawString(ampm, 250,100);
		g.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 15)); 
		Date d=cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM, yyyy ");
		g.drawString(sdf.format(d), 35, 60);
		sdf = new SimpleDateFormat("zzzz");
		g.drawString(sdf.format(d), 145, 120);
	}
	public void update(java.awt.Graphics g) {}
}