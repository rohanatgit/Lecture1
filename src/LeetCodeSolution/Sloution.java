package LeetCodeSolution;
//1491. Average Salary Excluding the Minimum and Maximum Salary
import java.util.Arrays;

public class Sloution {
    class Solution {
        public double average(int[] salary) {
            Arrays.sort(salary);
            double sum=0.0;
            int count=0;
            for(int i=1;i<salary.length-1;i++){
                sum=sum+salary[i];
                count++;
            }
            return sum/count;
        }
    }
}
