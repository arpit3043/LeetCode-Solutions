// URL: https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array
public class maximumElement {
    public int largest(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = {1, 8, 7, 56, 90};
        int n = A.length;
        System.out.println(largest(largest(A)));
    }
}
