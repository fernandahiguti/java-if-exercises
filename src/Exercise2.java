import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Insert first number");
        int num1 = reader.nextInt();
        System.out.println("Insert second number");
        int num2 = reader.nextInt();
        System.out.println("Insert third number");
        int num3 = reader.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("First number is the biggest");
        } else if (num2 > num1 && num2 > num3)  {
            System.out.println("Second number is the biggest");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Third number is the biggest");
        } else {
            System.out.println("All numbers are the same");
        }
    }
}