
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

    private int bin, type;
    private int startX, startY;
    private Color col;
    private BufferedImage img;
    private boolean moving;

    /**
     * Constructor for objects of class Bin
     */
    public Piece(int x, int y)
    {
        startX = x;
        startY = y;
        bin = (int) (Math.random() * 3 + 1);
        type = (int) (Math.random() * 3 + 1);
        switch(bin)
        {
            case 1:
            switch(type)
            {
                case 1:
                loadImage("trashPizzaPiece.jpg");
                break;
                case 2:
                loadImage("trashStyroPiece.jpg");
                break;
                case 3:
                loadImage("trashDiaperPiece.jpg");
                break;
            }

            break;
            case 2:
            switch(type)
            {
                case 1:
                loadImage("compostBananaPiece.jpg");
                break;
                case 2:
                loadImage("compostApplePiece.jpg");
                break;
                case 3:
                loadImage("compostOrangePiece.jpg");
                break;
            }
            break;
            case 3:
            switch(type)
            {
                case 1:
                loadImage("paperCrumpledPiece.jpg");
                break;
                case 2:
                loadImage("plasticMilkPiece.jpg");
                break;
                case 3:
                loadImage("metalSoupPiece.jpg");
                break;
            }
            break;
        }
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
    
    public String getBin()
    {
        switch(bin)
        {
            case 1:
                return "trash";
            case 2:
                return "compost";
            case 3:
                return "recycling";
        }
        return "";
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
        g.drawImage(img, startX, startY, 50, 50, null);
    }
}
