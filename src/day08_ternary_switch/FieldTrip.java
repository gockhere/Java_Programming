package day08_ternary_switch;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 6;

        String location ="unknown";
        int numOfGroupss=0;
        String teacherInCharge="unknown";

        if (grade >=1 && grade <=6){
            if (grade==1 ){
                location = "apple orchard";
                numOfGroupss=3;
                teacherInCharge="ms. smith";
            }else if (grade==2){
                location="zoo;";
                numOfGroupss=7;
                teacherInCharge="mr. lee";
            }else if (grade ==3){
                location="aquarium";
                numOfGroupss=5;
                teacherInCharge="ms. wilson";

            }else if (grade == 4){
                location= "movie teater";
                numOfGroupss=2;
                teacherInCharge= "mr. reyes";
            }else if (grade == 5){
                location= "museum";
                numOfGroupss=5;
                teacherInCharge= "ms. lela";
            }else {
                location="game room";
                numOfGroupss=4;
                teacherInCharge="mr.jim";
            }
        }

        System.out.println("location = " + location);
        System.out.println("teacherInCharge = " + teacherInCharge);
        System.out.println("numOfGroupss = " + numOfGroupss);













    }
}
