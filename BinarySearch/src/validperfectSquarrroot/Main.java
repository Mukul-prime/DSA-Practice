package validperfectSquarrroot;

import java.util.*;
import static java.lang.Math.ceil;

class Accio {
    public boolean isboolean(int n){
        long s = 1;
        long e = n ;
        while(s<=e){
            long mid = s+(e-s)/2;
            if(mid*mid == n){
                return true;
            }
            else if(mid*mid > n){
                e = mid - 1 ;
            }else{
                s= mid+1;
            }
        }
        return false;
    }



    public void ValidatePerfectSquare(int n) {

        if(isboolean(n)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }



    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio Obj = new Accio();
        Obj.ValidatePerfectSquare(n);

    }
}