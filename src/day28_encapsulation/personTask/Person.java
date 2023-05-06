package day28_encapsulation.personTask;

public class Person {



    public String name;

    public int age;

    public char gender;

    public String language;

    public static String planet;

    public static boolean isHuman,hasNose ;

    public static int numberOfWings;

    public static int numberOfHeads ;


    public Person(String name) { // allows us to create person object just by setting the name of person
        this.name = name;
    }

    public Person(String name, int age) { // allows us to create person object just by setting the name and age of person
        this(name);
        this.age = age;
    }

    public Person(String name, String language) { // allows us to create person object just by setting the name and language of person
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {// allows us to create person object just by setting the name and gender of person
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {// allows us to create person object just by setting the name , age and gender of person
        this(name,age);
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) { // allows us to create person object just by setting the name , age, language and gender of person
        this(name, age, gender);
        this.language = language;
    }

    static {
        planet="Earth";
        isHuman=true;
        hasNose=true;
        numberOfHeads=1;
        numberOfWings=0;
    }

    public static void printPlanetName(){
        System.out.println("Planet name is : "+planet);
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}

/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */
