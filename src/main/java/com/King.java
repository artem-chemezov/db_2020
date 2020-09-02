package com;

import java.util.Random;

public class King extends Human {
    private final Random random = new Random();

    public King(String name) {
        super(name);
        this.hp = random.nextInt(10) + 5;
        this.power = random.nextInt(10) + 5;
    }

    @Override
    void kick(Hero c) {
        System.out.println("King is kicking...");
        super.kick(c);
    }
}
