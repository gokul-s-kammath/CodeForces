import java.util.Scanner;
import java.util.Arrays;
public class  HelpfulMaths
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        String[] num=st.split("\\+");
        int[]nums=new int[num.length];
        for(int i=0;i<num.length;i++)
            {
                nums[i]=Integer.parseInt(num[i]);
            }
            Arrays.sort(nums);
        for(int i=0;i<num.length;i++)
        {
            System.out.print(nums[i]);
            if(i!=num.length-1)
            {
                System.out.print("+");
            }
        }
    }
}
