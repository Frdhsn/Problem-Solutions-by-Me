/**********************************
** In the name of Allah          **
** Author: Farhad                **
** From  : IIT,JU(46)            **
** The Newtons Method for sqrt() **
***********************************/

import java.util.*;
import java.math.*;
public class Newtonssqrt {
    public static void main (String args[])
    {
        Scanner inp = new Scanner(System.in);
        BigInteger n,sqrt,a,b,mid,c,one;
        c = BigInteger.valueOf(2);
        one = BigInteger.ONE;
        int t;
        t = inp.nextInt();
        for(int j=1;j<=t;j++)
        {
            n= inp.nextBigInteger();           // y in the problem
            a = one;
            b = n.shiftRight(1).add(c);
            while(b.compareTo(a)>=0)
            {
                mid = a.add(b).shiftRight(1);
                if(mid.multiply(mid).compareTo(n)>0)
                    b = mid.subtract(one);
                else a= mid.add(one);
            }
            sqrt = a.subtract(one);           // our answer x
            if(j>1) System.out.println();    // for new line after every case
            System.out.println(sqrt);
            
            
        }            
    }
}
