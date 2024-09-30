package Reservationer;

public class Reservation {

    private int id;
    private String name;
    private String date;
    private int numberOfGuest;

    public Reservation(int id, String name, String date, int numberOfGuest) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.numberOfGuest = numberOfGuest;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.date;
    }

    public int getNumberOfGuest() {
        return this.numberOfGuest;
    }

}
