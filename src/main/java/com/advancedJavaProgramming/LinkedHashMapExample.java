package com.advancedJavaProgramming;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args){
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(4, 0.75f);
        phonebook.put("Adam", 123456);
        phonebook.put("Zbigniew", 654321);
        phonebook.put("Ula", 23453465);
        System.out.println("Adam's number: " + phonebook.get("Adam"));
    }
}
