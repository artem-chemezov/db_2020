package com;

import java.util.Random;

public class GameManager {
    private final Random random = new Random();

    public void fight(Hero c1, Hero c2){
        System.out.println("First fighter is " + c1.getClass().getSimpleName() + " || Name: " + c1.getName() + " || Hp: " + c1.getHp() + " || Power: " + c1.getPower());
        System.out.println("Second fighter is " + c2.getClass().getSimpleName() + " || Name: " + c2.getName() + " || Hp: " + c2.getHp() + " || Power: " + c2.getPower());
        System.out.println("--------------------------------------------------------------------------------");
        while (c1.isAlive() && c2.isAlive()){
            if (random.nextBoolean()) {

                System.out.println("First fighter is kicking...");
                c1.kick(c2);
                System.out.println(" --- " + c1.getName() + " Hp: " + c1.getHp() + " Power: " + c1.getPower());
                System.out.println(" --- " + c2.getName() + " Hp: " + c2.getHp() + " Power: " + c2.getPower());
                System.out.println();

                System.out.println("Second fighter is kicking...");
                c2.kick(c1);
                System.out.println(" --- " + c1.getName() + " Hp: " + c1.getHp() + " Power: " + c1.getPower());
                System.out.println(" --- " + c2.getName() + " Hp: " + c2.getHp() + " Power: " + c2.getPower());

                System.out.println("--------------------------------------------------------------------------------");
            }
            else {

                System.out.println("Second fighter is kicking...");
                c2.kick(c1);
                System.out.println(" --- " + c1.getName() + " Hp: " + c1.getHp() + " Power: " + c1.getPower());
                System.out.println(" --- " + c2.getName() + " Hp: " + c2.getHp() + " Power: " + c2.getPower());
                System.out.println();

                System.out.println("First fighter is kicking...");
                c1.kick(c2);
                System.out.println(" --- " + c1.getName() + " Hp: " + c1.getHp() + " Power: " + c1.getPower());
                System.out.println(" --- " + c2.getName() + " Hp: " + c2.getHp() + " Power: " + c2.getPower());

                System.out.println("--------------------------------------------------------------------------------");
            }
        }
        System.out.println("It was the great battle!");
        if (c1.isAlive() && !c2.isAlive()){
            System.out.println("First hero " + c1.getName() + " win!");
        }
        else if (!c1.isAlive() && c2.isAlive()){
            System.out.println("Second hero " + c2.getName() + " win!");
        }
        else{
            System.out.println("Both are dead :(");
        }
    }
}
