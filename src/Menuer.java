import java.util.Scanner;
import java.util.ArrayList;

public class Menuer {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList <String> foodMenuAppetizers = new ArrayList<>();
    static ArrayList <String> foodMenuMain = new ArrayList<>();
    static ArrayList <String> foodMenuVegan = new ArrayList<>();
    static ArrayList <String> wineMenu = new ArrayList<>();
    static ArrayList <String> makeYourOwnMenu = new ArrayList<>();
    public static int Appetizers = 1;
    public static int mainMenu = 2;
    public static int menuVegan = 3;

    static int winePrice = 500;

    public static void showMenues() {
        System.out.println("We have following menues: \n1. Appetizers \n2. Main menu \n3. Vegan Menu \n4. Wine menu");
        showAppetizers();
        showMainMenu();
        showVeganMenu();
        showWineMenu();
    }

    private static void showAppetizers() {
        ConsoleOperators.printSeperator(30);
        System.out.println("Appetizers");
            foodMenuAppetizers();
            for(String menuAppetizers : foodMenuAppetizers){
                System.out.println(menuAppetizers);
            }
        }


    private static void showMainMenu() {
        ConsoleOperators.printSeperator(30);
        System.out.println("Main menu");
        foodMenuMainmenu();
        for(String menuMain : foodMenuMain) {
            System.out.println(menuMain);
        }
    }


    private static void showVeganMenu() {
        ConsoleOperators.printSeperator(30);
        System.out.println("Vegan Menu");
        FoodMenuForVegans();
        for(String menuVegans : foodMenuVegan) {
            System.out.println(menuVegans);
        }
    }


    private static void showWineMenu() {
        ConsoleOperators.printSeperator(30);
        System.out.println("Wine menu");
        wineMenu();
        for(String menuWine : wineMenu) {
            System.out.println(menuWine);
        }
    }

    public static void showOwnMenu() {

        System.out.println("Now you can make your own with five servings. " +
                "Type the name of the dishes you want to add");

        makeYourOwnMenu();
        for(String ownMenu : makeYourOwnMenu) {
            System.out.println(ownMenu);
        }
        menuMedVin();
    }
    private static ArrayList makeYourOwnMenu() {
        makeYourOwnMenu.add(scanner.nextLine());
        makeYourOwnMenu.add(scanner.nextLine());
        makeYourOwnMenu.add(scanner.nextLine());
        makeYourOwnMenu.add(scanner.nextLine());
        makeYourOwnMenu.add(scanner.nextLine());
        return makeYourOwnMenu;
    }


    private static void menuMedVin() {
        System.out.println("Would you like with or without wine menu? \nPress Y/N");
        ConsoleOperators.printSeperator(30);
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("Y")) {
            System.out.println("The price will be: " + winePrice + " DKK extra for the winemenu");
        } else {
            System.out.println("Wine menu not chosen");
        }
    }

    private static ArrayList wineMenu() {
        wineMenu.add("1. Bordeaux");
        wineMenu.add("2. Merlot");
        wineMenu.add("3. Germinstramuse");
        wineMenu.add("4. Burgundy");
        return wineMenu;
    }

    private static ArrayList foodMenuAppetizers() {
        foodMenuAppetizers.add("1. Hummus");
        foodMenuAppetizers.add("2. Baba ganush");
        foodMenuAppetizers.add("3. Tabouleh");
        foodMenuAppetizers.add("4. Cerviche");
        return foodMenuAppetizers;
    }

    private static ArrayList foodMenuMainmenu() {
        foodMenuMain.add("1. Wagyu meat");
        foodMenuMain.add("2. Beef with bernaise");
        foodMenuMain.add("3. Sharwama roll");
        foodMenuMain.add("4. Sushi");
        foodMenuMain.add("5. Lobster");
        return foodMenuMain;
    }

    private static ArrayList FoodMenuForVegans() {
        foodMenuVegan.add("1. Falafel");
        foodMenuVegan.add("2. Salat");
        foodMenuVegan.add("3. Greek salad");
        foodMenuVegan.add("4. Aubergine salat");
        return foodMenuVegan;
    }

}
