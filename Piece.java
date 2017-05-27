
/**
 * Write a description of class Piece here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import TurtleGraphics.*;
import java.awt.*;

public class Piece
{
    // instance variables - replace the example below with your own
    private String name;
    private int startX, startY;
    private Pen pen;

    /**
     * Constructor for objects of class Bin
     */
    public Piece(String n, int x, int y, Pen p)
    {
        name = n;
        startX = x;
        startY = y;
        pen = p;
    }
    
    public void setPenColor(Color c)
    {
        pen.setColor(c);
    }
    
    public void drawPiece()
    {
        pen.up();
        for(int i = 0; i < 20; i++)
        {
            pen.up();
            pen.move(startX+i,startY+i);
            pen.setDirection(270);
            pen.down();
            pen.move(2*i+1);
        }
        for(int i = 0; i < 20; i++)
        {
            pen.up();
            pen.move(startX+20+i,startY+(19-i));
            pen.setDirection(270);
            pen.down();
            pen.move(2*(19-i)+1);
        }
    }
}
