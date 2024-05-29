public class Patterns {

    public static void main(String[] args) {
        int n = 4; // Number of rows

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row is printed
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


