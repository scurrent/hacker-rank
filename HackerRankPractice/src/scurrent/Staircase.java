package scurrent;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase {

    // Complete the staircase function below.
    public static void staircase(int n) {
     
 
        for(int i=1; i<n+1; i++){
             StringBuilder  builder = new StringBuilder(); 
            for(int s=0; s<n-i; s++){
                builder.append(" ");
            }
            for(int c=0; c<i; c++){
                builder.append("#");
            }
             System.out.println(builder);
        }
       


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}



