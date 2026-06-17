package com.jahnvi;
import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        int[] arr = { 2 , 3 , 4 , 5 , 9};
        int ans = maxVal(arr);
        System.out.print(ans);
    }
    static int maxVal(int[] arr){
        Scanner sc = new Scanner(System.in);
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
