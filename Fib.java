import java.io.*;
import java.util.Scanner;
public class Fib {
    public static void main(String args[])
    {
        int n,i,f=1;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<n;i++)
        {f=f+i;
        System.out.println(f);
        }
    }
    
}
