import java.util.Scanner;

public class ConsoleOperators {

    static Scanner scanner = new Scanner(System.in);

    public static void displayInfo(String info) {
        printSeperator(30);
        System.out.println(info);
        printSeperator(30);
    }

    public static void printSeperator(int n) {
        for(int i = 0; i < n; i ++)
            System.out.print("-");
        System.out.println();
    }

    public static void pressToContinue() {
        System.out.println("Press anything and enter to continue");
        scanner.next();
    }

    public static void clearConsole() {
        pressToContinue();
        for(int i = 0; i < 100; i++){
            System.out.println(" ");
        }
    }
}
