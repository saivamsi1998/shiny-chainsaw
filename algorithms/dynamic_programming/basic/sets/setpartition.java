import java.util.*;

/**
 * setpartition
 * since counting the number of set patitions is difficult we make the problem easy by changing the question i.e
 * what are the number of possible set combinations if the set is divided into k subsets.
 * Now find the total from 1 to n.
 * f(n,k)= total possible set partitions of n elements into k subsets
 * there are 2 possibilities to go forward
 * 1. divide f(n,k) to f(n-1,k) and f(n-1,k-1) and so on since it seems difficult proceed with step 2.
 * 2. add an element to f(n,k) so it becomes f(n+1,k)=f(n,k-1)+k*f(n,k)
 */
public class setpartition {
    public static int  countsetpartition(int n){
        Integer[][] memo= new Integer[n+1][n+1];
        memo[0][0]=1;
        for (int i = 1; i <= n; i++) {
            memo[i][0]=0;
        }
        int res=0;
        for (int i = 1; i <= n; i++) {
            res+=count(n,i,memo);
        }
        return res;
    } 
    public static int count(int n,int k,Integer[][]memo) {
        if(n==k) return 1;
        if(n<k) return 0;
        if(k==1) return 1;
        if(memo[n][k]!=null)    return memo[n][k];
        memo[n][k]=count(n-1, k-1, memo)+k*count(n-1, k, memo);
        return memo[n][k];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(countsetpartition(n));
    }
}
