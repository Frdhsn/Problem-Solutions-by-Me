/**********************************
** In the name of Allah          **
** Author: Farhad                **
** From  : IIT,JU(46)            **
***********************************/
import java.util.*;
import java.math.BigDecimal;
public class Main {
    public static void main (String args[])
    {
        Scanner inp = new Scanner(System.in);
        int n;
        BigDecimal a,b;
        while(inp.hasNext())
        {
            n = inp.nextInt();
            for(int i=1;i<=n;i++)
            {
                a = inp.nextBigDecimal();
                b = inp.nextBigDecimal();
                b = a.add(b);
                b = b.stripTrailingZeros();
                System.out.println(b.add(new BigDecimal("0.0")));                
            }
            
        }
        
    }
    
}
