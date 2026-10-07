/* 
import java.util.Scanner;

public class Function {
    static int CalcMultiple(int a, int b){
        return a*b;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int Mul = CalcMultiple(a, b);
        System.out.println("2 numbers mul = "+Mul );
    }
}

import java.util.Scanner; 

public class Function {
    static int CalcSum(int a, int b){
        return a+b;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int Sum = CalcSum(a, b);
        System.out.println("2 numbers Sum = "+Sum );
    }
}

import java.util.Scanner;

public class Function {
    static void CalcFactorial(int a){
        if(a < 0){
            System.out.println("invalid number.");
            return;
        }
        int fact = 1;
        for(int i = a; i >= 1; i--){
            fact *= i;
        }
        System.out.println(fact);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
    
        CalcFactorial(a);

        
    }
}
    


// Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Function {
    static int CalcAvg(int a, int b, int c){
        int avg = (a + b + c)/3;
        System.out.println(avg);
        return 1;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    
        CalcAvg(a, b, c);

        
    }
}

// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class Function {
    static void CalcSum(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(i % 2 == 1){
                sum += i;
            }
            
        }
        System.out.println(sum);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        CalcSum(n);

        
    }
}

// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class Function {
    static void GreatestNum(int a, int b){

            if(a > b){
                System.out.println("Num a is greater");
            }
            else{
                System.out.println("num b is greater.");            
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        GreatestNum(a, b);

        
    }
}
*/
// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class Function {

    static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        System.out.println(circumference(radius));
    }
}

// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.


// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// (BONUS)
