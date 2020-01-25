package com.lambton;

import java.util.Date;

public class StudentClassMain {
    public static void main(String[] args) {
         StudentClass s1 = new StudentClass();
         s1.setData(1,"komal","Subhra",new Date(2020),Gender.FEMALE,100);
         s1.printData();

    }
}
