package day30_inheritance.phoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {



        Iphone iphone=new Iphone("Ihone14","large",1000.5,"Black");

        Samsung samsung =new Samsung("Galaxy s22","medium",1100,"White");

        Nokia nokia = new Nokia("brick","small",50,"Pink");

        iphone.call(911);
        nokia.call(911);
        samsung.call(911);

        iphone.text(123);
        nokia.text(123);
        samsung.text(123);

        System.out.println("-----------------------------------");

        iphone.faceTime(12343242);
        samsung.freeze();
        nokia.selfDefence();

        System.out.println("==================================");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);
    }
}
