import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        while(N-- >0){
            int length=sc.nextInt();
            String st=sc.next();
            int high=0;
            char[]ch=st.toCharArray();
            for(int i=0;i<length;i++){
                int pos=ch[i]-'a'+1;
                if(pos>=high){
                    high=pos;
                }
            }
            System.out.println(high);
        }
    }
}
