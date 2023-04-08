import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a lowcase char");

        char ch = scanner.next().charAt(0);

        char[] bold = {'a','ı','o','u'};
        char[] thin = {'e','i','ö','ü'};

        for (char c : bold) {
            if(ch==c)
                System.out.println("it is bold");
        }
        for (char c : thin) {
            if(ch==c)
                System.out.println("it is thin");
        }

    }
}