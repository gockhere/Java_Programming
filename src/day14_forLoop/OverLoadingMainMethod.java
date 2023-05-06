package day14_forLoop;

public class OverLoadingMainMethod {

    public static void main(String args) {


        System.out.println('A');

        main(20.3);//c
        main (3);//b
        main(true);//d



    }


    public static void main(int args) {

        System.out.println('B');


    }

    public static void main(double args) {

        System.out.println('C');


    }


    public static void main(boolean args) {

        System.out.println('D');




    }






}
