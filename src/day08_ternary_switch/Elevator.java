package day08_ternary_switch;

public class Elevator {
    public static void main(String[] args) {

        int num = 9 ;
        String floor = "";

        if (num>=1&& num <=3){
            if (num==1) floor="lobby, verizon,starbucks";
            else if  (num ==2)floor= "cydeo,nasa, intelsat";
            else floor = "burger king, legoland , besiktas";
        }else{
            floor= "invalid floor";
        }
        System.out.println(floor);








    }
}
