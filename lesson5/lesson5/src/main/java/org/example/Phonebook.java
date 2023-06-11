package org.example;

import java.util.*;

public class Phonebook {
    public Map<String, List<String>> phoneBook = new HashMap<>();


    public void addContact(String name, String number) {

        if (phoneBook.containsKey(name)) {
            List<String> numbers = phoneBook.get(name);
            numbers.add(number);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            phoneBook.put(name, numbers);
        }
    }

    public void getContact() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = sc.nextLine();

        if (phoneBook.containsKey(name)) {

            System.out.printf("%s: %s", name, phoneBook.get(name));
            System.out.println();
        } else {
            System.out.println("Такого контакта нет");
        }
    }

    public void printPhoneBook() {

        for (String s : phoneBook.keySet()) {
            if (phoneBook.containsKey(s)) {
                System.out.printf("%s : %s", s, phoneBook.get(s));
                System.out.println();
            }
        }
    }

    private Map<String, Integer> sortCountPhonebook() {

        // множество имя и количество номеров
        Map<String, Integer> unsortedCountPhonebook = new HashMap<>();
        for (String s : phoneBook.keySet()) {
            unsortedCountPhonebook.put(s, phoneBook.get(s).size());
        }

        List<Integer> valuesUnsortedCountPhonebook = new ArrayList<>();
        Map<String, Integer> sortedCountPhonebook = new LinkedHashMap<>();

        // сортируем лист с количеством номеров в множестве
        // unsortedCountPhonebook по убыванию
        for (var item : unsortedCountPhonebook.entrySet()) {
            valuesUnsortedCountPhonebook.add(item.getValue());
        }
        Collections.sort(valuesUnsortedCountPhonebook,
                Collections.reverseOrder());

        // получаем отсортированное множестов имя и количество номеров
        for (int i = 0; i < valuesUnsortedCountPhonebook.size(); i++) {
            int count = valuesUnsortedCountPhonebook.get(i);
            for (var item : unsortedCountPhonebook.entrySet()) {
                if (item.getValue().equals(count)) {
                    sortedCountPhonebook.put(item.getKey(), count);
                    valuesUnsortedCountPhonebook.set(i, 0);
                    unsortedCountPhonebook.remove(item);
                }
            }
        }
        return sortedCountPhonebook;


    }

    public void printSortedPhonebook() {
        Map<String, Integer> sortedCountPhonebook = sortCountPhonebook();
        for (var item : sortedCountPhonebook.entrySet()) {
            if (phoneBook.containsKey(item.getKey())) {
                System.out.println(item.getKey() + " : " +
                        phoneBook.get(item.getKey()));
            }
        }
    }


}
