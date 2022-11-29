package Leetcode;

import java.lang.*;
public class duplicateZero {
    public void duplicateZerosArray(int[] arr) {
        int zeroCount = 0;
        for(int num: arr){
            if(num == 0) zeroCount++;
        }

        int len = arr.length;
        for(int i = len - 1; i >= 0; i--){
            int tempIndex = i + zeroCount;
            if(tempIndex < len){
                arr[tempIndex] = arr[i];
            }
            if(arr[i] == 0){
                zeroCount--;
                tempIndex = i + zeroCount;
                if(tempIndex < len && zeroCount > 0){
                    arr[tempIndex] = arr[i];
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}