public class Patterns {

    public static void main(String[] args) {
        int n = 4; 

        // Outer loop 
        for (int i = 1; i <= n; i++) {
            // Inner loop f
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
        
            System.out.println();
        }
    }
}

import java.util.*;

public class patterns {

     public static void main (String[] args) {

         int n = 4;

         //outer loop
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= i; j++) {

                     System.out.print("*");
                 }
             System.out.println();
         }
     }
}


