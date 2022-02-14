package String;

public class ReverseStringWordWise {
    public static String reverseString(String input){
        int end=input.length();//9
        int i=input.length()-1;//8
        String output="";
        while(i>=0){//(8>0)
            if(input.charAt(i)==' '){//abs"  "
                output =output+input.substring(i+1,end)+" ";
                end =i;
            }
            i--;
        }
        output +=input.substring(i+1,end);
        return output;
    }

    public static void main(String[] args) {
        String input="abs def ghi";
        System.out.println(reverseString(input));
    }
}
