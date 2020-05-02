package leetcode;

import java.util.HashMap;

public class SingleNumber {
  public int solution(int[] nums) {
    HashMap<Integer, Integer> numsMap = new HashMap<>();
    for(int num : nums) {
      if(!numsMap.containsKey(num)) {
        numsMap.put(num,1);
      } else {
        numsMap.put(num, numsMap.get(num)+1);
      }
    }
    for(int key : numsMap.keySet()) {
      if(numsMap.get(key) == 1) {
        return key;
      }
    }
    return 0;
  }
}
