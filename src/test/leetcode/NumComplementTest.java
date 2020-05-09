package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumComplementTest {

  private int num;

  @Before
  public void init() {
    num = 34;
  }

  @Test
  public void findComplement() {
    System.out.println(NumComplement.findComplement(num));
    System.out.println(NumComplement.findComplementEfficient(num));
  }
}