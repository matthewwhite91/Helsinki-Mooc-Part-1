
import java.util.Scanner;

public class ManyPrints {
    
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        System.out.println("How many?");
        
        Scanner reader = new Scanner(System.in);
        int times = Integer.parseInt(reader.nextLine());
        int i = 0;
        while (times > 0) {
            printText();
            times--;
        }
    }
}
