package com;

public class Elf extends Hero{
    public Elf(String name) {
        super(name);
        this.hp = 10;
        this.power = 10;
    }

    @Override
    void kick(Hero c) {
        if (c.getPower() < this.power){
            c.setHp(0);
            System.out.println("Enemy is dead!");
        }
        else{
            c.setPower(c.getPower() - 1);
            System.out.println("Enemy's power is decreasing!");
        }
    }
}
