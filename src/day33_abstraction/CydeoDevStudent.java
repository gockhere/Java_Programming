package day33_abstraction;

import day32_finalKeyword.person.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {


    private final String id;
    private String batchName;
    private int batchNumber;

    public static final String programmingLanguage;

    public CydeoDevStudent(String name, char gender, LocalDate DOB, String id, String batchName, int batchNumber) {


        super(name, gender, DOB);

        if(getAge()<18){// if age is set to less than 18
            System.err.println("Cydeo developer student must be at least 18 years old");
            System.exit(1);
        }


        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    static {
        programmingLanguage="Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchName(String batchName) {

        this.batchName = batchName;

        if (batchName.equalsIgnoreCase("zero to hero")||batchName.equalsIgnoreCase("alumni dev")){

        }else {
            System.err.println("invalid batch name: "+batchName+" \n no such a batch in cydeo");
            System.exit(1);
        }


    }

    public void setBatchNumber(int batchNumber) {

        this.batchNumber = batchNumber;

        if(batchNumber<=0){
            System.err.println("Invalid barch number: "+batchNumber+"\n batchNumber can not be set to zero or negative");

            System.exit(1);
        }








}

    @Override
    public void eat() {
        System.out.println(getName()+" is eating "+programmingLanguage);
    }

    @Override
    public void drink() {

        System.out.println(getName()+" is drinking "+programmingLanguage);

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" does not need a sleep");
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" +getAge()+
                ", DOB=" + getDOB() +
                "id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }

    /*
    	1. Create a subclass of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables


     */
}
