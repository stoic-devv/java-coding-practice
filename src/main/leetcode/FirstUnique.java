package leetcode;

import java.util.HashMap;

/*
* https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3320/
**/
public class FirstUnique {
  public static int firstUniqChar(String s) {
    HashMap<Character, Integer> hashMap = new HashMap<>();
    for(int i=0;i<s.length();i++) {
      int count = hashMap.getOrDefault(s.charAt(i),0);
      hashMap.put(s.charAt(i),count+1);
    }
    for(int i=0;i<s.length();i++) {
      if(hashMap.get(s.charAt(i)) == 1) {
        return i;
      }
    }
    return -1;
  }
}
