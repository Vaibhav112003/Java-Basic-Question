import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = n;
        for(int i = 1; i<=n; i++){
            for(int j = l; j>0; j--){
                   System.out.print("*");
                   l = l-1;
                   
            }
            System.out.println();
        }
    }
}
