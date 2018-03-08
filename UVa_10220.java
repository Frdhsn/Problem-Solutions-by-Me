/********************************
**     In the name of ALLLAH   **
**     Author: Farhad          **
**     From  : IIT,JU(46)      **
**        08/03/2018           **
*********************************/
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main ( String args[])
    {
        int n,i;
        Scanner inp = new Scanner(System.in);
        while(inp.hasNext())
        {
            n = inp.nextInt();
            BigInteger Fact = new BigInteger("1");
            for(i=2;i<=n;i++)
            {
                Fact = Fact.multiply(BigInteger.valueOf(i));     
            }
            String ss = Fact.toString();
            int sum=0;
            for(int j=0;j<ss.length();j++)
            {
                sum += (int) (ss.charAt(j) - '0' );
            }
            System.out.println(sum);
        }
        
    }
    
}
/*
  See.. .. Java BigInteger is FUN! :) .. Happy Coding.. .. 
*/
