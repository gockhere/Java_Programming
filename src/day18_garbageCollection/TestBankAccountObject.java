package day18_garbageCollection;

public class TestBankAccountObject {

    public static void main(String[] args) {


        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Gadir",1234566778);

        System.out.println(obj1);


        obj1.deposit(1000);

        obj1.checkBalance();

        obj1.withdraw(700);

        obj1.checkBalance();

        obj1.deposit(-1000);

        obj1.checkBalance();

        obj1.withdraw(5000);

        obj1.checkBalance();


        System.out.println("-------------------------------");

        BankAccount account1= new BankAccount();







        BankAccount account2= new BankAccount();



        account1.setInfo("Sebastian",76657575);

        account2.setInfo("Umran",4354353);

        account1.deposit(5000);
        account2.deposit(10000);

        System.out.println(account1);
        System.out.println(account2);

        account1.withdraw(1000);
        account2.withdraw(1000);


        System.out.println(account1);
        System.out.println(account2);















    }





}
