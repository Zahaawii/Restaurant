package Reservationer;
import java.util.List;
import java.util.ArrayList;

public class ReservationsSystem {

    private List<Reservation> reservations = new ArrayList<>();
    private int nextId = 1;

    public Reservation makeReservation(String name, String date, int numberOfGuest) {
        Reservation reservation = new Reservation(nextId++, name, date, numberOfGuest);
        reservations.add(reservation);
        return reservation;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public Reservation getReservationById(int id) {
        for(Reservation reservation : reservations) {
            if(reservation.getId() == id) {
                return reservation;
            }
        }
        return null;
    }

    public boolean cancenlReservation(int id) {
        Reservation reservation = getReservationById(id);
        if(reservation != null) {
            reservations.remove(reservation);
            return true;
        }
        return false;
    }
}
