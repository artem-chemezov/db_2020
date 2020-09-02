package com;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class HeroFactory {
    private final int amount = Heroes.values().length;
    private Random random = new Random();

    public Hero createHero() {
        String name = JOptionPane.showInputDialog("input name");
        Object object = null;

        Class<?> clazz = null;
        try {
            clazz = Class.forName("com." + String.valueOf(Heroes.values()[random.nextInt(amount)]));
            Constructor<?> ctor = clazz.getConstructor(String.class);
            object = ctor.newInstance(new Object[] { name });
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (Hero) object;
    }
}
