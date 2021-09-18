package Shape;

import java.util.Scanner;

public class Shape
{
    protected double radius;
    protected double length;
    protected double breadth;
    protected String shape;
    protected double area;

    Scanner sc = new Scanner(System.in);

    public String Shapetype(String s)
    {
        shape = s;
        switch (shape)
        {
            case "Circle":
                System.out.println("This shape is Circle ");

            break;
            case "Rectangle":
                System.out.println("This shape is Rectangle ");

                 break;

            default:
                System.out.println("Invlid shape");
                break;
        }
        return shape;
        }
}


