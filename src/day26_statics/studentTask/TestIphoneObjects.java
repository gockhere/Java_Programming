package day26_statics.studentTask;

import day26_statics.Iphone;

public class TestIphoneObjects {
    public static void main(String[] args) {

        Iphone iPhone= new Iphone("iphone12","black",1000);

        System.out.println(iPhone.color);
        System.out.println(iPhone.model);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        Iphone.printOperatingSystem();



    }
}
