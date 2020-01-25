package com.lambton;

import java.util.Date;

public class StudentClassMain {
    public static void main(String[] args) {
         StudentClass s1 = new StudentClass();
         s1.setData(1,"komal","Subhra",new Date(1993,11,29),Gender.FEMALE,100);
         s1.printData();
         s1.getStudentAge();

    }
}
