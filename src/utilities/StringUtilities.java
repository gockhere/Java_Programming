package utilities;

public class StringUtilities {

    public static String reverse(String str) {

        String reverse = "";//  to contain all the characters of the given string in reverse order


        for (int i = str.length() - 1; i >= 0; i--) {// i: index number of the string starting from the last index to index 0
            reverse += str.charAt(i);// to get each character of the string starting from last to index 0
        }

        return reverse;
    }
}
