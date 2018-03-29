import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "n" or "N"
        String choice = "y";
        double discountAmount, total, runningTotal= 0.0, runningDiscount = 0, discountPercent;
        int numberOfInvoices = 0;
        while (!choice.equalsIgnoreCase("n")) {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();
            
            //Validate input
            
            numberOfInvoices++;
            // calculate the discount amount and total
            if (subtotal >= 200) {
                discountPercent = .25;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            discountAmount = subtotal * discountPercent;
            total = subtotal - discountAmount;
            runningTotal += total;
            runningDiscount += discountAmount;

            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";            
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        
        String finalMessage = "Number of invoices: " + "\t" + numberOfInvoices + "\n"
                + "Average invoice:  " + "\t" + runningTotal/numberOfInvoices + "\n"
                + "Average Discount:    " + "\t" + runningDiscount/numberOfInvoices + "\n";            
        System.out.println(finalMessage);
    }
}