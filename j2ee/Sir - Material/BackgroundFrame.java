// JFrame set Background Example
// 	Code for a JFrame with two JButtons that change the background color of the JFrame
//		(more precisely: of the contentpane of the JFrame)
//	Author: Istvan Simon 12/13/99

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class BackgroundFrame extends JFrame 
	implements ActionListener {

   private WindowTerminator  wt = new WindowTerminator();  // Code below
   private JButton red,blue,refresh; // the JButtons which will cause the background colors to change
   private Container cp; // our contentpane

   public BackgroundFrame( ) {
      setSize(300,300);
      setLocation(100,100);
      setTitle(getClass().getName());


     addWindowListener(wt);

     red = new JButton("Red");
     blue = new JButton("Blue");
     refresh = new JButton("Refresh");
     red.addActionListener(this);
     blue.addActionListener(this);
     refresh.addActionListener(this);
   
    cp = getContentPane();
    cp.setBackground(Color.pink);
    cp.setLayout(new FlowLayout());
    cp.add(red);
    cp.add(blue);
    cp.add(refresh);

    show();
   }


   public void actionPerformed(ActionEvent e) {

      JButton s = (JButton) e.getSource();   //get the source of the event

     if ( s == red)  cp.setBackground(Color.red);
     else if ( s == blue) cp.setBackground ( Color.blue);
     else if ( s == refresh) cp.repaint();;

     //cp.repaint();
   }


   public static void main (String[] args) {

      JFrame f = new BackgroundFrame();
   }

}

class WindowTerminator extends WindowAdapter {

   public void windowClosing (WindowEvent e)  {
      System.exit(0);
   }
}