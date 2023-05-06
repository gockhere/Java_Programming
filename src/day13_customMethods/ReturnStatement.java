package day13_customMethods;

public class ReturnStatement {

    public static void main(String[] args) {


    eligible(66);

        System.out.println(multiplication(123123131,324234234));

        System.out.println("Test started");

        boolean exit = true;
        if (exit){
            return;//main method gets terminated
        }
        System.out.println("Test 1 completed");//doesnt print

        System.out.println("test2 started");//doesnt print


    }


    public static void eligible(int age){
        if (age <0 || age>150){
            System.err.println("invalid age :"+age);
            return;//exits the method

            // if the age is invalid , then this method gets terminated
        }


    if (age >=21){
        System.out.println("you are eligible to buy alcohol");
    }else {
        System.out.println("you are not eligible to but buy alcohol");
    }



    }

    public static int multiplication(int n1, int n2){
        int result = n1*n2;
        return result;//returns the value when exiting the method
    }




}
