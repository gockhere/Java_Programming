package day11_string;

public class StringMethods3 {
    public static void main(String[] args) {

        String word = "Java";

        boolean r1=word.isEmpty();
        System.out.println(r1);


        System.out.println("=============================================");

        String str = "                ";
        boolean r2= str.isEmpty();
        System.out.println(r2);// false

        boolean r3 = str.isBlank();//true
        System.out.println(r3);

        System.out.println("=======================================");

        String str1 = "Cydeo";

        String str2 = new String("Cydeo");

        System.out.println(str==str2);// false

        System.out.println(str1.equals(str2));//true

        String str3 = new String("cydeo");

        System.out.println(str1.equals(str3));//false 'case sensitive'


        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2));//false

        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("=========================================");

        String students = "roni goker gorkem gokce";
        boolean hasAhmet=students.contains("ahmet");//false

        String sentence = "My favorite programming is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println("has Java ="+hasJava);//true


        System.out.println("========================================");

        String name = "Micheal";

        boolean l = name.startsWith("Da");//false

        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www.");//true
        System.out.println(isValid);

        boolean t = url.endsWith(".com");
        System.out.println(t);

        System.out.println("======================");

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");//false
        boolean isYahoo = email.endsWith("yahoo.com");//false
        boolean isHotmail = email.endsWith("hotmail.com");//false


























































    }
}
