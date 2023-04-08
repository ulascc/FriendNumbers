import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i=1; i<number; i++)
        {
            if(number%i==0)
            {
                sum = sum+i;
            }
        }

        if(sum==number)
            System.out.println("this number is PERFECT NUMBER");
        else
            System.out.println("this number is NOT PERFECT NUMBER");
    }
}