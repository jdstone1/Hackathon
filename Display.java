
/**
 * Write a description of class Display here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.*;
import javax.swing.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.event.*;

public class Display extends JPanel
{
    // instance variables - replace the example below with your own
   
    private Bin recycling, trash, compost;
    private Piece[] pieces = new Piece[10];
    private Piece p;
    private int startY = 50;
    private Timer timer = null;

    /**
     * Constructor for objects of class Display
     */
    public Display()
    {
        // for(int i = 0; i < pieces.length; i++)
        // {
            // pieces[i] = new Piece((int) (Math.random()*551), startY);
        // }
        p = new Piece((int) (Math.random()*551), startY);
        //p.drawPiece();
        setOpaque(true);
        setBackground(Color.LIGHT_GRAY);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600,750));
        //setResizable(true);
        setVisible(true);
        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                startY++;
                repaint();
                if(startY + 50 >=  745) timer.stop();
            }
        });
        timer.start();
        
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.clearRect(0,0,(int) getSize().getWidth(), (int) getSize().getHeight());
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,0,(int) getSize().getWidth(), (int) getSize().getHeight());
        recycling = new Bin("Recycling", 0);
        g.setColor(Color.GREEN);
        recycling.drawBin(g);
        trash = new Bin("Trash", 200);
        g.setColor(Color.BLACK);
        trash.drawBin(g);
        compost = new Bin("Compost", 400);
        g.setColor(Color.GRAY);
        compost.drawBin(g);
        p.setY(startY);
        p.drawPiece(g);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Display d = new Display();
        frame.getContentPane().add(d);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
}
