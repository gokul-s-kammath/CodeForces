import java.util.Scanner;
import java.util.HashSet;
public class BoyOrGirl{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        HashSet<Character> dis=new HashSet<>();
        for(int i=0;i<st.length();i++)
        {
            dis.add(st.charAt(i));
        }
        if(dis.size()%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
