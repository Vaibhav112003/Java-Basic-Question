import java.util.*;

public class powerofX {

    public static int powerofx(int n , int x) {
        
        int ans = x;
        for(int i = 1; i<n; i++){
          ans = ans*x;
        }

        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int sol = powerofx(n , x);

        System.out.println(sol);
    }
}
