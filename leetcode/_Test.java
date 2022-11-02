import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;


public class _Test {
  public static void main(String[] args)  {
      Solution solution = new Solution();


      int[] nums = new int[]{3, 4};
      int[] arr = solution.twoSum(nums, 7);

      System.out.println(Arrays.toString(arr));
  }

  
}


class Solution {
  public int[] twoSum(int[] nums, int target) {
    if(nums.length == 2) return new int[]{0, 1};

    HashMap<Integer, ArrayList<Integer>> data = new HashMap<Integer, ArrayList<Integer>>();
    for (int i = 0; i < nums.length; i++) {
      if(!data.containsKey(nums[i])){
        ArrayList temp = new ArrayList<Integer>();
        temp.add(i);
        data.put(nums[i], temp);
      }else{
        ArrayList temp = data.get(nums[i]);
        temp.add(i);
        data.put(nums[i], temp);
      }
      

    }

    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int match = target - nums[i];
      // System.out.println("match " + nums[i] + " - " + match + " -- " + data.get(match).size());
      if(match == nums[i] && data.get(match).size() >1){
        // System.out.println("in ");
        result[0] = i;
        result[1] = data.get(match).get(1);
        break;

      }else if(match != nums[i] && data.containsKey(match)){
        // System.out.println("in2 ");
        result[0] = i;
        result[1] = data.get(match).get(0);
        break;
      }
    }

    return result;
  }
}

