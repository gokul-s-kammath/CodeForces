import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        StringBuilder num=new StringBuilder();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='.'){
                num.append(0);
            }
            else{
                if(st.charAt(i+1)=='.'){
                    num.append(1);
                }
                else{
                    num.append(2);
                    
                }
                i++;
            }
        }
        System.out.println(num);
    }
}
