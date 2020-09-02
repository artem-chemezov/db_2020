package com;

public class Main {
    public static void main(String[] args) {
        HeroFactory factory = new HeroFactory();
        Hero c1 = factory.createHero();
        Hero c2 = factory.createHero();

        GameManager manager = new GameManager();
        manager.fight(c1, c2);
    }
}
