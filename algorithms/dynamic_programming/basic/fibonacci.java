/**
 * fibonacci
 */
import java.util.*;
public class fibonacci {
    public static int fib(int n) {
        int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        if(arr[n-1]!=0) return arr[n-1];
        arr[n-1]=fib(n-2)+fib(n-1);
        return  arr[n-1];
    }
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the nth fibonacci number");
        n=s.nextInt();
        System.out.println(fib(n));
    }
    
}