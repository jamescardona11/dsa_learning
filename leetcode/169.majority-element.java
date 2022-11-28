/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;


        for(int i = 0; i < nums.length; i++) {
            if(count == 0){
                res = nums[i];
            }

            count += nums[i] == res ? 1 : -1;
        }

        return res;   
    }
}
// @lc code=end

// 43/43 cases passed (1 ms)
// Your runtime beats 99.94 % of java submissions
// Your memory usage beats 88.93 % of java submissions (46 MB)



// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);

//         return nums[nums.length/2];   
//     }
// }
// Accepted
// 43/43 cases passed (5 ms)
// Your runtime beats 72 % of java submissions
// Your memory usage beats 41.4 % of java submissions (56.3 MB)

// Boyer moore