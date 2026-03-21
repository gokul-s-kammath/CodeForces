import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        while(N-- > 0){
            int length=sc.nextInt();
            String st=sc.next();
            int[]freq=new int[26];
            for(int i=0;i<length;i++){
                char x=st.charAt(i);
                freq[x-'A']++;
            }
            int score=0;
            for(int i=0;i<26;i++){
                if(freq[i]>0){
                    score+=freq[i]+1;
                }
                
            }
            System.out.println(score);
        }
       
    }
}
