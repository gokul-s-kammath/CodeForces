import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=a/5;
        if(a%5!=0)
        {
            sum++;
        }
            
        System.out.println(sum);
    }
}
