import java.util.*;

public class sumton {
     public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        for(int j = 1; j<=10 ; j++){
            System.out.println( n+"X"+j+"="+(2*j));
        }
     }
}
