import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String st=sc.next();
        char[]ch=st.toCharArray();
        int neigh=0;
        
        for(int i=0;i<n-1;i++)
        {
         
          if(ch[i]==ch[i+1])
          {
            neigh++;
          }
        }
        System.out.println(neigh);
    }
}
