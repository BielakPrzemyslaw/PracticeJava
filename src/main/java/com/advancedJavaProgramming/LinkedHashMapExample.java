package com.advancedJavaProgramming;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args){
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(4, 0.75f, false);
        phonebook.put("Adam", 123456);
        phonebook.put("Zbigniew", 654321);
        phonebook.put("Ula", 23453465);
        phonebook.put("Stefan", 15395);
        System.out.println("Adam's number: " + phonebook.get("Adam"));

        System.out.println("\nList of contact in phonebook:");
        for(Map.Entry<String, Integer> entry: phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
