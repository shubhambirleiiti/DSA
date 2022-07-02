//217. Contains Duplicate
import java.util.*;
  
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
            set.add(nums[i]);
        }
        
        if(set.size() == list.size()){
            return false;
        }
        
        return true;
    }
}