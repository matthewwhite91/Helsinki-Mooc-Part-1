
public class Printing {

    public static void printStars(int amount) {
        int i = 0;

        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println(); //this orints a new line
    }

    public static void printSquare(int sideSize) {
        int i = 0;
        while (i < sideSize) {
            printStars(sideSize);
            i++;
        }
        System.out.println();
    }

    public static void printRectangle(int width, int height) {
        int i = 0;

        while (i < height) {
            printStars(width);
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 0;

        while (i < size) {

            printStars(1 + i);
            i++;
        }
    }

    public static void main(String[] args) {

        printStars(3);
        System.out.println("\n---");  // To seperate the lines by section
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(7);
        System.out.println("\n---");
    }

}
