
/**
 * Write a description of class Bin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class Bin
{
    // instance variables - replace the example below with your own
    private String name;
    private int startX;
    private BufferedImage img;
    private boolean full;
    private int numPieces;
    
    private JLabel binFull = new JLabel("The " + name + "bin is full!");
    private JLabel wrongBin = new JLabel("Wrong bin!");

    /**
     * Constructor for objects of class Bin
     */
    public Bin(String n, int x)
    {
        name = n;
        startX = x;
        if (full)
        {
            switch(name)
            {
                case "trash":
                loadImage("fullTrash.png");
                break;
                case "recycling":
                loadImage("fullBin.png");
                break;
                case "compost":
                loadImage("fullCompost.png");
                break;
            }
        }
        else
        {
            switch(name)
            {
                case "trash":
                loadImage("emptyTrash.png");
                break;
                case "recycling":
                loadImage("emptyBin.png");
                break;
                case "compost":
                loadImage("emptyCompost.png");
                break;
            }
        }
    }
    
    public void loadImage(String filename)
    {
        img = null;
        try {
            img = ImageIO.read(new File(filename));
        } catch (IOException e) {
        }
    }
    
    public void drawBin(Graphics g)
    {
        g.drawImage(img, startX, 600, 100, 130, null);
    }
    
    public void binFullMessage(Graphics g)
    {
        g.drawString("The " + name + "bin is full!", 300, 300);
    }
    
    public void wrongBinMessage(Graphics g)
    {
        g.drawString("Wrong bin!", 300, 300);
    }
    
    public void setFull()
    {
        full = true;
    }
    
    public void addPiece(Piece p, Graphics g)
    {
        if (!full && p.getBin().equals(name))
        {
            numPieces++;
        }
        else if (full && p.getBin().equals(name))
        {
            binFullMessage(g);
        }
        else
        {
            wrongBinMessage(g);
        }
        if (numPieces == 10)
        {
            full = true;
        }
    }
}
