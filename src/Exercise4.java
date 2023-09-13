import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert number");
        int num = reader.nextInt();

        if (num%5==0 && num%11==0) {
            System.out.println("This number is divisible by 5 and 11");
        } else
            System.out.println("This number is NOT divisible by 5 and 11");
    }
}
