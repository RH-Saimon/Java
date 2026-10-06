/* 
public class Array {
    static void main(String agrs[]){
        // symtem 1:
        int [] marks = new int[4];
        // marks[0] = 91;
        // marks[1] = 92;
        // marks[2] = 93;
        // marks[3] = 94;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // system 2: using loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

    }
}


import java.util.Scanner;

public class Array{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] num = new int[size];

        System.out.println("Enter your result:");

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("The output will be:");

        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
*/
import java.util.Scanner;

public class Array{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] num = new int[size];

        System.out.println("Enter your numbers:");

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("enter value of x:");
        int x = sc.nextInt();

        System.out.println("The output will be:");

        for (int i = 0; i < size; i++) {
            if (num[i] == x){
                System.out.println("the x found of index:" + i);
            }
            
        }
    }
}