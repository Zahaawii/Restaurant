import java.util.Scanner;
import java.util.ArrayList;

public class Menuer {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList <String> wineMenu = new ArrayList<>();
    static ArrayList <String> foodMenuAppetizers = new ArrayList<>();
    static ArrayList <String> foodMenuMain = new ArrayList<>();
    static ArrayList <String> foodMenuVegan = new ArrayList<>();
    static int winePrice = 500;

    public static void showMenues() {
        System.out.println("We have following menues: \n1. Appetizers \n2. Main menu \n3. Vegan Menu \n4. Wine menu");
        showAppetizers();
        showMainMenu();
        showVeganMenu();
        showWineMenu();
    }

    public static void showAppetizers() {
        ConsoleOperators.printSeperator(30);
        System.out.println("Appetizers");
            foodMenuAppetizers();
            for(String menuAppetizers : foodMenuAppetizers){
                System.out.println(menuAppetizers);
            }
        }


    public static void showMainMenu() {
        ConsoleOperators.printSeperator(30);
        System.out.println("Main menu");
        foodMenuMainmenu();
        for(String menuMain : foodMenuMain) {
            System.out.println(menuMain);
        }
    }


    public static void showVeganMenu() {
        ConsoleOperators.printSeperator(30);
        System.out.println("Vegan Menu");
        FoodMenuForVegans();
        for(String menuVegans : foodMenuVegan) {
            System.out.println(menuVegans);
        }
    }


    public static void showWineMenu() {
        ConsoleOperators.printSeperator(30);
        System.out.println("Wine menu");
        wineMenu();
        for(String menuWine : wineMenu) {
            System.out.println(menuWine);
        }
    }


    public static void menuMedVin() {
        System.out.println("Would you like with or without wine menu? \nPress Y/N");
        ConsoleOperators.printSeperator(30);
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("Y")) {
            System.out.println("Det bliver yderligere: " + winePrice + " kr for vin menu");
        }
    }

    public static void wineMenu() {
        wineMenu.add("1. Bordeaux");
        wineMenu.add("2. Merlot");
        wineMenu.add("3. Germinstramuse");
        wineMenu.add("4. Burgundy");
    }

    public static void foodMenuAppetizers() {
        foodMenuAppetizers.add("1. Hummus");
        foodMenuAppetizers.add("2. Baba ganush");
        foodMenuAppetizers.add("3. Tabouleh");
        foodMenuAppetizers.add("4. Cerviche");
    }

    public static void foodMenuMainmenu() {
        foodMenuMain.add("1. Wagyu meat");
        foodMenuMain.add("2. Beef with bernaise");
        foodMenuMain.add("3. Sharwama roll");
        foodMenuMain.add("4. Sushi");
        foodMenuMain.add("5. Lobster");
    }

    public static void FoodMenuForVegans() {
        foodMenuVegan.add("1. Falafel");
        foodMenuVegan.add("2. Salat");
        foodMenuVegan.add("3. Greek salad");
        foodMenuVegan.add("4. Aubergine salat");
    }

}
