package Problems;

import java.util.*;

public class SumOfUpperAndLowerTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        triangleSums(n, matrix);
        sc.close();
    }

    public static int uppperTriangle(int[][] matrix, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;

    }

    public static int LowerTriangle(int[][] matrix, int n) {
     int sum = 0 ;
     for(int i = 0 ; i< n ; i++){
         for(int j = 0 ; j<=i;j++){
             sum += matrix[i][j];
         }
     }
     return sum;

    }

    public static void triangleSums(int n, int[][] matrix) {
        int a = uppperTriangle(matrix, n );
        int b = LowerTriangle(matrix, n);
        System.out.println(a+" "+b);
    }
}