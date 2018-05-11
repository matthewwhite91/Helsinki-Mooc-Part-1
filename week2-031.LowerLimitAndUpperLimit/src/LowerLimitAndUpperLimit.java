
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        
        System.out.println("First: ");
        int userFirst = Integer.parseInt(reader.nextLine());
        
        int number = userFirst;
        
        System.out.println("Last: ");
        int userLast = Integer.parseInt(reader.nextLine());
        
        
        while (number >= userFirst && number <=userLast) {
            System.out.println(number);
            number++;          
        }
    }
}
