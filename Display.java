
/**
 * Write a description of class Display here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import TurtleGraphics.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class Display extends JFrame implements MouseListener
{
    // instance variables - replace the example below with your own
    private SketchPad pad;
    private Pen p;

    /**
     * Constructor for objects of class Display
     */
    public Display()
    {
        // initialise instance variables
        pad = new SketchPad();
        p = new StandardPen(pad);
        pad.setBackground(Color.DARK_GRAY);
        pad.addMouseListener(this);
        p.setColor(Color.GRAY);
        p.setWidth(1);
        
        Container con = getContentPane();
        con.add(pad);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);
        setResizable(true);
        setVisible(true);
    }
    
    public void mousePressed(MouseEvent e)
    {
        
    }
    
    public void mouseClicked(MouseEvent e)
    {
        
    }
    
    public void mouseReleased(MouseEvent e)
    {
        
    }
    
    public void mouseExited(MouseEvent e)
    {
        
    }
    
    public void mouseEntered(MouseEvent e)
    {
        
    }
}
