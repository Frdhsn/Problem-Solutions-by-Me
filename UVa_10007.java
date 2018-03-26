/****************************
** In the name of Allah    **
** Author: Farhad          **
** From  : IIT,JU          **
** Date  : 27.03.2018      **
*****************************/

// ans will be for n elements ,
// there can be (n!* nth catalan number)
// binary trees
// for more details go to: https://www.geeksforgeeks.org/total-number-of-possible-binary-search-trees-with-n-keys/


import java.util.*;
import java.math.BigInteger;

public class Main 
{
    
    BigInteger dp[]=new BigInteger[310];
    BigInteger minusone= new BigInteger("-1");
    
    void mem(){
        for(int i=1;i<=301;i++) 
            dp[i]=minusone;
    }
    
    BigInteger cata(int a)
    {
        if(a<=1) return BigInteger.ONE;
        if(dp[a].compareTo(minusone)==1) return dp[a];
        BigInteger res=BigInteger.ZERO;
        for(int i=0;i<a;i++)
        {
            res = res.add(cata(i).multiply(cata(a-i-1)));
        }
        return dp[a]=res;
    }
    
    public static void main (String args[])
    {
        Main aww = new Main();
        aww.mem();
        aww.dp[0]=new BigInteger("1");
        aww.dp[1]=new BigInteger("1");
        aww.dp[2]=new BigInteger("2");
        
        aww.cata(300);
        
        BigInteger ar[] = new BigInteger[310];
        for(int i=1;i<=301;i++)
        {
            int n =i;
            //System.out.println(aww.dp[i]);
            BigInteger Facto = new BigInteger("1");
            for(int k=1;k<=n;k++)
            {
                Facto = Facto.multiply(BigInteger.valueOf(k));
            }
            ar[i] = Facto;
        }
        Scanner inp = new Scanner(System.in);
        int n;
        while(inp.hasNext())
        {
            n = inp.nextInt();
            if(n==0) break;
            BigInteger ans = aww.dp[n];
            System.out.println( ans.multiply(ar[n]));
        }
        
        
    
    }
    
}
