package scurrent;

	
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class IceCreamParlor {

	    // Complete the whatFlavors function below.
	    static void whatFlavors(int[] cost, int money) {

	    HashMap<Integer, Integer> hashMap = new HashMap<>();

	        for(int i=0; i<cost.length; i++){



	        	  if (hashMap.containsKey(money - cost[i])) {
	                  int index = hashMap.get(money - cost[i]);
	                  System.out.println((index + 1) + " " + (i + 1));
	                  
	            	  System.out.println("hashmap contents");
		                hashMap.forEach((k,v)->{
		            		System.out.println("Item : " + k + " Item  : " + v);
		            		
		            	});
	                  return;
	              }

	            if (!hashMap.containsKey(cost[i])) {
	                    hashMap.put(cost[i], i);
	                    
	                    System.out.println("Put : " + cost[i] + " Value  : " + i);
	            }           


	        }


	    }
	    public static int indexOf(int[] cost, int value, int excludeThis) {
	    	for (int i = 0; i< cost.length; i++) {
	    		if (cost[i] == value && i != excludeThis) {
	    			return i;
	    		}
	    	}
	    	return -1;
	    	
	    }
	    
	    
	    public static int[] getIndexFromValues(int[] cost, int value1, int value2) {
	    	int index1 = indexOf(cost, value1, -1);
	    	int index2 = indexOf(cost, value2, index1);
	    	int [] idex = {Math.min(index1,  index2), Math.max(index1, index2)};
	    	return idex;
	    
	    	
	    }
	    

	    // Complete the whatFlavors function below.
	    static int[] whatFlavors2(int[] cost, int money) {
	    	int [] index;  
	    	int[] sortedCost = cost.clone();
	    	Arrays.sort(sortedCost);
	    	
	    	for(int i=0; i <sortedCost.length; i++) {
	    		int complement = money - cost[i];
	    		int location = Arrays.binarySearch(sortedCost,  i+1, sortedCost.length, complement);
	    		if( location >= 0 && location < cost.length && cost[location]== complement) {
	    			index = getIndexFromValues(cost, cost[i], complement);
	    			return index;
	    		}
	    	}
	    	
	    	return null; 
	    	
	    	
	    }	
	    
	    

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	/*
	        int t = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int tItr = 0; tItr < t; tItr++) {
	            int money = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            int n = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            int[] cost = new int[n];

	            String[] costItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int i = 0; i < n; i++) {
	                int costItem = Integer.parseInt(costItems[i]);
	                cost[i] = costItem;
	            }

	        }

	        scanner.close();
	        */
	    	
	    	int[] cost = {1,4,5,3,2};
            whatFlavors(cost, 4);

	    }
	}



