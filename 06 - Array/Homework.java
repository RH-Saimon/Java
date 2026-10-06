/* 
// Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class Homework {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String name[] = new String[size];
        // input:
        for(int i =0; i < size; i++){
            name[i] = sc.next();
        }

        // output:
        for(int i = 0; i < size; i ++){
            // System.out.println(name[i]);
            System.out.println("name " + (i+1) +" is : " + name[i]);
        }



        
    }
}

// Find the maximum & minimum number in an array of integers

import java.util.Scanner;

public class Homework {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int num[] = new int[size];
        // input:
        for(int i =0; i < size; i++){
            num[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // output:
        for(int i = 0; i < size; i ++){
            if(num[i] < min){
                min = num[i];
            }
            if(num[i] > max){
                max = num[i];
            }
            
        }
        System.out.println("Largest number is:" + max);
        System.out.println("Lowest number is:" +min);



        
    }
}


// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//      {3, 4, 6, 2} is not sorted in ascending order.


import java.util.*;


public class Homework {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }


      boolean isAscending = true;

             for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
                if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
                isAscending = false;
           }
       }


       if(isAscending) {
           System.out.println("The array is sorted in ascending order");
       } else {
           System.out.println("The array is not sorted in ascending order");
       }
      
   }
}

*/