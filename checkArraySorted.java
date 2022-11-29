// URL: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
import java.io.*;
import java.util.*;
import java.lang.*;
public class checkArraySorted {
	static boolean checkArraySorted(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0; i<n; i++) {
            if(nums[i]>nums[(i+1)%n]) {
                count++;
            }
            if(count<1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
    	int[] nums = {3,4,5,1,2};
    	System.out.println(checkArraySorted(nums));
    }
}