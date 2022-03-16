package formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter name");
        String name = scanner.nextLine();

        System.out.println("Got Covid");
        boolean answer = scanner.nextBoolean();

        System.out.println("Welcome "  + name + " It is " + answer+ " that you have covid" + " You can survive it since you are only" + age + " years old");




    }
}
