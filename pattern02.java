import java.util.*;

public class pattern02 {
    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();

        for(int i = 1; i<=row; i++){
           for(int j = 1; j<=cols; j++){
               if(i == 1 || i == row || j == 1 || j == cols){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
           }
           System.out.println();
        }
    }
}