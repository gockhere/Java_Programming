package day15_whileLoop;

public class bbb {
    public static void main(String[] args) {

        System.out.println(examResult (85));
    }
public static boolean examResult(int score){
        if (score<0||score>100){
            System.out.println("unknown");
            return false;
        }
        if (score>=60){
            System.out.println("pas");
        }else {
            System.out.println("fail");
        }
    return false;
}
}