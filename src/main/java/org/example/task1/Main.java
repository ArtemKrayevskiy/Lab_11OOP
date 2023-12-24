package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder()
                .name("Artem")
                .age(18)
                .gender("m")
                .height(189)
                .weight(83)
                .mark(61)
                .mark(62)
                .mark(100)
                .build();
        System.out.println(user);
    }
}