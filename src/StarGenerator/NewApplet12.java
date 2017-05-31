/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarGenerator;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author admin
 */
public class NewApplet12 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     * 
     */
    static String StarName = null;
    static int y = 0;
     NewApplet12(String x)  {
        StarName=x;
    }

    public void init() {
        // TODO start asynchronous download of heavy resources
        setBackground(Color.black);
    }
    public void paint(Graphics g)
    {
        switch(StarName){
                case "Yellow Dwarf":
                    g.setColor(Color.yellow);
                    y = 200;
                    break;
                case "Red Dwarf":
                    g.setColor(Color.red);
                    y = 200;
                    break;
                case "Red Giant":
                    g.setColor(Color.red);
                    y = 400;
                    break;
                case "Blue Giant":
                    g.setColor(Color.blue);
                    y = 400;
                    break;
                case "Super Giant":
                    g.setColor(Color.blue);
                    y = 600;
                    break;
                case "White Dwarf":
                    g.setColor(Color.white);
                    y = 150;
                    break;
                case "Neutron Star":
                    g.setColor(Color.blue);
                    y=100;
                    break;
                case "Black Hole":
                    setBackground(Color.white);
                    g.setColor(Color.black);
                    y=50;
                    break;
                        }
        g.fillOval(500,150,y,y);
    }
}
