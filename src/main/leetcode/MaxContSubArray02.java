package leetcode;

public class MaxContSubArray02 {
  public static int maxSubArray(int[] nums) {
    int [] solution = new int[nums.length+1];
    for (int j = 1; j <solution.length ; j++) {
      if(j == 1) {
        solution[0] = nums[0];
        solution[1] = nums[0];
        continue;
      }
      solution[j] = Math.max(solution[j-1]+nums[j-1],nums[j-1]);
    }
    int result = solution[0];
    for (int j = 1; j <solution.length ; j++) {
      if(result<solution[j])
        result = solution[j];
    }

    return result;
  }
}
