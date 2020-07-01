import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MultipleOf3and5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum;
        int t = in.nextInt();
        int a=0;
        while(a<t){
            sum=0;
            long n = in.nextInt();
            long th=(n-1)/3;
            long f=(n-1)/5;
            long fi=((n-1)/15);
            sum=(th*(6+(th-1)*3))+(f*(10+(f-1)*5))-(fi*(30+(fi-1)*15));
            System.out.println(sum/2);
            a++;
        }
    }
}
