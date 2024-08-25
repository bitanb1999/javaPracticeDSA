package practiceDSA;
import java.util.*;
//string compression program
//input:a3bbbcacccaaa
// output:a3b3cac3a4
public class StringCompression {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();//a3bbbcacccaaa
        //elongating the string for this use case
        StringBuilder input_renew = new StringBuilder();
        for (int i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))){
               int count = Integer.parseInt(String.valueOf(input.charAt(i))) -1;
               for(int j =1;j<=count;j++)
                   input_renew.append(input.charAt(i-1));
            }

            else
                input_renew.append(input.charAt(i));

        }
        //passing it to the string compression function
        System.out.println(compressedString(input_renew));
    }
    public static StringBuilder compressedString(StringBuilder message)
    {
        StringBuilder output = new StringBuilder();
        int count =1;
        for (int i =0;i<message.length()-1;i++){
            if(message.charAt(i)==message.charAt(i+1))
                count++;

            else if(message.charAt(i)!=message.charAt(i+1)){
                output.append(message.charAt(i)).append(count);
                count=1;
            }
            else if(count==1)
                output.append(message.charAt(i));
        }
        if(message.charAt(message.length()-2) != message.charAt(message.length()-1))
            output.append(message.charAt(message.length()-1));
        else
            output.append(message.charAt(message.length()-1)).append(count);
        return output;
    }
}
