import java.util.Scanner;

public class DrivingCost {
    public static void main(String[] ARGS) {

        //creates scanner for input from user

        Scanner input = new Scanner ( System.in );
        //introduces different values we are going to be using

        double distance;
        int mpg;
        double ppg;
        double OneWayCost;
        double RoundTripCost;
        //input from user

        System.out.println ("Please enter the total distance you are driving ");
        distance = input.nextDouble ();

        System.out.println ("Please enter your car's gas mileage ");
        mpg = input.nextInt ();

        System.out.println ("Please enter the price of the gas ");
        ppg = input.nextDouble ();

        //calculations for program using the user's inputs
        OneWayCost = (distance / mpg) * ppg;
        RoundTripCost = (distance / mpg) * ppg *2;
        System.out.println( "Your total road cost for the trip is " +OneWayCost + "\n" +"Your total Round Trip Cost is " +RoundTripCost);







    }

}
