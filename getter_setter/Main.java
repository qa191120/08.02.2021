package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // getter setter
        Person p = new Person("Moshe", 20);
        p.goToArmy();
        p.setAge(-1);
        p.setAge(25);
        // p.age = -1;
        // private age
        // getAge
        // setAge( age )
        System.out.println(String.format("%s age is: %d", p.getName(), p.getAge()));

        // this
        // m_member
        // ctor to ctor

        // inheritance

        System.out.println("Please enter new age for Moshe:");
        int age = s.nextInt();
        if (p.setAge(age)) {
            System.out.println("Age was changed");
        } else
        {
            System.out.println("The age was illegal and did not change");
        }

        // class BankAccount
        // private double balance;
        // private String account_number;
        // private final String owner_name
        // ctor which gets account_number + balance + owner_name
        //    calls account_number setter
        //    sets the balance
        // no lombok!
        // create getter which returns the balance
        // no setter
        // create getter for account_number
        // create setter for account_number which needs to have exactly
        //      10 characters
        // deposit (amount) -> balance += amount
        // withdraw (amount) -> balance -= amount
        // create getter for owner_name using lombok
        // @ToString

    }
}
