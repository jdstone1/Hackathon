
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
    private JButton emptyRecycling = new JButton("Empty Recycling");
    private JButton emptyTrash = new JButton("Empty Trash");
    private JButton emptyCompost = new JButton("Empty Compost");

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
        recycling = new Bin("recycling", 50);
        trash = new Bin("trash", 250);
        compost = new Bin("compost", 450);
        //p.drawPiece();
        setOpaque(true);
        setBackground(Color.LIGHT_GRAY);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600,750));
        //setResizable(true);
        setVisible(true);
        
        
        timer = new Timer(5, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                startY++;
                repaint();
                if(startY + 50 >=  650) 
                {
                    Graphics g = getGraphics();
                    timer.stop();
                    if (p.getX() > 50 && p.getX() < 150)
                    {
                        recycling.addPiece(p, g);
                        return;
                    }
                    else if (p.getX() > 250 && p.getX() < 350)
                    {
                        trash.addPiece(p, g);
                        return;
                    }
                    else if (p.getX() > 450 && p.getX() < 550)
                    {
                        compost.addPiece(p, g);
                        return;
                    }
                    else
                    {
                        return;
                    }
                }
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
        recycling.drawBin(g);
        trash.drawBin(g);
        compost.drawBin(g);
        p.setY(startY);
        p.drawPiece(g);
        setVisible(true);
    }

    public static void main(String[] args) {
        JButton emptyRecycling = new JButton("Empty Recycling");
        JButton emptyTrash = new JButton("Empty Trash");
        JButton emptyCompost = new JButton("Empty Compost");
        JLabel title = new JLabel("Recycling Game");
        
        JFrame frame = new JFrame();
        JPanel buttonPanel = new JPanel();
        JPanel controlPanel = new JPanel();
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.add(controlPanel, BorderLayout.NORTH);
        
        buttonPanel.add(emptyRecycling);
        buttonPanel.add(emptyTrash);
        buttonPanel.add(emptyCompost);
        
        controlPanel.add(title);
        
        Display d = new Display();
        frame.getContentPane().add(d);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
}
