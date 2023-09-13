import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Insert first number:");
        int num1 = reader.nextInt();
        System.out.println("Insert second number:");
        int num2 = reader.nextInt();

        if (num1 > num2) {
            System.out.println("First number is bigger than second number");
        } else if (num2 > num1) {
            System.out.println("Second number is bigger than second number");
        } else {
            System.out.println("First and second number are the same");
        }

    }
}