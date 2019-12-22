import java.util.ArrayList;
import java.util.Scanner;

/**
 * lcs
 * https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
 */
public class lcs {
    public static int longestcommsubseq(String s1,String s2) {
        int n1=s1.length();
        int n2=s2.length();
        Integer[][]memo= new Integer[n1+1][n2+1];
        ArrayList<Character> arr = new ArrayList<Character>();
        int result=dodp(s1, s2, 0, 0, memo, arr);
            int count=1;
        for (Character c : arr) {
            if(count>result){
                break;
            }   
            System.out.print(c);
            count++;
        }
        return result;
    }
    public static int dodp(String s1,String s2,int a,int b,Integer[][]memo,ArrayList<Character>arr) {
        if(a==s1.length()||b==s2.length())  return 0;
        if(s1.charAt(a)==s2.charAt(b)){
            arr.add(s1.charAt(a));
            return 1+dodp(s1, s2, a+1, b+1, memo, arr);
        }
        if(memo[a][b]!=null)    return memo[a][b];
        memo[a][b]=Math.max(dodp(s1, s2, a+1, b, memo, arr),dodp(s1, s2, a, b+1, memo, arr));
        return memo[a][b];    
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        System.out.println(" " + longestcommsubseq(s1,s2));
    }
}