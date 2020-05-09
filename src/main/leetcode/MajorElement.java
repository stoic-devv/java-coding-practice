package leetcode;

import java.util.HashMap;

/**
* @see <a href = https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3321/>
 *     Major element </a>
**/

public class MajorElement {
  public static int majorityElement(int[] nums) {
    HashMap<Integer, Integer> freqMap = new HashMap<>();
    int size = nums.length;
    for(int i=0;i<size;i++) {
      freqMap.put(nums[i], freqMap.getOrDefault(nums[i],0)+1);
    }
    for(int i=0;i<size;i++) {
      if(freqMap.get(nums[i]) > size/2) {
        return nums[i];
      }
    }
    return 0;
  }
}
