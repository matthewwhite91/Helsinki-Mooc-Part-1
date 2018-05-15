
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
        int i = 0;

        while (true){
            System.out.println("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            
            if (guess > numberDrawn){
                System.out.println("The number is lesser, guesses made: " + (i + 1));
                i++;
            } else if (guess < numberDrawn){
                System.out.println("The number is greater, guesses made: " + (i+1));
            } else {
                System.out.println("Congratulations! Your guess is correct!");
                break;
            }
                    
            
            
            
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
