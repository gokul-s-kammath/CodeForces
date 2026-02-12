import java.util.Scanner;
public class Nextround
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        int count=0;
        int target=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int kth=nums[target-1];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=kth&&nums[i]>0)
            {
                count++;
            }
        }
        System.out.println(count);
            
        
    }
}
