package QuickSort;


import java.util.*;
import java.io.*;

class Solution{

    public static int partion(int[] arr , int s , int e){
        int p =(int)( Math.random()*(e-s+1))+s;
        swap(arr,p,e);

        int pivoit = e ;
        int lelft = s-1;
        for(int i = s ; i<=e-1 ; i++){
            if(arr[i]<arr[pivoit]){
                lelft++;
                swap(arr,i,lelft);
            }
        }
        swap(arr,lelft+1,pivoit);
        return lelft+1;
    }

    public static void swap(int[] arr,int i,int lelft){
        int temp = arr[i];
        arr[i]= arr[lelft];
        arr[lelft]=temp;
    }

    public static void QuickSorts(int[] arr , int s , int e){
        if(s>=e)return;
        int p = partion(arr,s,e);
        QuickSorts(arr,s,p-1);
        QuickSorts(arr,p+1,e);

    }
    static void quickSort(int[] arr){
        int s = 0 ;
        int e = arr.length -1;
        QuickSorts(arr,s,e);

    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.quickSort(arr);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}