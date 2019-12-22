/**
 * uglynumbers: The numbers whose prime factors are only 2 3 and 5 etc.
 */
import java.lang.*;
import java.io.*;
import java.util.*;
public class uglynumbers {
    public static int ugly(int n) {
        int arr[]=new int[n];
        arr[0]=1;
        int a=0,b=0,c=0;
        int nexta=2,nextb=3,nextc=5;
        for (int i = 1; i < n; i++) {
            arr[i]=Math.min(nexta,Math.min(nextb,nextc));
            if(arr[i]==nexta){
                a++;
                nexta=2*arr[a];
            }
            if(arr[i]==nextb){
                b++;
                nextb=3*arr[b];
            }
            if(arr[i]==nextc){
                c++;
                nextc=5*arr[c];
            }
        }
        return arr[n-1];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(ugly(n));
        
    }

}