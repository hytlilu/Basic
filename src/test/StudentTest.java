/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package test;

import com.demo.jdk8.Lambda.Student;
import org.junit.Test;

import java.util.*;

/**
 * StudentTest
 *
 * @author lilu
 * @since 2018-01-22
 */
public class StudentTest {
    
    public static void main(String[] args){
        int delayTime = (int) ((1544770441000L - System.currentTimeMillis() - 30 * 60 * 1000)
                        / (60 * 1000));
        System.out.println(delayTime);
    }

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

    @Test
    public void testTime(){
        Long remainingTime = 1537207261000L - System.currentTimeMillis() > 1000 ?
                1537207261000L - System.currentTimeMillis() / 1000 : 0L;
        System.out.println(remainingTime);
    }

    @Test
    public void testList(){
        List<String> list = new ArrayList<>();
        list.add("s");
        Collections.addAll(list,"str1","str2","str3","str4","str5");
        list.forEach(str->{
            System.out.println(list);
            list.remove(str);
        });
        try {
            Iterator<String> i = list.iterator();
            while(i.hasNext()) {
                String element = i.next();
                if (element.equalsIgnoreCase("str4")){
                    list.remove("str4");
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}