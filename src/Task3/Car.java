package Task3;

public class Car {

    double carPrice;
    String color;

    public Car(double carPrice, String color)
    {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice(){ return 0.0; };

    public static class Sedan extends Car
    {
        int length;

        public Sedan(double carPrice, String color, int length)
        {
            super(carPrice, color);
            this.length = length;
        }

        public double calculateSalePrice()
        {
            if (length > 20)
            {
                return (carPrice - (carPrice * .05));
            }
            else
            {
                return (carPrice - (carPrice * .1));
            }
        }
    }

    public static class Truck extends Car
    {
        int weight;

        public Truck(double carPrice, String color, int weight)
        {
            super(carPrice, color);
            this.weight = weight;
        }

        public double calculateSalePrice()
        {
            if (weight > 2000)
            {
                return (carPrice - (carPrice * .1));
            }
            else
            {
                return (carPrice - (carPrice * .2));
            }
        }
    }
    public static class Main
    {
        public static void main(String[] args)
        {
            Sedan sedanOne = new Sedan(20000, "Blue", 19);
            Sedan sedanTwo = new Sedan(20000, "Yellow", 21);

            Truck truckOne = new Truck(50000, "Red", 1999);
            Truck truckTwo = new Truck(50000, "Green", 2001);

            System.out.println("The " + sedanOne.color + "'s original price was "
                    + sedanOne.carPrice + ", but because it was " + sedanOne.length
                    + " feet in length it received a discount and it's new price is $"
                    + sedanOne.calculateSalePrice());

            System.out.println("The " + sedanTwo.color + "'s original price was "
                    + sedanTwo.carPrice + ", but because it was " + sedanTwo.length
                    + " feet in length it received a discount and it's new price is $"
                    + sedanTwo.calculateSalePrice());

            System.out.println("The " + truckOne.color + "'s original price was "
                    + truckOne.carPrice + ", but because it was " + truckOne.weight
                    + " kilograms in weight it received a discount and it's new price is $"
                    + truckOne.calculateSalePrice());

            System.out.println("The " + truckTwo.color + "'s original price was "
                    + truckTwo.carPrice + ", but because it was " + truckTwo.weight
                    + " kilograms in weight it received a discount and it's new price is $"
                    + truckTwo.calculateSalePrice());
        }
    }
}


