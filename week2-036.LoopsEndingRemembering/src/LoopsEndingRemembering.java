import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        double sum = 0;
        int howMany = 0;
        int even = 0;
        int odds = 0;
        
        while (true){
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1){
                break;
            }
            sum += number;
            howMany++;
            if( number % 2 == 0){
                even++;
            }else{
                odds++;
            }
            
        }
        System.out.println("Thank you and see you later!");
        int intsum = (int)sum;
        System.out.println("The sum is " + intsum); 
        double average = sum / howMany;
        System.out.println("How many numbers: " + howMany);
        System.out.println("Average: "+ average); 
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odds);
    }
}





/*public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers: ");
        int i = 0;
        int sum = 0;
        int howMany = 0;
       
        
        while (true){
            int number = Integer.parseInt(reader.nextLine());
            if (number != -1){
                System.out.println(number);
                howMany++;
            } 
            
            sum += number;
            
            
            
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + (sum+1));
                double average = ((sum+1) / howMany);
                System.out.println("How many numbers: " + howMany);
                System.out.println("Average: " + average);
                break;
            }
        
        }
               
        
        

    }
}
*/