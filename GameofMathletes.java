import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numberoftest=sc.nextInt();
        
        while(numberoftest-- >0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[]freq=new int[n+1];
            for(int i=0;i<n;i++)
                {
                    int x=sc.nextInt();
                    freq[x]++;
                }  
            int score=0;
            for(int i=1;i<=n;i++){
                int com=k-i;
                if(com<1||com>n)
                {
                    continue;
                }
                else if(i<com){
                    score+=Math.min(freq[com],freq[i]);
                }
                else if(i==com)
                {
                    score+=freq[i]/2;
                }
            } 
            System.out.println(score);
        }


    }
}
