package Recursion;

import Lecture2Pattern.IsosclesTriangle;

import javax.swing.*;

public class ArraySortedOrNot {
    public static boolean chackSorted(int input[]) {
        if (input.length <= 1) {
            return true;
        }
        int smallInput[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }
        boolean smallAns = chackSorted(smallInput);
        if (!smallAns) {
            return false;
        } else if (input[0] <= input[1]) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int input[] ={12,3,5};
        System.out.println(chackSorted(input));
    }
}
