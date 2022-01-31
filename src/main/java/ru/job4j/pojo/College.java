package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov Ivan");
        student.setGroup("73a");
        student.setDateOfEnroll(new Date());

        System.out.println(student.getFio() + ", in group #"
                + student.getGroup() + ", was enrolled - " + student.getDateOfEnroll());
    }
}
