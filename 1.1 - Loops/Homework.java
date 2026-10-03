/*
Q1: Print all even numbers till n:

import java.util.Scanner;

public class Homework {
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    
    }
}


Q2: Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)


import java.util.Scanner;

public class Homework{
    public static void main(String[]args){
        System.out.println("Enter 1 or 0:");

        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Enter 1 to enter markd or enter 0 to stop:");
            choice = sc.nextInt();

            if(choice == 1){
                System.out.print("Enter marks: ");
                int marks = sc.nextInt();
  
                if(marks >= 90){
                    System.out.println("This is good");
                }
                else if(marks >= 60){
                    System.out.println("This is also good");
                }

                else{
                    System.out.println("This is good as well");
                    System.out.println("Because marks don't matter but our effort does.");
                }

            }
              
        }while(choice != 0);

        System.out.println("Program stopped.");

    }
}


Qs. Print if a number is prime or not (Input n from the user). 

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }
}

*/