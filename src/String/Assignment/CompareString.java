package String.Assignment;

public class CompareString {
    public static String compareString(String str){
        int n =str.length();
        String answer= "";
        if(n==0){
            return  answer;
        }
        int currentCharCount=1;
        answer =answer +str.charAt(0);
        for(int i=1;i<n;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                currentCharCount++;
            }
            else{
                if(currentCharCount>1){
                    answer+=currentCharCount;
                    currentCharCount=1;
                }
                answer+=str.charAt(i);
            }
        }
          if(currentCharCount>1){
              answer+=currentCharCount;
          }
          return answer;
    }
    public static void main(String[] args) {
        String str="rohannnn";
        System.out.println(compareString(str));
    }
}
