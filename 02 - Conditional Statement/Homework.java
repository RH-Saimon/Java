// 01: Make a Calculator. Take 2 numbers (a & b) from the user
/* 
import java.util.Scanner;

public class Homework {
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition");
        System.out.println(a + b);

        System.out.println("Substraction");
        System.out.println(a - b);

        System.out.println("Multiplication");
        System.out.println(a * b);

        System.out.println("Divition");
        System.out.println(a / b);
    }
}
*/


// 02: Ask the user to enter the number of the month & print the name 
// of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

import java.util.Scanner;

public class Homework{
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1: System.out.println();
                break;
                
            case 2: System.out.println("Fabruary");
                break;

            case 3: System.out.println("March");
                break;

            case 4: System.out.println("April");
                break;

            case 5: System.out.println("May");
                break;

            case 6: System.out.println("June");
                break;

            case 7: System.out.println("July");
                break;

            case 8: System.out.println("Augast");
                break;

            case 9: System.out.println("Semtember");
                break;

            case 10: System.out.println("October");
                break;

            case 11: System.out.println("November");
                break;
            
            case 12: System.out.println("December");
                break;    

        
            default: System.out.println("invalid input.");
                break;
        }
    }
}