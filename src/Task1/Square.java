package Task1;

public class Square implements Shape {


    public double calculateArea(int sideLength)
    {
        return sideLength * sideLength;
    }

    public double calculatePerimeter(int sideLength)
    {
        return sideLength * 4;
    }
}

