import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PowerfulDigitCounts {

    public static String Power(int tt,int nt)
    {
        BigInteger t = new BigInteger(String.valueOf(tt)); 
        BigInteger n = new BigInteger(String.valueOf(nt)); 
        BigInteger sol = new BigInteger("1"); 
        for(int i=0;i<nt;i++)
        {
           sol=sol.multiply(t);
        }
        return sol.toString();
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=(n-10)<0?((n-5)<0?n:n-5):n-10;
        
        for(int i=t;i<n+10;i++)
        {
            String temp=Power(t,n);
            if(n<(temp.length()))
            {
               break;
            }
            if(n==(temp.length()))
            {
                System.out.println(temp);
            }
            t++;
        }
        
    }
}
