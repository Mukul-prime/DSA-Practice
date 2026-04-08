package Search_on_rotate_and_sorted_Array;

import java.util.*;

class Accio{
    static int MinElement(int n,int[] arr){
        int s = 0 ;
        int e = n-1 ;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            else if()



        }
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        Accio obj = new Accio();
//        int ans = obj.MinElement(n,arr);
//        System.out.println(ans);
    }
}




