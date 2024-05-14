package Day02_;

import java.time.LocalDate;

import java.util.Scanner;

public class M09_leapYear_LocalDateParse {

    public static void main(String[] args) {




            Scanner scanner = new Scanner(System.in);

            System.out.println("Lütfen bir tarih giriniz (yyyy-MM-dd formatında):");
            String inputDate = scanner.next();

            LocalDate date = LocalDate.parse(inputDate);

            boolean isLeapYear = date.isLeapYear();



            if(isLeapYear ) {
                System.out.println(date.getYear() + " bir artık yıldır.");
            } else {
                System.out.println(date.getYear() + " bir artık yıl değildir.");
            }



    }
}

