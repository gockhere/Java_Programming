package day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {





        Dog dog= new Dog();
        dog.setInfo("Max","Husky",'M',4,"Small","White");


        Cat cat=new Cat();
        cat.setInfo("Felicia","stray",'M',3,"Medium","black and white");


        Tiger tiger= new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',5,"Large","orange");



        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);


        System.out.println("=======================================================");

        dog.sleep();
        dog.drink();
        dog.eat();
        dog.bark();

        cat.meow();
        cat.scratch();
        cat.sleep();
        cat.eat();
        cat.drink();

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.hunt();

        System.out.println("-----------------------------------------------");

      //  dog.gender='K';
      //  dog.age=-123;


        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setGender('F');
        dog.setAge(8);

        System.out.println(dog);
    }
}
