package day11_string;

import java.util.Scanner;

public class digitLetterSpecialChar {
    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();

        if (str.length()>=1){//if the string has at least one character
            char f = str.charAt(0);//the first character of the string

            if(f>='0' && f<='9'){
                System.out.println("firs character is digit");

            } else if (f >= 'A'&& f<= 'Z') {
                System.out.println("first character is upper case");

            } else if (f>='a' && f<='z') {
                System.out.println("first character is lower case");

            }else {
                System.out.println("first character is special character");
            }


        }else {// if string is empty
            System.out.println("string is empty");
        }



    }

}
