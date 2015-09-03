import java.awt.Color;
import java.lang.String;

public class Turtles
{
    public static void main(String[] args)
    {
        World turtleworld = new World();
        Turtle turtle1 = new Turtle(turtleworld);
        turtle1.setPenColor(Color.BLUE);
        turtle1.setPenWidth(50);
        turtle1.penDown();
        turtle1.forward(50);
        turtle1.penUp();
        turtle1.setPenWidth(25);
        turtle1.setColor(Color.ORANGE);
        turtle1.forward(50);
        
    }
}