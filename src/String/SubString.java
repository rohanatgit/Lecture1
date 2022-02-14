package String;

public class SubString {
    public static void subString(String str){
        for(int start=0;start<str.length();start++){
            //we will be printing all substaring starting wit char at index start
                for(int end=start;end<str.length();end++){
                    System.out.println(str.substring(start,end+1));
                }
        }

    }

    public static void main(String[] args) {
        String str ="pqrs";
        subString(str);
    }
}
// Start = 0 to len
//end =start to len-1