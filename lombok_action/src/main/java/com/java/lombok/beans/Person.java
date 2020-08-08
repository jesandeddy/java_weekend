package com.java.lombok.beans;

import lombok.Builder;
import lombok.Data;

/**
 * Created by anchao on 2020/8/16
 */
@Data
@Builder
public class Person {

    private int id;

    private String name;

    private int age;

}
