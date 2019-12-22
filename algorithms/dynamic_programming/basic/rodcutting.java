import java.util.Scanner;

/**
 * rodcutting
 */
public class rodcutting {

    public static int  cutcost(int[]cost,int length) {
        Integer[]memo=new Integer[length+1];
        return dodp(cost, length, memo);
    }
    public static int dodp(int[]cost,int length,Integer[]memo) {
        if(length<0)    return Integer.MIN_VALUE;
        if(length==0)   return 0;
        if (memo[length]!=null) {
            return memo[length];
        }    
        int max=Integer.MIN_VALUE;
        for (int i = 1; i < cost.length; i++) {
            max=Math.max(max, cost[i]+dodp(cost, length-i, memo));
        }
        memo[length]=max;
        return max;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[]cost =new int[n+1];
        for (int i = 1; i <= n; i++) {
            cost[i]=s.nextInt();
        }
        int length=s.nextInt();
        System.out.println(cutcost(cost,length));
    }
}