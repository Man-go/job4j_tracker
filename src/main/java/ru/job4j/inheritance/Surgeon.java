package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int numberOfCorpses;

    public Surgeon(String name, String surname, String education, String birthday, boolean internship, int numberOfCorpses) {
        super(name, surname, education, birthday, internship);
        this.numberOfCorpses = numberOfCorpses;
    }

    public int getNumberOfCorpses() {
        return numberOfCorpses;
    }
}
