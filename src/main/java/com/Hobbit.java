package com;

public class Hobbit extends Hero{
    public Hobbit(String name) {
        super(name);
        this.power = 0;
        this.hp = 3;
    }

    private void toCry(){
        System.out.println("Hobbit's tears");
    }

    @Override
    void kick(Hero c) {
        toCry();
    }
}
