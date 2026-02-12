import java.util.Scanner;
public class WaytooLongwords
{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt(); 
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            int length = word.length();
 
            if (length > 10) {
                
                System.out.println("" + word.charAt(0) + (length - 2) + word.charAt(length - 1));
            } else {
               
                System.out.println(word);
            }
        }
    }
}
