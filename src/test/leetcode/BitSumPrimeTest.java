package leetcode;

import org.junit.Before;
import org.junit.Test;


public class BitSumPrimeTest {

  private int n;

  @Before
  public void init() {
    n = 30;
  }

  @Test
  public void bitSumPrimeTest() {
    Boolean isBitPrimeSum = BitSumPrime.solution(n);
    System.out.println(isBitPrimeSum);
  }
}
