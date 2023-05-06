package day13_customMethods;

public class returnMethodsPractice {

    public static void main(String[] args) {


        System.out.println(isOdd(4));
        System.out.println(isEven(4));

        int num1 = 333;

        if (isOdd(num1) ){
            System.out.println(num1+"is odd number ");
        }else {
            System.out.println(num1+"is even number");


        }
        System.out.println("===================================");






    }

    public static boolean isOdd (int num){

        return (num %2!=0)?true:false;

    }

    public static boolean isEven (int num){
         return !isOdd(num); //return (num %2==0)?true:false;
    }

    public static int max (int num2, int num1){
        //return  num1>num2?num1:num2;

        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }






}
