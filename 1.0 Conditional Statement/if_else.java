// import java.util.Scanner;

// public class if_else {
//    static void main(String[] var0) {
//       Scanner var1 = new Scanner(System.in);
//       System.out.println("check age is adult or not:");
//       int var2 = var1.nextInt();
//       if (var2 >= 18) {
//          System.out.println("Adult");
//       } else {
//          System.out.println("Not adult");
//       }

//       System.out.println("check even or odd:");
//       int var3 = var1.nextInt();
//       if (var3 % 2 == 0) {
//          System.out.println("Number is even");
//       } else {
//          System.out.println("Number is odd");
//       }

//    }
// }

import java.util.Scanner;

public class if_else {

   static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the number:");
      int a = var1.nextInt();
      int b = var1.nextInt();
      if (a == b) {
         System.out.println("Equal number.");
      } else if(a > b) {
         System.out.println("A is greater.");
      }
      else {
        System.out.println("A is lesser.");
        }

   }
}