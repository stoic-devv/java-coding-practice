package common.algos;

import common.algos.SieveofErasthenos;
import org.junit.Before;
import org.junit.Test;

public class SieveofErasthenosTest {

  private int num;

  @Before
  public void init() {
    num = 100;
  }

  @Test
  public void isPrimeTest() {
    Boolean isPrime = SieveofErasthenos.isPrime(num);
    System.out.println(isPrime);
  }

  @Test
  public void print_prime_till_n() {
    for (int i = 0; i < num + 1; i++) {
      if(SieveofErasthenos.isPrime(i)) {
        System.out.println(i);
      }
    }
  }
}
