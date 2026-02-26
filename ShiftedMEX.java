import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numberofloops=sc.nextInt();
        while(numberofloops-- > 0)
        {
            int n=sc.nextInt();
            int[]number=new int[n];
            for(int i=0;i<n;i++)
            {
                number[i]=sc.nextInt();
            }
            Arrays.sort(number);
            int maxLength=1;
            int currentLength=1;
            for(int i=1;i<n;i++)
            {
                if(number[i]==number[i-1])
                {
                    continue;
                }
                if(number[i]==number[i-1]+1)
                {
                    currentLength++;
                }
                else{
                    maxLength=Math.max(maxLength,currentLength);
                    currentLength=1;
                }
            }
            System.out.println(Math.max(maxLength,currentLength));
        }
    }
}
