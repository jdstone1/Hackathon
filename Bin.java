
/**
 * Write a description of class Bin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;

public class Bin
{
    // instance variables - replace the example below with your own
    private String name;
    private int startX;
    private Color col;

    /**
     * Constructor for objects of class Bin
     */
    public Bin(String n, int x)
    {
        name = n;
        startX = x;
    }
    
    public void drawBin(Graphics g)
    {
        g.fillRect(startX,650,5,100);
        g.fillRect(startX+5,745,190,5);
        g.fillRect(startX+195,650,5,100);
    }
}
