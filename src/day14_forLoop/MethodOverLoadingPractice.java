package day14_forLoop;

public class MethodOverLoadingPractice {


    public static void main(String[] args) {

        System.out.println(sum(10,20));

        System.out.println(sum(10,20,30));

        System.out.println(sum(23123,1231231,12312312,1231231231));

        System.out.println(sum(10.3,4.6));

        System.out.println(sum(33.3,11.1,42.4));

        System.out.println(sum(33.3,11.1,42.4,4232.5));

        System.out.println( sum(10, 20.5));



    }


    public  static int sum(int num1 , int num2){
        return num1+num2;
    }

    public static int sum (int num1, int num2, int num3){
        return sum(num1, num2)+num3;
    }

    public static int sum(int num1, int num2, int num3, int num4){

        return sum(num1 , num2, num3)+num4;
    }

    public static double sum(double num1, double num2){

        return num1+num2;

    }

    public static double sum (double num1, double num2, double num3){

        return sum(num1,num2)+num3;
    }

    public static double sum (double num1, double num2, double num3, double num4){
        return sum(num1,num2,num3)+num4;

    }



}
