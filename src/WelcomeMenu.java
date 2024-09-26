import java.util.Scanner;

public class WelcomeMenu {

    static Scanner scanner = new Scanner(System.in);


    private static void Welcome() {
        ConsoleOperators.displayInfo("Welcome to Omarzans Restaurant");
        ConsoleOperators.clearConsole();
        ConsoleOperators.displayInfo("You have following choices");
        System.out.println("1: Book a reservation \n2: See our menues \n3: See your reservation \n4: Cancel for reservation");
        ConsoleOperators.printSeperator(30);

    }

    public static void userChoice() {
        Welcome();
        int userInput;

        do {
            System.out.println("Press the menu you wish to access:");
            try {
                userInput = Integer.parseInt(scanner.next());
            }catch (Exception e) {
                System.out.println("Wrong input. Try again. Choose between 1-4");
                userInput = 0;
            }
        } while (userInput <= 0 || userInput > 4);


        if(userInput == 1) {
            ConsoleOperators.clearConsole();
            ConsoleOperators.displayInfo("Book a reservation");
            StartOver.userStartOver();

        }

        if(userInput == 2) {
            ConsoleOperators.clearConsole();
            ConsoleOperators.displayInfo("See our menues");
            Menuer.showMenues();
            StartOver.userStartOver();

        }

        if(userInput == 3) {
            ConsoleOperators.clearConsole();
            ConsoleOperators.displayInfo("See your reservation");
            StartOver.userStartOver();

        }

        if(userInput == 4) {
            ConsoleOperators.clearConsole();
            ConsoleOperators.displayInfo("Cancel for reservation");
            StartOver.userStartOver();

        }
    }
}
