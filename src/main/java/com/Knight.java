package com;

import java.util.Random;

public class Knight extends Human {
    private final Random random = new Random();

    public Knight(String name) {
        super(name);
        this.hp = random.nextInt(10) + 2;
        this.power = random.nextInt(10) + 2;
    }

    @Override
    void kick(Hero c) {
        System.out.println("Knight is kicking...");
        super.kick(c);
    }
}
