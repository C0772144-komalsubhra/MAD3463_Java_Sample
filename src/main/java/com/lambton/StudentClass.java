package com.lambton;


import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
enum Gender{
    MALE,FEMALE,OTHER
}

public class StudentClass {
    int studentId;
    String firstName;
    String lastName;
    Date birthDate;
    Gender gender;
    float totalMarks;

    public void setData(int studentId,String firstName, String lastName,Date birthDate,Gender gender,float totalMarks){
        this.studentId =studentId;
        this.firstName=firstName;
        this.lastName = lastName;
        this.birthDate=birthDate;
        this.gender=gender;
        this.totalMarks=totalMarks;


    }

    public void printData(){
        System.out.println("Student Id: "+studentId);
        System.out.println("First Name :"+firstName);
        System.out.println("Last Name :"+lastName);
        System.out.println("Birth Date :"+birthDate);
        System.out.println("Gender :"+gender);
        System.out.println("Total Marks :"+totalMarks);
    }

    public void getStudentAge(){
         int age;
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1993,11, 29);
        Period period = Period.between(birthday, today);





    }


}
