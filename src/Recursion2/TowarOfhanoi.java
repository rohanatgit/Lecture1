package Recursion2;

import java.awt.image.DataBufferUShort;

public class TowarOfhanoi {
    public static int towarOfhanoi(int disk,char source,char Auxilary,char destination){
        if(disk==0){
            return 0 ;
        }
        towarOfhanoi(disk-1,source,destination,Auxilary);
        System.out.println(source +" "+destination);
        towarOfhanoi(disk-1, Auxilary,source,destination);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(towarOfhanoi(5,'j','l','m'));
    }
}
