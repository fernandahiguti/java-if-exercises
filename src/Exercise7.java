import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the character");
        char character = reader.next().charAt(0);

        if (character >= 'a' && character <= 'z') {
            System.out.println("The inserted character is alphabetical");
        } else {
            System.out.println("The inserted character is NOT alphabetical");
        }
    }
}
