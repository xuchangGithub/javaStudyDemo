package com.cloud;

import com.entity.Student;

public class Test {
    public static void main(String[] args){

          Integer a = 20;
         String b = "str";
         Long c = 11L;
        Student stu = new Student(a,b,c);

        String s = stu.toString();
        System.out.println(s);

    }
}
