package day30_inheritance.phoneTask;

public class Iphone extends Phone { //Iphone is a phone




    public static boolean hasApplePay =true;

    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void call(long phoneNumber){
        System.out.println(getModel()+ " is calling "+ phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(getModel()+ " is texting "+ phoneNumber);
    }
    public void faceTime(long phoneNumber){

        System.out.println(getModel()+ " is face timing with "+phoneNumber);

    }

    public void faceTime(String email){

        System.out.println(getModel()+ " is face timing with "+email);
    }
}
/*


			2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)





 */