/*
Initialize a variable diff as infinite (Diff is used to store the difference between pair and sum).
We need to find the minimum diff.

Initialize two index variables left and right in the given array nums.

    (a) Initialize first to the leftmost index in nums: left = 0
    (b) Initialize second the rightmost index in nums: right = nums.length -1

Sort the Array nums

Loop while left <= right
    (a) sum = nums[left] + nums[right]
    (b) If abs( sum - target) < diff then update diff and result
    (c) If (sum > target ) then right--
    (d) Else left++
Print the result.
*/

pair<int,int> minLeft(vector<int>& A, int C) {
   sort(A.begin(),A.end());
   int N=A.size();
   assert(N>1);
   int left=0,right=N-1;
   int minSpace=INT_MAX,bestLeft=0,bestRight=0;
   while(left<right) {
      int sum = A[left]+A[right];
      if(sum>C)right--;
      else {
         if(C-sum<minSpace) {
            minSpace=C-sum;
            bestLeft = left;
            bestRight = right;
         }
         left++;
      }
   return {A[bestLeft],A[bestRight]};
}