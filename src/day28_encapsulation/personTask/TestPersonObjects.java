package day28_encapsulation.personTask;

public class TestPersonObjects {

    public static void main(String[] args) {


        Person person1= new Person("Mohammad");
        Person person2= new Person("Abidullah",'M');
        Person person3=new Person("Hasan",30);
        Person person4=new Person("daniel","english");
        Person person5= new Person("tatiana",25,'F');
        Person person6=new Person("lucy",31,'F',"english");

        person4.name="James";

       // person1.planet="mars";

        Person.planet="mars";

        Person.printPlanetName();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);


        person1.eat("baklava");
        person2.drink("water");
        person5.drink("tea");
        person6.drink("coffee");



    }
}
