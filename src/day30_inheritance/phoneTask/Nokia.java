package day30_inheritance.phoneTask;

public class Nokia extends Phone{
    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
    public void call(long phoneNumber){
        System.out.println(getModel()+ " is calling "+ phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(getModel()+ " is texting "+ phoneNumber);
    }

    public void selfDefence(){
        System.out.println(getBrand()+" "+getModel()+" can be used for self defence");
    }
}
/*

			2.3 Nokia:
					Extra methods:
						selfDefense()


 */