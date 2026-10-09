import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        // Declaration
        // String name = "Saimon";

        // taking input from user:
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String secondName = sc.next();

        // Concatenatin: means adding two values of same type
        String FullName = firstName + " " + secondName;
        System.out.println(FullName);

        // Print length of a String
        System.out.println(FullName.length());

        // Access Character of string: {charAt(index)};
        for(int i = 0; i<FullName.length(); i++){
            System.out.println(FullName.charAt(i));
        }

        // compare 2 string: {compareTo()} or {equals()}
        String name1 = sc.next();
        String name2 = sc.next();

        if(name1.compareTo(name2) == 0){
            System.out.println("those name are same.");
        }
        else{
            System.out.println("Those name are not same.");
        }

        // Or
        if(name1.equals(name2)){
            System.out.println("theey are the same string");
        }
        else{
            System.out.println("they are not same strings");
        }

        // Substring : {name.substring(1st index, end index)}
        String name = sc.next();
        System.out.println(name.substring(2));

        // ParseInt method of integer class: convert string values to integer vlaue
        String val = "1345";
        int num = Integer.parseInt(val);
        System.out.println(num);

        // ToString method of string class: convert integer value into String values
        int val1 = 1234;
        String str = Integer.toString(val1);
        System.out.println(str.length());
    }
}
