/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.demo.jdk8.Lambda;

/**
 * Student
 *
 * @author lilu
 * @since 2018-01-22
 */

import java.util.Comparator;

/**
 * 方法引用与构造函数引用
 */
public class Student {
    public String firstName;
    public String lastName;
    public int age;

    public Student (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public final static Comparator<Student> compareFirstName =
            (lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName);

    public final static Comparator<Student> compareLastName =
            (lhs, rhs) -> lhs.lastName.compareTo(rhs.lastName);

    public final static Comparator<Student> compareAge =
            (lhs, rhs) -> lhs.age - rhs.age;

    public String toString(){
        return firstName+","+lastName+","+age;
    }
}