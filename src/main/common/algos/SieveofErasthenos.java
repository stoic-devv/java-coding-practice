package common.algos;

import java.util.ArrayList;
import java.util.List;

public class SieveofErasthenos {

  public static boolean isPrime(int bitSum) {
    List<Integer> allNumbers = new ArrayList<>();
    List<Integer> cloneAllNumbers = new ArrayList<>();
    for (int i = 0; i < bitSum; i++) {
      allNumbers.add(i+1);
      cloneAllNumbers.add(i+1);
    }
    for(int num: allNumbers) {
      if(num == bitSum) {
        return true;
      }
      if(cloneAllNumbers.size() > 0 && cloneAllNumbers.get(cloneAllNumbers.size()-1) == bitSum) {
        eliminateNumbers(cloneAllNumbers, num);
      } else {
        return false;
      }
    }

    return false;
  }

  private static void eliminateNumbers(List<Integer> allNumbers, int someNum) {

    if(someNum == 1) {
      allNumbers.remove(new Integer(1));
      return;
    }
    int num = 2;
    int tempNum = someNum;
    while(allNumbers.size() > 0 && tempNum <= allNumbers.get(allNumbers.size()-1)) {
      allNumbers.remove(new Integer(tempNum));
      tempNum = someNum*num;
      num++;
    }
  }
}
