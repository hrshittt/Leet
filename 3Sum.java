package Leet;
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        for (int i = 0; i < n - 2; i++) {
            
            if (i > 0 && nums[i] == nums[i - 1]) continue;      // Sorted array duplicates ko ignore krre
            
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Move left and right to next different numbers to avoid duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;               
                    while (left < right && nums[right] == nums[right - 1]) right--;           
                    left++;
                    right--;
                } else if (sum < 0) {
                    // We need a larger number so if sum < 0 then move left 
                    left++;
                } else {
                    // We need a smaller number soif sum > 0 then move right
                    
                    right--;
                }
            }
        }
        
        return result;
    }
}
