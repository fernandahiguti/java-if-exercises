import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Insert number");
        int num = reader.nextInt();

        if (num > 0) {
            System.out.println("This number is positive");
        } else if (num < 0) {
            System.out.println("This number is negative");
        } else {
            System.out.println("The inserted number is zero");
        }
    }
}
