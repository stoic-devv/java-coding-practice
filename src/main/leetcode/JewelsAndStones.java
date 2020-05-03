package leetcode;

import java.util.HashMap;

public class JewelsAndStones {
  public int numJewelsInStones(String J, String S) {
    HashMap<Character, Integer> myStones = new HashMap<>();
    for(int i=0; i<S.length(); i++) {
      int count = myStones.getOrDefault(S.charAt(i), 0);
      myStones.put(S.charAt(i), count + 1);
    }
    int myJewels = 0;
    for(int i=0; i<J.length(); i++) {
      if(myStones.containsKey(J.charAt(i))) {
        myJewels += myStones.get(J.charAt(i));
      }
    }
    return myJewels;
  }
}
