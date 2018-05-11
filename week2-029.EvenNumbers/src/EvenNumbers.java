
public class EvenNumbers {

    public static void main(String[] args) {
    int number = 2;
        
        while ((number < 101) && number % 2 == 0){
            System.out.println(number);
            number = number + 2;
        }
   
    }
}
