package String.Assignment;

public class HightestOccuringChar {
    public static char hisghtOccuring(String str){
        int n =str.length();
        int frequence[]=new int[256];
        int maxFrequence=0;
        for(int i=0;i<n;i++){
            frequence[str.charAt(i)]++;
            maxFrequence=Math.max(maxFrequence,frequence[str.charAt(i)]);
        }
        char answer='\0';
        for(int i=0;i<n;i++){
            if(frequence[str.charAt(i)]==maxFrequence){
                answer =str.charAt(i);
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String str="aaaaaaaaaaannnnnnnmmm";
        System.out.println(hisghtOccuring(str));
    }
}
