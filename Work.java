package ru.geekbrains.lesson10;

import java.util.*;

public class Work {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Dog", "Cat", "Java",
                "Mouse", "Truck", "Kitty",
                "Dog", "Cat", "Java",
                "Linux", "Mouse", "Linux",
                "Dog", "Mouse", "Window",
                "Cat", "Java", "Dog", "Dog"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("Korzhik", "8999123321");
        directory.add("Korzhik", "8912155326");
        directory.add("Volodya", "8917155552");
        directory.add("Volodya", "8913455672");
        directory.add("Dimasik", "899999999");
        directory.add("Denis", "899111111");
        directory.add("Bobrov", "89923231999");
        directory.add("Kazah", "8888123113");
        directory.add("Boobs", "8324325234");

        System.out.println(directory.get("Korzhik"));
        System.out.println(directory.get("Volodya"));
        System.out.println(directory.get("Bobrov"));
        System.out.println(directory.get("Boobs"));
    }

}
