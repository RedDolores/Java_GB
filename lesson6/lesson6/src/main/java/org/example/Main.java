package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notebook notebook1 = new Notebook("Lenovo", "pink");
        Notebook notebook2 = new Notebook("MacBook", "gold");
        Notebook notebook3 = new Notebook("Xiaomi", "gold");
        Notebook notebook4 = new Notebook("Sony", "black");
        Notebook notebook5 = new Notebook("Lenovo", "black");
        Notebook notebook6 = new Notebook("Sony", "pink");
        Notebook notebook7 = new Notebook("Lenovo", "silver");
        Notebook notebook8 = new Notebook("Xiaomi", "silver");
        Notebook notebook9 = new Notebook("Байкал", "white");
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);

        String phrase = "Введите номер фильтра:\n" +
                "1: Бренд\n" +
                "2: Цвет\n" +
                "3: Выход";
        System.out.println(phrase);
        int choiceFilter = sc.nextInt();
        Notebook notebookEx = new Notebook(null, null);
        while (choiceFilter != 3) {
            switch (choiceFilter) {
                case 1:
                    System.out.println("Введите название бренда: ");
                    String name = sc.next();
                    notebookEx.setName(name);
                    break;
                case 2:
                    System.out.println("Введите желаемый цвет: ");
                    String color = sc.next();
                    notebookEx.setColor(color);
                    break;

            }
            System.out.println(phrase);
            choiceFilter = sc.nextInt();
        }

        filter(notebooks, notebookEx);
    }

    static void filter(List<Notebook> notebooks, Notebook example) {
        for (Notebook notebook : notebooks) {
            if (example.equals(notebook)) {
                System.out.println(notebook);
            }
        }
    }

}