import java.util.Scanner;

public class UserChoiceMenues {

    static Scanner scanner = new Scanner(System.in);
    public static int userMenuChoice;

    public static void userDecision() {
        ConsoleOperators.clearConsole();
        ConsoleOperators.displayInfo("Decide which menu you would like to order");
        Menuer.showMenues();

        System.out.println("You can mix up your own menu" +
                "\nPress Y to make your own menu or N to choose an menu from the chef");

        String userMenuDecision = scanner.nextLine();

        if(userMenuDecision.equalsIgnoreCase("Y")) {
            Menuer.showOwnMenu();
        }

        if (!userMenuDecision.equalsIgnoreCase("Y")) {
            System.out.println("You can choose between the chefs menues"
                    + "\nPress 1 for Main menu" + "\nPress 2 for Vegan menu");
            userMenuChoice = scanner.nextInt();
            }

        switch (userMenuChoice) {
            case 1:
                System.out.println("You have chosen the Main menu");
                System.out.println("Your order has been taken");
                break;
            case 2:
                System.out.println("You have chosen the vegan menu");
                System.out.println("Your order has been taken");
        }
    }
}
