/*
//ArrayList

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class fibonacciSeries{
    static int fun(List<Integer>dp,int n){
        if(n<=1){
            return n;
        }
        if(dp.get(n) !=-1){
            return dp.get(n);
        }
        int res = fun(dp,n-1)+fun(dp,n-2);
        dp.set(n,res);
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:->");
        int n =sc.nextInt();

        List<Integer>dp=new ArrayList<>(Collections.nCopies(n+1,-1));

        System.out.println(fun(dp,n));

        sc.close();
    }
}
*/
/*

//using array

import java.util.Scanner;
public class fibonacciSeries{
    static int fun(int[] dp,int n){
        if(n<=1){
            return n;
        }
         if (dp[n] != -1)
            return dp[n];

        return dp[n] = fun(dp, n - 1) + fun(dp, n - 2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n+1];

        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        System.out.println(fun(dp,n));
        sc.close();
    }

}
*/

import java.util.Scanner;
public class fibonacciSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n+1];

        int prev2=0;
        int prev =1;
        for(int i=2;i<=n;i++){
            int curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        System.out.println(prev);
    }

}