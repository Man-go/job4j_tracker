package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combName = s -> s.getName().contains(key);
        Predicate<Person> combSurname = s -> s.getSurname().contains(key);
        Predicate<Person> combPhone = s -> s.getPhone().contains(key);
        Predicate<Person> combAddress = s -> s.getAddress().contains(key);

        Predicate<Person> combine = combName.or(combSurname).or(combPhone).or(combAddress);

        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}