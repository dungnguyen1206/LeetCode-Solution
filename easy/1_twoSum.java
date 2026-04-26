/**
 * Problem: Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 *
 * Approach:
 * - Use HashMap to save value → index
 * - For each items, check the component
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
                int component = target - nums[i];
                if(map.containsKey(component)){
                    return new int[]{i,map.get(component)};
                }
                map.put(nums[i],i);
        }
        return new int[]{};
    }

}
