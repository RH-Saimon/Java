// Take an array of Strings input from the user & find 
// the cumulative (combined) length of all those strings.
/* 
import java.util.Scanner;

public class HomeWork {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String [] arr = new String[size];

        int totLength = 0;

        for(int i = 0; i < size; i++){
            arr[i] = sc.next();
            totLength += arr[i].length();
        }
        System.out.println(totLength);

        
    }
}

// Input a string from the user. Create a new string called ‘result’
//  in which you will replace the letter ‘e’ in the 
// original string with letter ‘i’. 

import java.util.Scanner;

public class HomeWork {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string value:");
        
        String original = sc.next();

        String result = " ";

        for(int i = 0; i < original.length(); i++){
            if(original.charAt(i) == 'e'){
                result += 'i';
            }
            else{
                result += original.charAt(i);
            }
        }
        System.out.println("your result :");
        System.out.println(result);
       
    }
}
*/
// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

import java.util.Scanner;

public class HomeWork {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your email:");
        
        String email = sc.next();
        
        String username = "";

        for(int i = 0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }else{
                username += email.charAt(i);
            }
        }
        System.out.println(username);
       
    }
}