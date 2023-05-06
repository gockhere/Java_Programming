package day16_nestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition= false;

        for (;condition;){
            System.out.println("hello cydeo  == for loop");// never prints because its false
        }

        System.out.println("===========================");

        while(condition){
            System.out.println("hello cydeo-- while loop "); // never prints
        }

        System.out.println("=========================");



        do {
            System.out.println("hello cydeo -- do&while loop");
        }while (condition);



    }
}
