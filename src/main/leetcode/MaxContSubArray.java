package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MaxContSubArray {

  public int maxSubArray(int[] nums) {
    List<ArrayList<Integer> > maxSubArrayData = new ArrayList<ArrayList<Integer> > ();
    List<ArrayList<Integer> > lastNumIncluded = new ArrayList<ArrayList<Integer> > ();
    List<ArrayList<Integer> > sumArray = getSumArray(nums);
    for(int i = 0; i < nums.length; i++) {
      maxSubArrayData.add(new ArrayList<Integer>());
      lastNumIncluded.add(new ArrayList<Integer>());
      //System.out.println(maxSubArrayData.size()-1);
      for(int j = 0; j< nums.length; j++) {
        if(i == j) {
          //System.out.println("----" + j + "----");
          maxSubArrayData.get(i).add(nums[j]);
          lastNumIncluded.get(i).add(j);
        } else if(i > j) {
          //System.out.println(maxSubArrayData.size() + " " + i + " " + j);
          maxSubArrayData.get(i).add(maxSubArrayData.get(j).get(i));
          lastNumIncluded.get(i).add(lastNumIncluded.get(j).get(i));
        } else {
          //System.out.println("---" + j + "---");
          maxSubArrayData.get(i).add(
              max(max(maxSubArrayData.get(i).get(j-1) + sumArray.get(
                  lastNumIncluded.get(i).get(j-1) + 1).get(j),nums[j]),
                  maxSubArrayData.get(i).get(j-1)));
          if(maxSubArrayData.get(i).get(j) == maxSubArrayData.get(i).get(j-1) + sumArray.get(
              lastNumIncluded.get(i).get(j-1) + 1).get(j) ||
              maxSubArrayData.get(i).get(j) == nums[j]) {
            lastNumIncluded.get(i).add(j);
          } else {
            lastNumIncluded.get(i).add(lastNumIncluded.get(i).get(j-1));
          }
        }
      }
    }

    int maxSum = Integer.MIN_VALUE;
    for(List<Integer> subArraySums : maxSubArrayData) {
      for(Integer sum: subArraySums) {
        //System.out.print(sum + "  ");
        if(sum > maxSum) {
          maxSum = sum;
        }
      }
      //System.out.println();
    }
    // for(List<Integer> subArraySums : lastNumIncluded) {
    //     for(Integer sum: subArraySums) {
    //         System.out.print(sum + "  ");
    //     }
    //     System.out.println();
    // }
    return maxSum;
  }
  private Integer max(Integer a, Integer b) {
    return a > b ? a : b;
  }
  private List<ArrayList<Integer> > getSumArray(int[] nums) {
    List<ArrayList<Integer> > sumArray =  new ArrayList<ArrayList<Integer> > ();
    for(int i = 0; i < nums.length; i++) {
      sumArray.add(new ArrayList<Integer>());
      for(int j = 0; j < nums.length; j++) {
        sumArray.get(i).add(sumArray(nums,i,j));
        String s = "";
        System.out.println();
      }
    }
    return sumArray;
  }
  private Integer sumArray(int[] nums, int start, int end) {
    int sum = 0;
    for(int i = start; i<= end; i++) {
      sum += nums[i];
    }
    return sum;
  }
}
