package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueTest {

  private String s;

  @Before
  public void init() {
    s = "loveleetcode";
  }

  @Test
  public void findComplement() {
    System.out.println(FirstUnique.firstUniqChar(s));
  }

}