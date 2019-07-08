package scurrent;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class NewYearChaos {



	    static void minimumBribes(int[] q) {


	        int bribeCount = 0;
	  
	         int[] arr = q.clone();

	        int n = arr.length;
	        for (int i = 0; i < n-1; i++){
	           
	            int place = q[i];
	            int diff = (place - (i+1));
	          //  System.out.println(place + "  - " + (i+1) + " = " + diff);
	            if(diff > 2){
	                System.out.println("Too chaotic");
	                return; 
	            }

	            for (int j = 0; j < n-i-1; j++){
	                if (arr[j] > arr[j+1]){
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                    bribeCount++;
	                }
	            } 
	               
	        }

	System.out.println(java.lang.Math.abs(bribeCount));
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int t = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int tItr = 0; tItr < t; tItr++) {
	            int n = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            int[] q = new int[n];

	            String[] qItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int i = 0; i < n; i++) {
	                int qItem = Integer.parseInt(qItems[i]);
	                q[i] = qItem;
	            }

	            minimumBribes(q);
	        }

	        scanner.close();
	    }
	}


