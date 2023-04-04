
import java.util.*;

public class fibonacciseries {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;
        
        for(int i = 1; i<=n; ){

            
           
            System.out.println(sum);
            sum = a+b;
            a = 1;
            b = sum;
            i++;
        }
        
    }
}
