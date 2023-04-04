import java.util.*;


public class diamondpattern {
    
    public  static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //upper
        for(int i = 1; i<=n; i++){
            for(int j = n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            if(i != 1){
                for(int j = 1; j<=i; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //lower
        for(int i = n; i>=1; i--){
            for(int j = n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            if(i != 1){
                for(int j = 1; j<=i; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
