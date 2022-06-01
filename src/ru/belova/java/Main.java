package ru.belova.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<PhoneNumber> numbers = new HashSet<>();
        PhoneNumber number1 = new PhoneNumber("12", "123456");
        PhoneNumber number2 = new PhoneNumber("166", "1234967");
        PhoneNumber number3 = new PhoneNumber("124", "9234567");
        PhoneNumber number4 = new PhoneNumber("712", "8234567");
        PhoneNumber number5 = new PhoneNumber("9992", "1934567");
        PhoneNumber number6 = new PhoneNumber("42", "1235567");
        PhoneNumber number7 = new PhoneNumber("72", "1534567");
        PhoneNumber number8 = new PhoneNumber("8882", "123457");

        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);
        numbers.add(number7);
        numbers.add(number8);


        numbers.forEach(System.out::println);
        System.out.println(numbers.contains(number2));

        Map<PhoneNumber, String> map = new HashMap<>();
        map.put(number1, "Иванов");
        map.put(number2, "Петров");
        map.put(number3, "Водкин");

        System.out.println("Номер Иванова " + "Иванов".equals(map.get(number1)));

    }
}
