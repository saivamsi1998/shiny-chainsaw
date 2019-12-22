import java.util.Scanner;
/**
 * printallsubsetsofgivensum
 */
public class printallsubsetsofgivensum {
    public static void print(int[]arr,int sum) {
    
    
    }
    public static boolean isSubset(int[]arr,int sum,int index,Integer[][]memo) {
        if (memo[index][sum]!=null) {
            ret
        }
    } 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        int sum=s.nextInt();
        print(arr,sum);
    }
}