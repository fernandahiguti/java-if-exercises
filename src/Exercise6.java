import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the Year :");
        int year = reader.nextInt();
        boolean flag;
        if (year % 400 == 0) {
            flag = true;
        }
        else if (year % 100 == 0) {
            flag = false;
        }
        else flag = year % 4 == 0;

        if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
}

