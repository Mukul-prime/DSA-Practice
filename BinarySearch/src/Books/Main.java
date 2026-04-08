package Books;

import java.io.*;
import java.util.*;

class Solution {

    static boolean checks(int[] a, int n, int target, int mid) {

        int sum = 0;
        for (int i = 0; i < mid; i++) {
            sum += a[i];
        }
        if (sum <= target) return true;

        for (int i = mid; i < n; i++) {
            sum += a[i];
            sum -= a[i - mid];

            if (sum <= target) return true;
        }



        return false;

    }


    static int solve(int n, int t, int[] a) {
        int s = 1;
        int e = n ;
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (checks(a, n, t, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;

    }
}

public class Main {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int t = sc.nextInt();
       int[] a = new int[n];
       for(int i = 0 ; i< n ;i++){
           a[i] = sc.nextInt();
       }
       Solution sol = new Solution();
       int ans = sol.solve(n, t, a);
       System.out.println(ans);




    }
}