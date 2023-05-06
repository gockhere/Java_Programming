package day32_finalKeyword;

import java.time.LocalDate;

class CydeoStudent{
    public final void language(){
        System.out.println("Java Programming");
    }
}
public class FinalKeyword extends CydeoStudent{

/*
    public void language(){ // final method can never be overriding
        System.out.println("Python Programming");
    }

 */


    public  FinalKeyword (){

    }



    public static void main(String[] args) {


       final char gender='M';


        System.out.println(gender);

       // gender='F';

        System.out.println(gender);


        System.out.println("==================================");


        final LocalDate dateOfBirth=LocalDate.now();


        System.out.println(dateOfBirth);

       // dateOfBirth= dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);


        System.out.println("-----------------------------");


        new CydeoStudent().language();//Java Programming
        new FinalKeyword().language();//Java Programming


        System.out.println("=========================================");

        String name ="James";

        //name=null;

        //name="Daniel";

        System.out.println(name);





    }
}
