import java.util.*;

public class sumoftwonumberusingFunction {
    public static int sumoftwonumber(int a) {
        
        int fact = 1;
        
        while(a>0){
         
            fact = fact*a;
            a = a-1;

        }
       
        return fact;
    }
    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = sc.nextInt();

       int factorial = sumoftwonumber(a);
       System.out.println(factorial);
    }
}
