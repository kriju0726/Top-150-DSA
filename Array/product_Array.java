//Link: https://leetcode.com/problems/product-of-array-except-self/description/

/*
Java -- Optimal approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] res = new int[n];
        Arrays.fill(res, 1);

        int prefix = 1;

        for(int i=0; i<n; i++){
            res[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for(int i=n-1; i>=0; i--){
            res[i] *= suffix;
            suffix *= nums[i];
        }

        return res;
    }
}
*/



/*
C++ -- Optimal approach
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();

        vector<int> res(n, 1);

        int prefix = 1;
        for(int i=0; i<n; i++){
            res[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for(int i=n-1; i>=0; i--){
            res[i] *= suffix;
            suffix *= nums[i];
        }
        return res;
    }
};
*/