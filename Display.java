
/**
 * Write a description of class Display here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class Display extends JFrame implements MouseListener
{
    // instance variables - replace the example below with your own
   
    private Bin recycling, trash, compost;
    private Piece p;
    private int startY = 50;

    /**
     * Constructor for objects of class Display
     */
    public Display()
    {
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,750);
        setResizable(true);
        setVisible(true);
        //play();
    }
    
    public void paint(Graphics g)
    {
        recycling = new Bin("Recycling", 0);
        g.setColor(Color.GREEN);
        recycling.drawBin(g);
        trash = new Bin("Trash", 200);
        g.setColor(Color.BLACK);
        trash.drawBin(g);
        compost = new Bin("Compost", 400);
        g.setColor(Color.GRAY);
        compost.drawBin(g);
        p = new Piece("paper", 400, startY);
        //g.setColor(Color.BLUE);
        p.drawPiece(g);
        
        setVisible(true);
    }
    
    public void play()
    {
        boolean falling = true;
        while(falling)
        {
            try 
            {
                Thread.sleep(50);
            }
            catch(Exception e)
            {

            }
            startY++;
            if(startY - 20 >= 745) falling = false;
            repaint();
        }

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
