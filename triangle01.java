import java.util.*;

public class triangle01 {
    
  public static void main(String[] args){
            
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int count = 1;
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=i; j++){
             
             System.out.print(count);
            
             if(count == 1){
              count = 0;
             }
             else{
              count  = 1;
             }
      }
      System.out.println();
    }
  }
}
