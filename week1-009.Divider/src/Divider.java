
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:");
         double a = Integer.parseInt(reader.nextLine());
         
         System.out.println("Type another number:");
         double b = Integer.parseInt(reader.nextLine());
         
         System.out.println("Division: " + a + " / " +b+ " = " + (a/b));
        // Implement your program here. Remember to ask the input from user.
    }
}
