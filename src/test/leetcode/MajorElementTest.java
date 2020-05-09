package leetcode;

import org.junit.Before;
import org.junit.Test;

public class MajorElementTest {

  private int[] num;

  @Before
  public void init() {
    int[] tempNum = {2,2,1,1,1,2,2};
    num = tempNum;
  }

  @Test
  public void maxSubTest() {
    assert MajorElement.majorityElement(num) == 2;
  }

}