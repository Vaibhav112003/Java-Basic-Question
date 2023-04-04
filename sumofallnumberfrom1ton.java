import java.util.*;

public class sumofallnumberfrom1ton {
    
    public static int sumof1ton(int n){
         
        int sum = 0;

        for(int i = 1; i<=n; i++){

            if(i%2 != 0){
            sum = sum + i;
            }

            
        }

        return sum;
    }
    public static void main(String[] args){

             Scanner sc  = new Scanner(System.in);

             int n = sc.nextInt();

             int sum = sumof1ton(n);

             System.out.println(sum);


    }
}
