import java.util.Scanner;

class Driving
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Driving Distance: ");
        int distance = myObj.nextInt();
        System.out.println("Enter Car Fuel Efficency in mpg: ");
        int mpg = myObj.nextInt();
        System.out.println("Enter Price per Gallon: ");
        double rate = myObj.nextDouble();

        double total = 0;
        total = ( distance / mpg ) * rate;
        System.out.println("Total cost of trip is " + total + ".");
    }
}