package ru.job4j.inheritance;

public class Doctor extends Profession {

    private boolean internship;

    public Doctor(String name, String surname, String education, String birthday, boolean internship) {
        super(name, surname, education, birthday);
        this.internship = internship;
    }

    public boolean isInternship() {
        return internship;
    }
}
