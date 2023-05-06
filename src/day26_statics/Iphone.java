package day26_statics;

public class Iphone {

    public static String brand="Apple"; // STATIC:"apple" is the brand of all the iphone objects
    public String model;
    public String color ;
    public double price;
    public static String OS = "IOS";
    public static String madeIn= "China";

    public static boolean hasBattery=true;

    public static boolean isTouchScreen=true;

    public static boolean isExpensiveToFix= true;

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    /*
    public static void printPhoneInfo(){// static only accepts statics
        System.out.println("model: "+model);
        System.out.println("color: "+color);
    }


     */

    public void printPhoneInfo(){
        System.out.println("brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("color: "+color);
        System.out.println("price: "+price);
    }

    public static void printOperatingSystem(){
        System.out.println("operating system: "+OS);
    }











    /*
    attributes:
    brand, model, color , price, operating system,madeIn,hasBattery,isTouchScreen, isExpensiveToFix
     */
}
