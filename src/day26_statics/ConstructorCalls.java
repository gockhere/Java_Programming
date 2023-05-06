package day26_statics;

public class ConstructorCalls {


    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }


    public ConstructorCalls(int a ){

        //ConstructorCalls();
        this();
        System.out.println("Constructor with int argument");

        //this(); constructor call has to be the first step
    }


    public ConstructorCalls (double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls (String c){
        this(2.5);
       // this();

        System.out.println("Constructor String argument");
    }




    public static void main(String[] args) {
        //ConstructorCalls();
        method1();

        System.out.println("-------------------------");

        method2();
    }

    public static void method1(){
        System.out.println("Method 1");

    }

    public static void method2(){

        method1();
        System.out.println("Method 2");
        method2();
    }

}
