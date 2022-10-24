package Task1;

public class Circle implements Shape
{

    public double calculateArea(int radius)
    {
        return (3.14 * radius * radius);
    }

    @Override
    public double calculatePerimeter(int radius)
    {
        return 2 * 3.14 * radius;
    }
}

