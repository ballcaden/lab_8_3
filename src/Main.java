import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double favDouble = InputHelper.getDouble(scan, "Enter your favorite double: ");
        System.out.print("Your favorite double is: " + favDouble);

        System.out.println();

        int favInt = InputHelper.getInt(scan, "Enter your favorite int: ");
        System.out.print("Your favorite int is: " + favInt);
    }
}