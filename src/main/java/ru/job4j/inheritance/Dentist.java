package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int wasBitten;

    public Dentist(String name, String surname, String education, String birthday, boolean internship, int wasBitten) {
        super(name, surname, education, birthday, internship);
        this.wasBitten = wasBitten;
    }

    public int getWasBitten() {
        return wasBitten;
    }
}
