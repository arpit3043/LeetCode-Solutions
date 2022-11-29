// URL: https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
//User function template for C++
class Solution{
public:	
	int print2largest(int arr[], int n) {
	    // code here
	    set<int, greater<int>> ans(arr,arr+n);
	    vector<int> ans1(ans.begin(),ans.end());
	    if(ans1.size()==1) {
	        return -1;
	    }
	    else {
	        return ans1[1];
	    }
	}
};