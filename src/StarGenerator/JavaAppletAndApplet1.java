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
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class JavaAppletAndApplet1 {
 //public static void main(String[] args) {
        // TODO code application logic here
    String y;
    static Applet applet;
    static Button text2;
    public void app(String x){
        applet = null;
        text2 = new Button("Back");
        y=x;
        try {
	 applet = new NewApplet12(y);
        }
        catch( Exception e ) {
	           System.err.println(e);
        }
        NewJFrame1 frame = new NewJFrame1(applet);
        frame.add(applet);
        frame.add(text2);
        text2.setLocation(700,700);
        applet.init();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        Dimension d = new Dimension(1400, 650);
        applet.resize(d);
        applet.setVisible(true);
        text2.setVisible(true);// Show the applet
        frame.validate();	// Validate the layout manager
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        applet.repaint();
    }
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==text2){
      new StartPage().setVisible(true);
      applet.setVisible(false);
      applet.destroy();
  }  
 }
    
}
