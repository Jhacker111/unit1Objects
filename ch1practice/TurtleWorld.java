import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(50);
        turtle.setPenColor(Color.ORANGE);
        turtle.penDown();
        turtle.right(90);
        turtle.forward(50);
        turtle.setPenColor(Color.YELLOW);
        turtle.penDown();
        turtle.right(90);
        turtle.forward(50);
        turtle.setPenColor(Color.GREEN);
        turtle.penDown();
        turtle.right(90);
        turtle.forward(50);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle.right(90);
        turtle.forward(50);
        turtle.setPenColor(Color.MAGENTA);
        turtle.penDown();
        turtle.turnRight(90);
        turtle.forward(50);
    }
}
