/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarGenerator;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class JavaAppletAndApplet {
 //public static void main(String[] args) {
        // TODO code application logic here
    String y;
    static Button text1;
    Applet applet;
    public void app(String x){
        applet = null;
        y=x;
        text1 = new Button("Back");
        try {
	applet = new NewApplet1(y);
        }
        catch( Exception e ) {
	           System.err.println(e);
        }

        NewJFrame frame = new NewJFrame(applet);
        frame.add(applet);
        text1.setLocation(700,700);
        frame.add(text1);
        
        applet.init();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        Dimension d = new Dimension(1400, 650);
        applet.resize(d);
        applet.setVisible(true);
        text1.setVisible(true);// Show the applet
        frame.validate();	// Validate the layout manager
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        applet.repaint();
    }
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==text1){
      new StartPage().setVisible(true);
      applet.setVisible(false);
      applet.destroy();
  }  
 }
}
