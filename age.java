import java.util.*;

public class age {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        //  int age = sc.nextInt();

        //  if(age>18){
        //     System.out.println("You are adult");
        //  }
        //  else{
        //       System.out.println("you are not adult");
        //  }

        //  int num = sc.nextInt();

        //  if(num%2 == 0){
        //     System.out.println("Even");
        //  }
        //  else{
        //     System.out.println("Not even");
        //  }
        int button = sc.nextInt();

        // if(button == 1){
        //     System.out.println("hello");
        // }else if(button == 2){
        //     System.out.println("Namaste");
        // }
        // else if(button == 3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("baad mai joa");
        // }
        switch(button){
             case 1: System.out.println("hello");
             break;

             case 2: System.out.println("namaste");
             break;

             case 3: System.out.println("bonjour");
             break;

             default:System.out.println("Invalid Button");




        }
    }
}
