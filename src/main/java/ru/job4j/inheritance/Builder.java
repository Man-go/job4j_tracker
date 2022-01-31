package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String technologies;

    public Builder(String name, String surname, String education, String birthday, String company, String technologies) {
        super(name, surname, education, birthday, company);
        this.technologies = technologies;
    }

    public String getTechnologies() {
        return technologies;
    }
}
