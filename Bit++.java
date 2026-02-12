import java.util.Scanner;
public class Bit++
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int prb=sc.nextInt();
    int X=0;
    for(int i=0;i<prb;i++)
    {
        String a=sc.next();
        
        if(a.equals("X++")||a.equals("++X"))
        {
            X++;
        }
        else
        {
            X--;
        }
    }
    System.out.println(X);
 
}
}
