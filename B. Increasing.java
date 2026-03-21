import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        while(N-- > 0){
            int length=sc.nextInt();
            HashSet<Integer> num=new HashSet<>();
            boolean ok=true;
            for(int i=0;i<length;i++){
                int x=sc.nextInt();
                if(num.contains(x)){
                    ok=false;
                }
                else{
                    num.add(x);
                }
            }
            System.out.println(ok? "YES":"NO");
       
    }
}
}
