package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i=10; i>= 5 ; i--){

            System.out.println("Hello Cydeo" + i);// prints 6 times

        }


        System.out.println("--------------------------------------");


        // sum of all number 1-100

        int sum = 0;

        for (int i = 1; i<=100; i++){
            sum +=i;

        }
        System.out.println(sum);

        System.out.println();

        System.out.println("==========================================");

       for (char i = 'A'; i<='Z'; i++ ) {
           System.out.print(i+ " ");
       }
        System.out.println();// for starting new line you have to add empty print ln

        System.out.println("=========================================");


        for (char i = 'Z'; i>='A';i--){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("cydeo");






    }
}
