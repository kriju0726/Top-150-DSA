//Link: https://leetcode.com/problems/two-sum/
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> mp;

        for(int i=0; i<nums.size(); i++){
            int complement = target - nums[i];

            if(mp.find(complement) != mp.end()){
                return {mp[complement], i};
            }

            mp[nums[i]] = i;

        }
        throw runtime_error("No soln. found");
    }
};



/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] res = new int[2];

        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                    
                }
            }
        }
        return res;
    }
}
*/