package leetcode;

import org.junit.Before;
import org.junit.Test;

public class FirstBadVersionTest {

  int totalVersions;
  int badVersionNumber;
  FirstBadVersion firstBadVersion;

  @Before
  public void init() {
    totalVersions = 10;
    badVersionNumber = 4;
    firstBadVersion = new FirstBadVersion();
    firstBadVersion.setBadVersionNumber(badVersionNumber);
  }

  @Test
  public void findBadVersionNumber() {
    int answer = firstBadVersion.firstBadVersion(totalVersions);
    assert(answer == badVersionNumber);
  }
}
