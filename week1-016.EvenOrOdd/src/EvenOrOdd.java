
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        
        int userNum = Integer.parseInt(reader.nextLine());
        
        int userMod = userNum % 2;
        
        if (userMod == 0) {
            System.out.println("The number is even!");
        } else{
            System.out.println("The number is odd!");
        }
    }
}   
        
