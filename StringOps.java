import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // System.out.println(capVowelsLowRest("Hello World"));
        // System.out.println(capVowelsLowRest("One two tHRee world"));
        // System.out.println(capVowelsLowRest("vowels are fun") );
        // System.out.println(capVowelsLowRest("intro"));
        // System.out.println(capVowelsLowRest("yellow"));

        // System.out.println(camelCase(("  hello world   hello ")));

        System.out.println(Arrays.toString(allIndexOf("MMMM",'M')));
    }

     public static char toLower (char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32);
        }
        else if (c >= 'a' && c <= 'z') {
            return c;
        }
        return '0';
    }

    public static char toUpper (char c) {
        if (c >= 'a' && c <= 'z') {
            return (char) (c - 32);
        }
        else if (c >= 'A' && c <= 'Z') {
            return c;
        }
        return '0';
    }

    public static String capVowelsLowRest (String string) {
        String capVowelsLowRest = "";
        String VOWELS = "aeiouAEIOU";
        String CONSONANTS ="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        for (int i = 0; i < string.length(); i++) {
            if (VOWELS.indexOf(string.charAt(i)) != -1) {
                capVowelsLowRest += toUpper(string.charAt(i));
            }
            else if (CONSONANTS.indexOf(string.charAt(i)) != -1) {
                capVowelsLowRest += toLower(string.charAt(i));
            }
            else {
                capVowelsLowRest += string.charAt(i);
            }
        }
        return capVowelsLowRest;
    }

    public static String camelCase (String string) {
        String camelCase = "";

        for (int i = 0; i < string.length(); i++) {
            if (i == 0) {
                if (string.charAt(i) != ' ') {
                    camelCase += toLower(string.charAt(i));
                }
            }
            else if (string.charAt(i) != ' ') {
                if (string.charAt(i - 1) == ' ' && camelCase.length() > 0) {
                    camelCase += toUpper(string.charAt(i));
                }
                else {
                    camelCase += toLower(string.charAt(i));
                }
            }
        }

        return camelCase;
    }

    public static int[] allIndexOf (String string, char chr) {
        int chrCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                chrCount++;
            }
        }

        int[] chrIndexes = new int[chrCount];
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
             if (string.charAt(i) == chr) {
                chrIndexes[j] = i;
                j++;
            }
        }

        return chrIndexes;
    }
}
