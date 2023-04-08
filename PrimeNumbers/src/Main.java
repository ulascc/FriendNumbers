import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if(number<2)
        {
            System.out.println("Sayı asal değildir");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                isPrime = false;
        }

        String result = (isPrime) ? "number is Prime" : "number is not Prime";
        System.out.println(result);

    }
}