package day07_ifStatements;

public class MonthName {
    public static void main(String[] args) {

        int n= 12;
        String month = "";

        if (n>=1 && n<=12){
            if (n==1)month= "january";
            else if (n==2)month="february";
            else if (n==3)month="march";
            else if (n==4)month="april";
            else if (n==5)month="may";
            else if (n==6) month="june";
            else if (n==7)month="july";
            else if (n==8)month="august";
            else if (n==9)month="september";
            else if (n==10)month= "october";
            else if (n==11)month= "november";
            else month = "december";


        }else{
            System.out.println("no such a month");
        }
        System.out.println(month);









    }

}
