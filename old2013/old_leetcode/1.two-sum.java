import java.util.Arrays;
import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
  public int[] twoSum(int[] nums, int target) {
    if(nums.length == 2) return new int[]{0, 1};

    HashMap<Integer, Integer> visited = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      
      if(visited.containsKey(target - nums[i])){
        return new int[]{visited.get(target - nums[i]), i};
      }
      visited.put(nums[i], i);

    }
    return new int[]{0,0};

  }
}
// @lc code=end



// class Solution1 {
//   public int[] twoSum(int[] nums, int target) {
//     if(nums.length == 2) return new int[]{0, 1};

//     HashMap<Integer, ArrayList<Integer>> data = new HashMap<Integer, ArrayList<Integer>>();
//     for (int i = 0; i < nums.length; i++) {
//       if(!data.containsKey(nums[i])){
//         ArrayList temp = new ArrayList<Integer>();
//         temp.add(i);
//         data.put(nums[i], temp);
//       }else{
//         ArrayList temp = data.get(nums[i]);
//         temp.add(i);
//         data.put(nums[i], temp);
//       }
      

//     }

//     int[] result = new int[2];
//     for (int i = 0; i < nums.length; i++) {
//       int match = target - nums[i];

//       if(match == nums[i] && data.get(match).size() >1){

//         result[0] = i;
//         result[1] = data.get(match).get(1);
//         break;

//       }else if(match != nums[i] && data.containsKey(match)){
//         result[0] = i;
//         result[1] = data.get(match).get(0);
//         break;
//       }
//     }

//     return result;
//   }
// }