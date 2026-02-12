import java.util.Scanner;
public class PetyaAndStrings
{
 
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String c=a.toLowerCase();
        String d=b.toLowerCase();
        int num=c.compareTo(d);
        if(num<0)
        {
            System.out.println("-1");
        }
        else if(num>0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}
