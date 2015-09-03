import java.awt.Color;

public class Turtles
{
    public static void main(String[] args)
    {
        World turtleworld = new World();
        Turtle turtle1 = new Turtle(turtleworld);
        turtle1.setPenColor(Color.BLUE);
        turtle1.setPenWidth(50);
        turtle1.forward(50);
        turtle1.turnRight();
        turtle1.setPenWidth(25);
        turtle1.setColor(Color.ORANGE);
        turtle1.forward(50);
        turtle1.turnRight();
        turtle1.setPenColor(Color.BLUE);
        turtle1.setPenWidth(12);
        turtle1.forward(50);
        turtle1.turnRight();
        turtle1.setPenWidth(6);
        turtle1.setColor(Color.ORANGE);
        turtle1.forward(100);
        turtle1.turnLeft();
        turtle1.setPenColor(Color.BLUE);
        turtle1.setPenWidth(12);
        turtle1.forward(50);
        turtle1.turnLeft();
        turtle1.setPenWidth(25);
        turtle1.setColor(Color.ORANGE);
        turtle1.forward(50);
        turtle1.turnLeft();
        turtle1.setPenColor(Color.BLUE);
        turtle1.setPenWidth(50);
        turtle1.forward(50);
        turtle1.turnLeft();
        
        Turtle turtle2 = new Turtle(turtleworld);
        turtle2.turnRight();
        turtle2.setPenColor(Color.RED);
        turtle2.setPenWidth(50);
        turtle2.forward(50);
        turtle2.turnRight();
        turtle2.setPenWidth(25);
        turtle2.setColor(Color.GREEN);
        turtle2.forward(50);
        turtle2.turnRight();
        turtle2.setPenColor(Color.RED);
        turtle2.setPenWidth(12);
        turtle2.forward(50);
        turtle2.turnRight();
        turtle2.setPenWidth(6);
        turtle2.setColor(Color.GREEN);
        turtle2.forward(100);
        turtle2.turnLeft();
        turtle2.setPenColor(Color.RED);
        turtle2.setPenWidth(12);
        turtle2.forward(50);
        turtle2.turnLeft();
        turtle2.setPenWidth(25);
        turtle2.setColor(Color.GREEN);
        turtle2.forward(50);
        turtle2.turnLeft();
        turtle2.setPenColor(Color.RED);
        turtle2.setPenWidth(50);
        turtle2.forward(50);
        turtle2.turnLeft();
    }
}