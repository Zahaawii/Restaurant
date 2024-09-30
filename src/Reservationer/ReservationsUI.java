package Reservationer;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Scanner;

public class ReservationsUI {
    static private ReservationsSystem reservationSystem = new ReservationsSystem();
    static Scanner scanner = new Scanner(System.in);
    static LocalDate date = LocalDate.now();

    public static void bookReservation() {
      LocalDate fourteensDaysLater = date.plusDays(14);
      LocalDate userDate = null;

        System.out.println("Name: ");
        String name = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Date for the reservation?" + "\nToday is the: " + date);
        System.out.println("You can book up to " + fourteensDaysLater +
                "\nEnter YYYY-MM-DATE");
        do {
            try {
                userDate = LocalDate.parse(scanner.nextLine());
            }  catch (Exception E) {
                System.out.println("You have chosen a wrong period of date");
            }
        } while (userDate == null || date.isBefore(userDate) || date.isAfter(fourteensDaysLater));

        System.out.println("How many guest are you going to be?: ");
        int numberOfGuest = scanner.nextInt();

        Reservation reservation = reservationSystem.makeReservation(name, String.valueOf(userDate), numberOfGuest);
        System.out.println("Reservations has been placed. \nYour reservationsID is: " + reservation.getId());

    }

    public static void viewAllReservations() {
        System.out.println("Here you can see all reservations");
        for(Reservation res : reservationSystem.getReservations()) {
            System.out.println(res.getId() + " - " + res.getName() + " - " + res.getDate());
        }
    }

    public static void cancelReservation() {
        System.out.println("You want to cancel your reservation" +
                "\nWe need your reservation ID to see if you have a reservation: ");
        int id = scanner.nextInt();

        if(reservationSystem.cancenlReservation(id)) {
            System.out.println("Reservation removed");
        } else {
            System.out.println("Reservation not found");
        }

    }
}
