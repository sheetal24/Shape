package Shape;

public class ShapeType extends Shape
{
    public void Area()
    {
        if(shape == "Circle")
        {
            System.out.println(" Enter the radius for Circle");
            radius = sc.nextDouble();
            area = 3.14 * radius * radius;
            System.out.println("Area of a Circle is " +area);
        }
        else if(shape == "Rectangle")
        {
            System.out.println(" Enter the length of Rectangle");
            length = sc.nextDouble();
            System.out.println(" Enter the breadth of Rectangle");
            breadth = sc.nextDouble();
            area = length * breadth;
            System.out.println("Area of Rectangle is " + area);
        }
        else {
            System.out.println("The shape is not valid");
        }
    }

    public static void main(String args[])
    {
        ShapeType shapetype = new ShapeType();
        shapetype.Shapetype("Rectangle");
        shapetype.Area();


    }


}
