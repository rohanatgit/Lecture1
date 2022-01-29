package Functions;

public class FahrenheitTable {
    public static void Fahrenhit(int start,int end,int step){
        int currentValue=start;
        int fahrenhit =(int)((50./9)*(currentValue-32));
        System.out.println(currentValue+"\t"+fahrenhit);
        currentValue+=step;
    }
    public static void main(String[] args) {
        Fahrenhit(2,5,6);

    }
}
