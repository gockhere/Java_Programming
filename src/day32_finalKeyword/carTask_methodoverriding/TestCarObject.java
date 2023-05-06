package day32_finalKeyword.carTask_methodoverriding;

import day31_inheritance.vehicleTask.Boat;

public class TestCarObject {


    public static void main(String[] args) {



    Toyota toyota=new Toyota("camry","blue",2020,250000);

    Honda honda=new Honda("Accord","gray",2019,24000);

    Audi audi=new Audi("Q6","silver",2021,500000);

    BMW bmw =new BMW("X6","Black",2017,45000);

    Tesla tesla =new Tesla("Model 3","White",2022,65000);


        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println("----------------------------------------");

        toyota.start();
        honda.start();
        audi.start();
        tesla.start();
        bmw.start();

        System.out.println("======================================");


       // tesla.setPrice(49999);

      //  tesla.setModel("model H");
        System.out.println(tesla);



}

}