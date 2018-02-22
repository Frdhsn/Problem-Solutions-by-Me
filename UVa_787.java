/****************************
** In the name of Allah    **
** Author: Farhad          **
** From  : IIT,JU(46)      **
*****************************/
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main (String args[])
    {
        BigInteger dig,big,mul,max;
        int k;
        big = new BigInteger("-999999");
        BigInteger[] ar = new BigInteger[101];
        Scanner inp = new Scanner(System.in);
        while(inp.hasNext())
        {
            k=0;
            mul = new BigInteger("1");
            max = new BigInteger("-999999");
            while(inp.hasNextBigInteger())
        {
            dig = inp.nextBigInteger();
            if(dig.compareTo(big)==0) 
                break;
            ar[k++]= dig;
        }
        if(k==1)
            System.out.println(ar[0]);
        else
        {
            for(int i=0;i<k;i++)
        {
            mul = new BigInteger("1");
            for(int j=i;j<k;j++)
        {
            mul = mul.multiply(ar[j]);
            if(mul.compareTo(max)==1)
                max=mul;
        }
        
            
        }
        System.out.println(max);
            
        }
            
        }
        
    }
    
}
