import java.util.Scanner;

public class TestScoreApp {

    public static void main(String[] args) {
        // display operational messages
        System.out.println("Enter test scores that range from 0 to 100.");
        System.out.println("To end the program, enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        // get a series of test scores from the user
        while (testScore != 999) {
        		
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();
            if(testScore == 999) {
            		testScore = 0;
            		break;
            }
            
            if(testScore > 100){
            	System.out.println("Invalid Entry, please enter a score lower than 100, or \"999\" to calculate the average and end the program");
            }
            
            // accumulate score count and score total
            else {
                scoreCount = scoreCount + 1;
                scoreTotal = scoreTotal + testScore;
            }
            
        }

        // display the score count, score total, and average score
        double averageScore = 0;
        if(scoreTotal <= 0) {
        		averageScore = 0;
        } else {
        		averageScore = (double) scoreTotal / scoreCount;
        }
        
        String message = "\n"
                + "Score count:   " + scoreCount + "\n"
                + "Score total:   " + scoreTotal + "\n"
                + "Average score: " + averageScore + "\n";
        System.out.println(message);
    }
}