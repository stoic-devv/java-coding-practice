package leetcode;

import org.junit.Before;
import org.junit.Test;

public class MaxConstSubArrayTest {

  private int[] num;

  @Before
  public void init() {
    int[] tempNum = {-2,1,-3,4,-1,2,1,-5,-4};
    num = tempNum;
  }

  @Test
  public void maxSubTest() {
    System.out.println(MaxContSubArray02.maxSubArray(num));
  }
}
