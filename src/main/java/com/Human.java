package com;

import java.util.Random;

public abstract class Human extends Hero {
    private final Random random = new Random();

    public Human(String name) {
        super(name);
    }

    @Override
    void kick(Hero c) {
        int dam = random.nextInt(this.power);
        System.out.println("Damage: " + dam);
        c.setHp(c.getHp() - dam);
    }
}
