package day04_concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String firstName = "Aaron",
                lastName = " Kissinger",
                name = firstName + lastName,
                city = "McLean",
                state = "VA",
                street = "Legacy Circle";
        String buildingNumber = "13621A";
              int  zipCode = 20121;

        System.out.println("Your shipping address is : " );

        System.out.println("\t" + name );
        System.out.println("\t" + buildingNumber +" " + street );
        System.out.println("\t" + city + ", " + state + " " + zipCode );

        System.out.println("--------------------------------------");

        System.out.println("Your shipping address is :" + "\n\t"+ name + "\n\t"+ buildingNumber + " "+street + "\n\t" + city + ", " +state +" " + zipCode );












        /*
        1. Create a class named ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full shipping address
Ex:
Your Shipping address is:
Aaron Kissinger
13621A Legacy Circle
Fairfax, VA 22030
         */


    }


}
