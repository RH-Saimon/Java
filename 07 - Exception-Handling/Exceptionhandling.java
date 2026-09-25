import java.util.Scanner;

class AgeValidator{
    // throws
    static void checkAge(int age) throws Exception{
        // throw
        if (age < 18){
            throw new Exception("age must be 18 or above");
        }
        System.out.println("valid age");
    }
}

public class exceptionhandling{
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        try{
            // two integer input
            System.out.print("enter first number:");
            int a = sc.nextInt();

            System.out.print("enter second number:");
            int b = sc.nextInt();

            //ArithmeticException
            int result = a / b;
            System.out.println("result:" + result);

            // arrray index out of bounds
            int[] numbers = {10, 20, 30};
            System.out.print("enter array index: ");
            int index = sc.nextInt();

            System.out.println("value: "+numbers[index]);

            // bonus throw + throws
            System.out.print("enter age: ");
            int age = sc.nextInt();

            AgeValidator.checkAge(age);
        }
        catch(ArithmeticException e){
            System.out.println("cant divided by zero.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid array index.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program completed");
        }
    }
}
