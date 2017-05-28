
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
                loadImage("trashPizzaPiece.jpg");
                break;
                case "recycling":
                loadImage("trashStyroPiece.jpg");
                break;
                case "compost":
                loadImage("trashDiaperPiece.jpg");
                break;
            }
        }
        else
        {
            switch(name)
            {
                case "trash":
                loadImage("trashPizzaPiece.jpg");
                break;
                case "recycling":
                loadImage("trashStyroPiece.jpg");
                break;
                case "compost":
                loadImage("trashDiaperPiece.jpg");
                break;
            }
        }
    }
    
    public void drawBin(Graphics g)
    {
        g.fillRect(startX,650,5,100);
        g.fillRect(startX+5,745,190,5);
        g.fillRect(startX+195,650,5,100);
    }
    
    public void loadImage(String filename)
    {
        img = null;
        try {
            img = ImageIO.read(new File(filename));
        } catch (IOException e) {
        }
    }
    
    public void drawPiece(Graphics g)
    {
        g.drawImage(img, startX, 650, 50, 50, null);
    }
}
