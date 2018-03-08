/********************************
**     In the name of ALLLAH   **
**     Author: Farhad          **
**     From  : IIT,JU(46)      **
*********************************/
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main ( String args[])
    {
        
        Scanner inp = new Scanner(System.in);
        BigInteger P,a,B;
        while(inp.hasNext())
        {
            P = inp.nextBigInteger();
            a = inp.nextBigInteger();
            if(P.compareTo(BigInteger.ZERO)==0 && a.compareTo(BigInteger.ZERO)==0)
                break;
            B = a.modPow(P, P);
            if(a.compareTo(B)==0 && !P.isProbablePrime(10))   // if a^p % p == a%p && P is a composite number , it'll be pseudoprime
            System.out.println("yes");
            else System.out.println("no");
        }
        
    }
    
}
