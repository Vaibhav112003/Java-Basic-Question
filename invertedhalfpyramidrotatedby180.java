
import java.util.*;

public class invertedhalfpyramidrotatedby180 {
    
    public static void main(String[] args) {
            
         Scanner sc =  new Scanner(System.in);

         int n = sc.nextInt();

         for(int i =  1; i<=n; i++){
            int j = n-i;
            while(j>0){
                System.out.print(" ");
                j = j-1;
            }
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
         }

    }
}
