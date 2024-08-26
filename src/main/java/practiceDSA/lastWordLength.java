package practiceDSA;
//WAP to print the length of the last word in a string with n number of spaces
//easy
import java.util.*;
public class lastWordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int lastLen = 0;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                lastLen = 0;
            else
                lastLen++;
        }

        System.out.println(lastLen);
    }
}