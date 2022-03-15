package ArrayWithKunal.LinearSearch;

public class Program2 {

    public static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str="rohan varshney";
        char target ='u';
        System.out.println(search(str, target));
    }
}
