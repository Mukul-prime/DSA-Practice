package SearchinsortedMatrix;

import java.io.*;
import java.util.*;


class Solution {
    public String searchMatrix(int[][] matrix, int row, int col, int target) {
        Arrays.sort(matrix, (a, b) -> a[0] - b[0]);
        int[] ar = new int[row * col];
        int s = 0;
        int e = ar.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (ar[mid] == target) {
                return "TRUE";


            } else if (ar[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return "FALSE";
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int target = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <= m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Solution s = new Solution();
        String ans = s.searchMatrix(arr, n, m, target);
        System.out.println(ans);


    }
}