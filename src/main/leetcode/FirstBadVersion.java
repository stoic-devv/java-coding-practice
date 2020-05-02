package leetcode;

/*
* https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3316/
**/

public class FirstBadVersion {


  private int badVersionNumber;

  public FirstBadVersion() {
    super();
  }

  /**
  * Recursion makes less API calls than for loops.
  **/

  public int firstBadVersion(int n) {
    return badVersion(1,n);
  }
  private int badVersion(int start, int end) {
    if(start+1 == end) {
      return badEnds(start, end);
    }
    if(start >= end) {
      return start;
    }
    int mid = (start%2 == 0 ? start : start+1)/2 + end/2;
    if(isBadVersion(mid)) {
      return badVersion(start,mid);
    } else {
      return badVersion(mid,end);
    }
  }
  private int badEnds(int start, int end) {
    if(isBadVersion(start)) {
      return start;
    }
    return end;
  }

  private boolean isBadVersion(int version) {
    return version >= this.badVersionNumber;
  }

  public void setBadVersionNumber(int badVersionNumber) {
    this.badVersionNumber = badVersionNumber;
  }
}
