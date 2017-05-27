
/**
 * Write a description of class Piece here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;

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
    
    public void drawPiece(Graphics g)
    {
        g.fillOval(startX,startY,20,20);
    }
}
