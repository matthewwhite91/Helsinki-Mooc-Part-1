
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int number = 1;
        
        System.out.println("Up to what number? ");
        int userNum = Integer.parseInt(reader.nextLine());
        
        while (number <= userNum) {
            System.out.println(number);
            number++;          
        }
            
        
        
    }
}
