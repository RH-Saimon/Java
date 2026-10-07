// Print the spiral order matrix as output for a given matrix of numbers. 
/* 
import java.util.Scanner;

public class towDArrHomeWork {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int num[][] = new int[r][c];
        // for input:
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                num[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The Spiral Order Matrix is : ");

        int rs = 0;    //row_start
        int re = r-1;  //row_end
        int cs = 0;    //col_start
        int ce = c-1;  //col_end

        while(rs <= re && cs <= ce){
            // first:
            for(int j = cs; j <= ce; j++){
                System.out.print(num[rs][j] + " ");
            }
            rs ++;

            // 2nd
            for(int i = rs; i <= re; i++){
                System.out.print(num[i][ce] + " ");
            }
            ce --;

            // 3rd
            for(int j = ce; j >= cs; j--){
                System.out.print(num[re][j]+ " ");
            }
            re--;

            // 4th
            for(int i = re; i >= rs; i--){
                System.out.print(num[i][cs]+ " ");
            }
            cs++;
            System.out.println();
        }


    }
}

// 5
// 6
// 1 5 7 9 10 11
// 6 10 12 13 20 21
// 9 25 29 30 32 41
// 15 55 59 63 68 70
// 40 70 79 81 95 105
// The Spiral Order Matrix is : 
// 1 5 7 9 10 11 21 41 70 105 95 81 79 70 40 15 9 6 
// 10 12 13 20 32 68 63 59 55 25 
// 29 30 29 


// For a given matrix of N x M, print its transpose.

import java.util.*;

public class towDArrHomeWork{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int [][] matrix = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The transpose is: ");
        for(int j = 0; j < c; j++){
            for(int i = 0; i < r; i++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }


    }
}

// 2
// 3 
// 3 5 6 
// 6 8 5
// The transpose is: 
// 3 6 
// 5 8 
// 6 5 

*/