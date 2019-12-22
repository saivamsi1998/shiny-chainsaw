import java.util.Scanner;

/**
 * minimumjumps
 */
public class minimumjumps {
    public static int minjumps(int[]arr) {
        Integer[] memo = new Integer[arr.length]; 
        return 1+dodp(arr, 0, memo);    
    }
    public static int dodp(int[]arr,int index,Integer[]memo) {
        if(index>=arr.length-1) return 0;
        if(arr[index]==0)   return Integer.MAX_VALUE;
        if(memo[index]!=null)   return memo[index];
        int min=Integer.MAX_VALUE;
        for (int i = 1; i <= arr[index]; i++) {
            min=Math.min(min,dodp(arr, index+i, memo)); 
        }
        memo[index]=(min==Integer.MAX_VALUE)?min:1+min;
        return memo[index];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(minjumps(arr));
        s.close();
    }
}