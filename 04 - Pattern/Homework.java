//     *****
//    *****
//   *****
//  *****
// *****
/* 
public class Homework {
    public static void main(String[]args){
      int n = 5;
      for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }

            System.out.println();

            

        }

    }
}


//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 
public class Homework {
    public static void main(String[]args){
      int n = 5;
      for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print(i+ " ");
            }

            System.out.println();

            

        }

    }
}

//         1 
//       2 1 2 
//     3 2 1 2 3 
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5 
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Decreasing
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Increasing
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}



// *        *
// **      **
// * *    * *
// *  *  *  *
// *   **   *
// *  *  *  *
// * *    * *
// **      **
// *        *
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {

            System.out.print("*");

            // Left inner space
            for (int j = 1; j <= i - 2; j++)
                System.out.print(" ");

            if (i > 1)
                System.out.print("*");

            // Middle space
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");

            if (i > 1)
                System.out.print("*");

            // Right inner space
            for (int j = 1; j <= i - 2; j++)
                System.out.print(" ");

            System.out.print("*");

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            System.out.print("*");

            for (int j = 1; j <= i - 2; j++)
                System.out.print(" ");

            if (i > 1)
                System.out.print("*");

            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");

            if (i > 1)
                System.out.print("*");

            for (int j = 1; j <= i - 2; j++)
                System.out.print(" ");

            System.out.print("*");

            System.out.println();
        }
    }
}


*/