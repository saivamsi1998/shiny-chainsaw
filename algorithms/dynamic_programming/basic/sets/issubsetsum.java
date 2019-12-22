import java.util.Scanner;

/**
 * issubsetsum
 * https://www.geeksforgeeks.org/dynamic-programming-subset-sum-problem/
 */
public class issubsetsum {
    public static boolean issubsum(int[]arr,int total) {
        int[] memo=new int[total+1];
        for (int i = 0; i < memo.length; i++) {
            memo[i]=-1;
        }
        return dodp(arr, total, 0, memo);

    }
    public static boolean dodp(int[]arr,int total,int index,int[]memo) {
        if(index==arr.length&&total!=0)  return false;
        if(total<0) return false;
        if(total==0)    return true;
        if(memo[total]==1) return true;
        memo[total]=(dodp(arr, total-arr[index], index+1, memo)||dodp(arr, total, index+1, memo))?1:0;
        return dodp(arr, total-arr[index], index+1, memo)||dodp(arr, total, index+1, memo);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        int total=s.nextInt();
        if(issubsum(arr, total))    System.out.println("Hello World!");
        
        
    }
}