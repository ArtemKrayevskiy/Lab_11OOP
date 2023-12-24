package org.example;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@ToString
public class User {
    private  int age;
    private  String name;
    private double weight;
    private double height;
    private String gender;
}
