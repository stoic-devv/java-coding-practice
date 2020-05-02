package leetcode;

import common.algos.SieveofErasthenos;

import java.util.ArrayList;
import java.util.List;

public class BitSumPrime {

  public static boolean solution(int n) {
    List<Integer> bitArray = computeBitArray(n);
    int bitSum = computeBitSum(bitArray);
    return SieveofErasthenos.isPrime(bitSum);
  }

  private static int computeBitSum(List<Integer> bitArray) {
    int bitSum = 0;
    for(int bitNum: bitArray) {
      bitSum += bitNum;
    }
    return bitSum;
  }

  private static List<Integer> computeBitArray(int n) {
    List<Integer> bitArray = new ArrayList<>();
    while(n != 0) {
      int bit = n % 2;
      bitArray.add(bit);
      n /= 2;
    }
    return bitArray;
  }
}