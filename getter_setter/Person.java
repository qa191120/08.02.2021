package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
//@AllArgsConstructor
public class Person {

    // every field is private or protected
    // sometimes (more rare) may be default ...
    // public NEVER!!!! [data-holder]

    private @Getter @Setter String name;

    //public int age; // NOT NEVER !!!!!!!!!!!!
    private int age;

    public int getAge() {
        return age;
    }

    //public void setAge(int newValue) {
//        if (newValue > 0 && newValue < 120) {
//            age = newValue;
//        }
//    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Setter + boolean
    public boolean setAge(int newValue) {
        if (newValue > 0 && newValue < 120) {
            age = newValue;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (!newName.isEmpty() && newName.length() > 2) {
            name = newName;
        }
    }

    // ctor

    // other functions
    public void goToArmy() {
        age += 3;
    }
}
