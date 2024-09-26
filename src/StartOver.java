import java.util.Scanner;

public class StartOver {

    static Scanner scanner = new Scanner(System.in);

    public static void userStartOver() {
        ConsoleOperators.displayInfo("Do you want to start over? \nPress Y/N");
        String userInput = scanner.next();

        if(userInput.equalsIgnoreCase("N")) {
            System.out.println("Termnial closes");
            System.exit(0);
        } else {
            WelcomeMenu.userChoice();
        }
    }
}
