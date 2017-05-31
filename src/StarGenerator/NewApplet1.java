/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarGenerator;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author admin
 */
public class NewApplet1 extends Applet{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     * 
     */
    Connection con;
    PreparedStatement ps = null;
    ResultSet rs = null;
    static double y;
    static String StarType = null;
    static String sql = null;
     NewApplet1(String x)  {
        StarType=x;
        sql = "select Color,AR from temperature where StarType = ?";
         try{
            con = Conn.connect();
            ps = con.prepareStatement(sql);
            ps.setString(1, StarType);
            rs = ps.executeQuery();
            while(rs.next()){
                y = rs.getDouble("AR");
            }
        }
        catch(Exception e){
            System.err.println(e);
        }
    }

    public void init() {
        // TODO start asynchronous download of heavy resources
        setBackground(Color.black);
    }
    public void paint(Graphics g)
    {
        Color StarColor = null;
        switch(StarType){
                case "O":
                    StarColor = Color.blue;
                    break;
                case "B":
                    StarColor = Color.blue;
                    break;
                case "A":
                    StarColor = Color.blue;
                    break;
                case "F":
                    StarColor = Color.white;
                    break;
                case "G":
                    StarColor = Color.yellow;
                    break;
                case "K":
                    StarColor = Color.ORANGE;
                    y=0.5;
                    break;
                case "M":
                    StarColor = Color.RED;
                    y=0.1;
                    break;
                        }
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 100, 100);
        g.setColor(StarColor);
        int z = (int)(y*100);
        g.fillOval(300, 50, z,z);
    }

}

