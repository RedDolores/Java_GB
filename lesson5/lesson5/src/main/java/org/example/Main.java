package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook1 = new Phonebook();

        phonebook1.addContact("Ivan", "123456");
        phonebook1.addContact("Petr", "234567");
        phonebook1.addContact("Slava", "345678");
        phonebook1.addContact("Dima", "456789");
        phonebook1.addContact("Petr", "567891");
        phonebook1.addContact("Ivan", "123458");

        phonebook1.printPhoneBook();
        System.out.println();

        phonebook1.getContact();
        System.out.println();

        phonebook1.printSortedPhonebook();
    }
}