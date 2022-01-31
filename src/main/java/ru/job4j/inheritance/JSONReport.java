package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    public static void main(String[] args) {

        JSONReport jsonReport = new JSONReport();
        System.out.println(jsonReport.generate("Report's name", "Report's body"));
    }

    public String generate(String name, String body) {
        String ln = System.lineSeparator();
        return "{" + ln + "\t\"name\" : " + "\"" + name + "\"" + ","
                + ln + "\t\"body\" : " + "\""+ body + "\"" + ln + "}";
    }
}
