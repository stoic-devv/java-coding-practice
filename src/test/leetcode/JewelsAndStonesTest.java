package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JewelsAndStonesTest {

  private String S;
  private String J;

  @Before
  public void init() {
    S = "aAAbbbb";
    J = "aA";
  }

  @Test
  public void numJewelsInStones() {
    JewelsAndStones jewelsAndStones = new JewelsAndStones();
    int myJewels = jewelsAndStones.numJewelsInStones(J,S);
    System.out.println(myJewels);
  }
}