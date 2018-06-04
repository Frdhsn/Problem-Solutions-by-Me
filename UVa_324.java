/*
    Author      : Farhad
    Date        : 5.06.2018
    Problem link: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=260*/
    Brute Force Solution , O(n+log10(n!))
*/
import java.util.*;
import java.math.BigInteger;
public class Main 
{
    public static void main(String[] args)
    {
        // Pre cal starts: 
        BigInteger []ar = new BigInteger[370];
        ar[1] = new BigInteger("1");
        ar[2] = new BigInteger("2");
        for(int i=3;i<=366;i++)
        {
            ar[i] = BigInteger.valueOf(i);
            ar[i] = ar[i].multiply(ar[i-1]);
            //System.out.println(ar[i]);
        }
        // Pre cal ends.
      
        Scanner inp = new Scanner(System.in);
        while(inp.hasNext())
        {
            int []cnt = new int[10];        // counter array
            for(int i=0;i<10;i++) cnt[i]=0;
            int n=inp.nextInt();
            if(n==0) break;
            String ss = ar[n].toString();   // converting biginteger to string
            int l=ss.length();
            for(int i=0;i<l;i++)
            {
                cnt[ss.charAt(i)-'0']++;   // counting frequencies
            }
            System.out.printf(n+"! --\n");
            for(int i=0;i<10;i++)
            {
                System.out.printf("   ("+i+")");
                System.out.printf("%5d",cnt[i]);
                if(i==4 || i==9) System.out.println();
            }
            
        }
    }
}
