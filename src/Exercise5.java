import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert number");
        int num = reader.nextInt();

        if (num%2==0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }
    }
}
