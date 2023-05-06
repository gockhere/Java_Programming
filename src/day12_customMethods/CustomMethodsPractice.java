package day12_customMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        maxNumber(10000,5000);
        System.out.println("====================================");
        maxNumber(10.3,22.4);
        initials("goker","karaca");
        initials("roni","karaca");



    }
    public static void maxNumber (double num1, double num2){

        if (num1>num2){
            System.out.println(num1 + " is the max number");
        } else if (num2>num1){
            System.out.println(num2 + " is the max number");
        } else {
            System.out.println("equal");
        }

    }

    public static void initials (String firstName, String lastName){

        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        System.out.println("initial is :"+initial);


    }








}
