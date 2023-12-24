package org.example.task2;

import lombok.Getter;

enum Gender{
    MALE, FEMALE
}
@Getter
public class Client {
    private static int nextId = 0;
    private int id;
    private String name;
    private Gender gender;
    private int age;

    public Client(String name , Gender gender, int age){
        id = nextId++;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
