import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int userNum = Integer.parseInt(reader.nextLine());
        
        int sum = 1;
        int i = 1;
        
        while (i <= userNum) {
            
           sum *= i;
           i++;
            
        }
        
        System.out.println("Sum is " + sum);

    }
}
