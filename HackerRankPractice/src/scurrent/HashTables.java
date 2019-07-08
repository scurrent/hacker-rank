package scurrent;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class HashTables {

    // Complete the checkMagazine function below.
    static void checkMagazine2(String[] magazine, String[] note) {

        int magazineSize = magazine.length;
        HashMap<Integer, String> available = new HashMap<Integer, String>();
        //load my set
        for (int i=0; i<magazineSize; i++){
               available.put(i, magazine[i]); 

        }    

        for(int n=0; n<note.length; n++){
            if(!available.containsValue(note[n])){
                System.out.println("No");
                return;
            }else{
              /*
               Set<Integer> result = available.entrySet()
              .stream()
              .filter(entry -> Objects.equals(entry.getValue(), note[n]))
              .map(Map.Entry::getKey)
              .collect(Collectors.toSet());
               
            */
               
               
              int key = -1;
               for(Map.Entry<Integer, String> entry : available.entrySet()) {
                    if (entry.getValue().equals(note[n])) {
                         key =entry.getKey();
                    }
                 }
               available.remove(key);
                /*
               for (Entry<Integer, String> entry : available.entrySet()) {
                 if (Objects.equals(note[n], entry.getValue())) {
                   available.remove(entry.getKey());

                 }
               }
               */
            }        
        }
    

                
        

        System.out.println("Yes");
        return; 


    }

    
    static void checkMagazine(String[] magazine, String[] ransom) {
        // Complete the checkMagazine function below.
    HashMap<String, Integer> map = new HashMap();
       for(int i=0; i<ransom.length; i++) {
           String word = ransom[i];
           if(map.containsKey(word)) {
                int freq = map.get(word);
                map.put(word, freq+=1);  
           } else {
               map.put(word, 1);
           }
       }

       for(int j=0; j<magazine.length; j++) {
           String magWord = magazine[j];
           if(map.containsKey(magWord)) {
               int freq = map.get(magWord);
               if(freq == 1) {
                   map.remove(magWord);
               } else {
                  map.put(magWord, freq-=1); 
               }
            }
       }
       System.out.println(map.isEmpty() ? "Yes" : "No");
      
   
    }
    
    
    
    
    
    
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	
    	String[] arr1 = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
    	String[] arr2 = {"ive", "got",  "some",  "coconuts"};

    	
    	checkMagazine(arr1, arr2);

    	
    	/*
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
  */
    }
}
