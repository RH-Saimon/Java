import java.util.Scanner;

public class Swich {
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1: System.out.println("Assalamualaikum");
            break;

            case 2: System.out.println("hello");
            break;

            default: System.out.println("Invatid input.");
        }

    }
}
