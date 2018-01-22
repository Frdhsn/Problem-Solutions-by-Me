/****************************
** In the name of Allah    **
** Author: Farhad          **
** From  : IIT,JU          **
*****************************/
import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void main (String args[])
    {
        int t,i;
        Scanner inp = new Scanner(System.in);
        BigDecimal a,sum;
        //sum= new BigDecimal("0");
        t = inp.nextInt();
        for(i=1;i<=t;i++)
        {
            sum= new BigDecimal("0.0");
            while(inp.hasNextBigDecimal())
            {
                a= inp.nextBigDecimal();
                if(a.compareTo(BigDecimal.ZERO)==0)
                    break;
                sum = sum.add(a);
            }
            sum = sum.stripTrailingZeros();
            //System.out.println(sum);
            System.out.println(sum.toPlainString());
        }
    }
    
}
