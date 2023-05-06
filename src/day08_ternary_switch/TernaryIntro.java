package day08_ternary_switch;

public class TernaryIntro {
    public static void main(String[] args) {

        int score = 85;
        String result = "";

        if (score>=60){
            result = "passed";
        }else {
            result= "Failed";

        }
        System.out.println(result);

        System.out.println("--------------------------------------------");


        String result2=(score>=60)? "passed":"Failed";
        System.out.println(result2);

        System.out.println("================================");
        int age =23;

        String result3= (age >=21)?"eligible":"not eligible";
        System.out.println(result3);

      /*
      /*
        String r;

        if (age >=21){
            r="eligible";
        }else{
            r="not eligible";
        } *\
       */














    }
}
