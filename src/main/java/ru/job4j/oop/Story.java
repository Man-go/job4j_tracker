package ru.job4j.oop;

public class Story {

    public static void main(String[] args) {
        Pioneer petry = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();

        girl.help(petry);
        wolf.eat(girl);
        petry.kill(wolf);

    }
}
