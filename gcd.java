
import java.util.*;

public class gcd {

    public static int Gcd(int a , int b) {
        //base case
        if(b == 0){
            return a; // a = 33 , b = 12
        }

        //recursive case
        return Gcd(b , a%b);

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        int a = sc.nextInt();
        int b = sc.nextInt();

       int ans = Gcd(a,b);

       System.out.println(ans);
    }
}
