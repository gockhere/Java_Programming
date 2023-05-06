package day10_string;

import java.util.Scanner;
/*import java.lang.String;
import java.lang.System;*/

public class StringIntro {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String str ="java";

        System.out.println( );

        input.close();

        System.out.println("=============================");

        String s1= "cat";
        String s2= "dog";
        String s3= "cat";
        String s4= "cat";

        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s3==s4);


        System.out.println("==============================================");
        String str1 =new String("Java");// creates 2 objects :1. String pool , 2.in heap (outside pool)
        String str2 = new String("Java");

        System.out.println(str1==str2);//false


        System.out.println("==============================================");


        String t1 ="Python";
        String t2 = new String("Python");
        String t3 = new String("Python");

        System.out.println(t1==t2);
        System.out.println(t1==t3);
        System.out.println(t2==t3);









    }
}
