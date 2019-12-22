import java.util.*;
import java.io.*;

/**
 * coinchange: total number of possible coin changes with the given set of coins and total
 * use integer memo matrix if there is confusion between the boundary condition of zeroes in the problem.
 * https://leetcode.com/problems/coin-change-2/submissions/
 */
public class coinchange {
    public static int totalcoinchange(int[]arr,int total) {
        int memo[][]=new int[arr.length][total+1];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<total+1;j++){
                memo[i][j]=-1;
            }
        }
        return count(arr,memo,0,total);
    }
    public static int count(int[]arr,int[][]memo,int index,int total) {
        if(total==0)    return 1;
        if (index>=arr.length)  return 0; 
        if (total<0)    return 0; 
        if (memo[index][total]!=-1) {
            return memo[index][total];
        }
        memo[index][total]=count(arr, memo, index, total-arr[index])+count(arr, memo, index+1, total);
        return memo[index][total];

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        int total=s.nextInt();
        System.out.println(totalcoinchange(arr,total));
    }
}