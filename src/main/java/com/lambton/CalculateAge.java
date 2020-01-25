package com.lambton;



import java.time.LocalDate;
import java.time.Period;
import java.time.Month;

public class CalculateAge {
        public static void main(String[] args) {
            LocalDate today = LocalDate.now();
            LocalDate birthday = LocalDate.of(1993,11, 29);

            Period p = Period.between(birthday, today);
            System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                    " months, and " + p.getDays() +
                    " days old.");
        }
    }

