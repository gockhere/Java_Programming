package day06_ifStatements;

import java.sql.SQLOutput;

public class OperatorsPrecedence {

    public static void main(String[] args) {

        System.out.println(5+2*3); // 11
        System.out.println(7 + 3 -2 /2); //9
        System.out.println(-5+3);//-2


        System.out.println(10 > 9 == 8 < 7);
        //                  true == false
        //                     false

        System.out.println(10 > 9 == 8 < 7 && "Java" == "Python" || 'a'== 'A' );
        //                   true == false && java == python || 'a' == 'A'
        //                         FALSE  &&     FALSE        || FALSE
        //                           FALSE                    || FALSE
        //                                FALSE


        System.out.println(100 >= 20 && 40*2 >60);
        //                  100 >= 20 && 80 >60
        //                    true    && true

        int a= 20 ;
        a += 10 +2 *3;
        // a += 16
        // a = 36








    }
}
