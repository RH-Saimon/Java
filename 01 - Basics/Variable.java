import java.util.Scanner;

public class Variable {
    public static void main(String[]args){
    int a = 20;
    int b = 30;
    int c = a+b;
    String name = "saimon";
    double d = 2.333;
    System.out.println(c);
    System.out.println(name);
    System.out.println(d+a);
 

    //  For input from user:
    
    System.out.println("enter your name:");
    Scanner sc = new Scanner(System.in);
    String name1 = sc.next();
    System.out.println(name1);

    System.out.println("enter your intput:");
    int i = sc.nextInt();
    double s = sc.nextDouble();

    System.out.println(i + s);


    } 
   

}

