package com.sample.closure;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by francis on 6/17/2017.
 */
public class Person {

    Person(String name, LocalDate birthday, Gender gender, String email) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = email;

    }

    public enum Gender {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Gender gender;
    String emailAddress;

    public int getAge() {
        LocalDateTime today = LocalDateTime.now();
        //today - this.gender;
        return 1;
    }

    public void printPerson() {
        System.out.print(this.name);
    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }
}
