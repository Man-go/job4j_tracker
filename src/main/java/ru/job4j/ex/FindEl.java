package ru.job4j.ex;

public class FindEl {

    public static void main(String[] args) {
        String[] strings = new String[]{"aaaa", "bbbb", "cccc"};
        try {
            int index = indexOf(strings, "ffff");
            System.out.println(index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Don't have such element");
        }
        return rsl;
    }
}