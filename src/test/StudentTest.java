/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package test;

import com.demo.jdk8.Lambda.Student;
import org.junit.Test;

import java.util.Arrays;

/**
 * StudentTest
 *
 * @author lilu
 * @since 2018-01-22
 */
public class StudentTest {

    @Test
    public void testStudent(){
        Student[] students = new Student[]{
                new Student("Ted", "Neward", 41),
                new Student("Charlotte", "Neward", 41),
                new Student("Michael", "Neward", 19),
                new Student("Matthew", "Neward", 13)
        };
        //sort by firstName
        Arrays.sort(students, (lhs, rhs)->lhs.firstName.compareTo(rhs.firstName));
        Arrays.sort(students, Student.compareAge);  //这里直接引用lambda
        System.out.println(Arrays.asList(students));
    }
}