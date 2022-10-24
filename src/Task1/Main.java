package Task1;

public class Main {
    public static void main(String[] args) {
        Square sqr = new Square();

        Circle cir = new Circle();

        System.out.println("The area of a square whose sides " +
                "are of length 5 is " + sqr.calculateArea(5));

        System.out.println("The perimeter of a square whose " +
                "sides are of length 5 is " + sqr.calculatePerimeter(5));

        System.out.println("The area of a circle whose radius " +
                "is of length 5 is " + cir.calculateArea(5));

        System.out.println("The perimeter of a circle whose " +
                "radius is of length 5 is " + sqr.calculatePerimeter(5));


    }
}
