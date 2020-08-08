package com.java.lombok.main;

import com.java.lombok.beans.Person;

/**
 * Created by anchao on 2020/8/16
 */
public class LombokMain {

    public static void main(String[] args) {
        Person p = Person.builder().age(16).id(11).name("an").build();
        System.out.println(p);
    }
}
