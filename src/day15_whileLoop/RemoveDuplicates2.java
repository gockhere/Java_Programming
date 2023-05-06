package day15_whileLoop;

public class RemoveDuplicates2 {

    public static void main(String[] args) {


        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i <str.length() ; i++) {

            if (result.contains("" + str.charAt(i))) {

                continue;

            }

            result += str.charAt(i);
        }
        System.out.println(result);


        System.out.println("=============================");

        //find the sum of all even number between 50-100

        for (int i = 50; i <=100 ; i++) {

            if (i%2==1){
                continue;
            }
            System.out.print(" "+i);
        }

        System.out.println();

        for (int i = 50; i < 101; i++) {
            if (i%2!=0){
                continue;
            }
            System.out.print(" "+i);
        }







        /*
        3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
         */
    }


}
