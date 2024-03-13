package org.example;
import java.util.*;

public class otpmax {
    Object max(int [] arr, int sz){
        if(sz == 0){
            return null;
        } else {
            Arrays.sort(arr);
            return arr[sz-1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        int [] arr = new int[sz];
        for(int i = 0; i < sz; i++){
            arr[i] = sc.nextInt();
        }

        otpmax obj = new otpmax();
        Object result = obj.max(arr, sz);
        System.out.println("Max Value: " + result);
    }
}
