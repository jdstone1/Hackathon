
/**
 * Write a description of class Piece here.
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

public class Piece
{
    // instance variables - replace the example below with your own
    private String name;
    private int startX, startY;
    private Color col;

    /**
     * Constructor for objects of class Bin
     */
    public Piece(String n, int x, int y)
    {
        name = n;
        startX = x;
        startY = y;
    }
    
    public void setPieceColor(Color c)
    {
        col = c;
    }
    
    public void setX(int x)
    {
        startX = x;
    }
    
    public int getX()
    {
        return startX;
    }
    
    public void setY(int y)
    {
        startY = y;
    }
    
    public int getY()
    {
        return startY;
    }
    
    public BufferedImage loadImage(String filename)
    {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filename));
        } catch (IOException e) {
        }
        return img;
    }
    
    public void drawPiece(Graphics g)
    {
        g.drawImage(loadImage("paperCrumpledPiece.jpg"), startX, startY, 40, 40, null);
        /*g.fillOval(startX,startY,20,20);
        if (name.equals("paper"))
        {
            g.drawImage(loadImage("paperCrumpledPiece"), startX, startY, null);
        }
        else if (name.equals("plastic"))
        {
            
        }
        else if (name == "metal")
        {
            
        }
        else if (name == "glass")
        {
            
        }
        else
        {
            
        }*/
    }
}
