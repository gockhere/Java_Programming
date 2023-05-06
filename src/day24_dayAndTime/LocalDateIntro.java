package day24_dayAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthDay = LocalDate.of(1989,10,26) ;

        System.out.println(birthDay);


        System.out.println("======================get methods========================");

        System.out.println(today.getYear()  );

        System.out.println(today.getMonth() );

        System.out.println(today.getMonthValue() );

        System.out.println(today.getDayOfWeek() );

        System.out.println(birthDay.getDayOfWeek());

        System.out.println(today.getDayOfMonth() );

        System.out.println(today.getDayOfYear());

        System.out.println("======================plus methods========================");

        today = today.plusYears(1);

        System.out.println(today);

        LocalDate graduationDate = LocalDate.of(2025,6,4);

        graduationDate= graduationDate.plusYears(2); //2027-6-4

        System.out.println(graduationDate);

        graduationDate=graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        graduationDate=graduationDate.plusWeeks(7);

        System.out.println(graduationDate);

        graduationDate=graduationDate.plusDays(100);

        System.out.println(graduationDate);


        System.out.println("======================minus methods================================");

        LocalDate yourBirthDay= LocalDate.of(2005,4,1);

       LocalDate yourBrotherBirthDay= yourBirthDay.minusYears(2).minusMonths(3);

        System.out.println(yourBirthDay);

        System.out.println(yourBrotherBirthDay);

        System.out.println("======================is methods================================");

        LocalDate birthDay1= LocalDate.of(1989,10,26);
        LocalDate birthDay2= LocalDate.of(2001,6,11);

        boolean r1=birthDay1.isEqual(birthDay2);

        System.out.println(r1);

        System.out.println("--------------------------------------------");

        LocalDate gradDate = LocalDate.of(2023,8,29);

        System.out.println(gradDate.isBefore(LocalDate.of(2022,12,31)));

        System.out.println(gradDate.isAfter(LocalDate.of(2022,5,6)));

        System.out.println("--------------is leap year-----------------------");

        System.out.println(LocalDate.of(2022,6,16).isLeapYear());





    }
}