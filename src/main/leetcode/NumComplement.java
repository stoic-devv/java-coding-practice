package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
* https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3319/
* */
public class NumComplement {
  public static int findComplement(int num) {
    List<Integer> compBinary = complementBinary(num);
    return binToNum(compBinary);
  }

  private static List<Integer> complementBinary(int num) {
    List<Integer> compBinary = new ArrayList<>();
    if(num == 0) {
      compBinary.add(1);
      return compBinary;
    }
    while(num != 0) {
      if(num % 2 == 0) {
        compBinary.add(1);
      } else {
        compBinary.add(0);
      }
      //System.out.println(num + " " + num%2);
      num /= 2;
    }
    return compBinary;
  }

  private static int binToNum(List<Integer> compBinary) {
    int num = 0;
    int exponent = 1;
    removeTrailingZeros(compBinary);
    while(compBinary.size() > 0) {
      num += exponent*compBinary.remove(0);
      exponent *= 2;
    }
    return num;
  }

  private static void removeTrailingZeros(List<Integer> compBinary) {
    while(compBinary.size() > 0 && compBinary.get(compBinary.size()-1) == 0) {

      compBinary.remove(compBinary.size()-1);
    }
  }
}
