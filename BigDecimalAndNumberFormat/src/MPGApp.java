import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
//import java.text.NumberFormat;
//Math.round() is in java.lang.Math ...which java.lang is already imported automatically

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            
            //double miles = sc.nextDouble();
            BigDecimal miles = new BigDecimal(sc.next());
            
            System.out.print("Enter gallons of gas used: ");
            //double gallons = sc.nextDouble();
            BigDecimal gallons = new BigDecimal(sc.next());
            
            //Rounding using Big Decimal
            //BigDecimal mpg = new BigDecimal(miles/gallons).setScale(2, RoundingMode.HALF_UP);
            BigDecimal mpg = miles.divide(gallons, 2, RoundingMode.HALF_UP);
            
            //Rounding using NumberFormat and setMacimumFractionDigits to 2 or 3
//            double mpg = (miles/gallons);
//            NumberFormat number = NumberFormat.getNumberInstance();
//            number.setMaximumFractionDigits(2);
//            mpg = Double.parseDouble(number.format(mpg));
            
            //Round using Math.round()
//            double mpg = (double) Math.round(miles/gallons * 100) / 100;  //returns an integer so we need to cast to double
            System.out.println("Miles per gallon is " + mpg + ".");
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
