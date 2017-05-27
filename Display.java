
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
    private Pen pen;
    private Bin recycling, trash, compost;

    /**
     * Constructor for objects of class Display
     */
    public Display()
    {
        // initialise instance variables
        pad = new SketchPad();
        pen = new StandardPen(pad);
        pad.setBackground(Color.WHITE);
        pad.addMouseListener(this);
        pen.setColor(Color.GRAY);
        pen.setWidth(1);
        
        Container con = getContentPane();
        con.add(pad);
        
        recycling = new Bin("Recycling", -300, pen);
        recycling.setPenColor(Color.GREEN);
        recycling.drawBin();
        trash = new Bin("Trash", -100, pen);
        trash.setPenColor(Color.BLACK);
        trash.drawBin();
        compost = new Bin("Compost", 100, pen);
        compost.setPenColor(Color.GRAY);
        compost.drawBin();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,750);
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
    
    public static void main(String[] args)
    {
        Display d = new Display();
    }
}
