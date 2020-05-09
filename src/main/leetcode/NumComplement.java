package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
* https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3319/
* check the more efficient solution: https://leetcode.com/submissions/detail/334413881/
* use bitwise operator: 1001 + 0110 = 1111 => 1111 - 1001 = 0110
* */
public class NumComplement {

  public static int findComplementEfficient(int num) {
    int highestBin = 1;
    int numCopy = num;
    if(num == Integer.MAX_VALUE) {
      return 0;
    }
    while(numCopy > 0) {
      numCopy /= 2;
      highestBin *= 2;
    }
    return highestBin - 1 - num;
  }

  public static int findComplement(int num) {
    List<Integer> compBinary = complementBinary(num);
    return binToNum(compBinary);
  }

  private static List<Integer> complementBinary(int num) {
    List<Integer> compBinary = new ArrayList<>();
    if (num == 0) {
      compBinary.add(1);
      return compBinary;
    }
    while (num != 0) {
      if (num % 2 == 0) {
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

  /*public int findComplement(int num) {
    int sum = 1;
    while(sum < num) {
      sum = (sum << 1) + 1;
    }

    return sum - num;
  }*/
}
