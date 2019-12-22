import java.util.ArrayList;
import java.util.Scanner;

/**
 * lis
 */
public class lis {
    public static int countlis(int[]arr) {
        ArrayList<Integer> temp= new ArrayList<Integer>();
        temp.add(Integer.MIN_VALUE);
        for (int i : arr) {
            if(i>temp.get(temp.size()-1)){
                temp.add(i);
                continue;
            }
            int a=1;
            int b=temp.size()-1;
            while(a!=b){
                int mid=(a+b)/2;
                if(i>temp.get(mid)){
                    a=mid+1;
                }
                if(i<=temp.get(mid)){
                    b=mid;
                }
            }
            temp.set(a, i);
        }
        for (int i : temp) {
            if(i==Integer.MIN_VALUE)    continue;
            System.out.print(i+" ");
        }
        System.out.println();
        return temp.size()-1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(countlis(arr));
    }
}