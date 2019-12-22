import java.util.*;

/**
 * mincoinchange
 */
public class mincoinchange {
    public static int minchange(int[]arr,int amount) {
        int []memo=new int[amount+1];
        return dodp(arr, amount,memo);
    }
    public static int dodp(int []arr,int amount,int[]memo) {
        if(amount<0)    return Integer.MAX_VALUE;
        if(amount==0)   return 0;
        if(memo[amount]!=0)  return memo[amount];
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int res=dodp(arr, amount-arr[i],memo);
            if(res<min) min=res+1;
        }
        memo[amount]=min;
        return min;  
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        int amount=s.nextInt();
        System.out.println(minchange(arr,amount));
        
    }
}