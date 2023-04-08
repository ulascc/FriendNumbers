import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = scanner.nextInt();
        int sum1 = 0;
        int sum2 = 0;


        for (int i=1; i<number1; i++)
        {
            if(number1%i==0)
            {
                sum1 = sum1+i;
            }
        }

        for (int i=1; i<number2; i++)
        {
            if(number2%i==0)
            {
                sum2 = sum2+i;
            }
        }

        if(number1==sum2 && number2==sum1)
            System.out.println("number1 and number2 is FRIEND");
        else
            System.out.println("number1 and number3 is NOT FRIEND");


    }
}