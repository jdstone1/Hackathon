
/**
 * Write a description of class Bin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import TurtleGraphics.*;
import java.awt.*;
import javax.swing.*;

public class Bin
{
    // instance variables - replace the example below with your own
    private String name;
    private int startX;
    private Pen pen;

    /**
     * Constructor for objects of class Bin
     */
    public Bin(String n, int x, Pen p)
    {
        name = n;
        startX = x;
        pen = p;
    }
    
    public void setPenColor(Color c)
    {
        pen.setColor(c);
    }

    public void drawBin()
    {
        pen.up();
        for(int i = 0; i < 5; i++)
        {
            pen.up();
            pen.move(startX+i,-265);
            pen.setDirection(270);
            pen.down();
            pen.move(99);
        }
        for(int i = 0; i < 190; i++)
        {
            pen.up();
            pen.move(startX+5+i,-360);
            pen.setDirection(270);
            pen.down();
            pen.move(4);
        }
        for(int i = 0; i < 6; i++)
        {
            pen.up();
            pen.move(startX+195+i,-265);
            pen.setDirection(270);
            pen.down();
            pen.move(99);
        }

    }
}
