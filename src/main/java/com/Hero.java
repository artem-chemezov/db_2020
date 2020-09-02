package com;

public abstract class Hero {
    protected String name;
    protected int hp;
    protected int power;

    public Hero(String name) {
        this.name = name;
    }

    abstract void kick(Hero c);
    protected boolean isAlive(){
        return this.hp > 0;
    };

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
