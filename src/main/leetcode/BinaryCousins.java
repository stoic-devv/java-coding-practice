package leetcode;

import utils.TreeNode;

public class BinaryCousins {

  public BinaryCousins() {}

  public boolean isCousins(TreeNode root, int x, int y) {
    if(root == null) {
      return false;
    }
    TreeNode rootCopy = new TreeNode(root.val, root.left, root.right);
    int xDepth = findDepth(rootCopy, x, 0);
    //rootCopy = new TreeNode(root.val, root.left, root.right);
    int yDepth = findDepth(rootCopy, y, 0);
    if(xDepth == yDepth && areCousins(root, x, y) > 0) {
      return true;
    }
    return false;
  }

  private int findDepth(TreeNode root, int val, int currHeight) {
    if(root == null) {
      return -1;
    }
    if(root.val == val) {
      return currHeight;
    }
    int leftDepth = findDepth(root.left, val, currHeight + 1);
    int rightDepth = findDepth(root.right, val, currHeight + 1);
    if(leftDepth != -1) {
      return leftDepth;
    }
    return rightDepth;
  }

  private int areCousins(TreeNode root, int x, int y) {
    if(root == null) {
      return -1;
    }
    if(root.left != null && root.left.val == x) {
      if(root.right != null && root.right.val == y) {
        return 0;
      } else {
        return 1;
      }
    }
    if(root.right != null && root.right.val == x) {
      if(root.left != null && root.left.val == y) {
        return 0;
      } else {
        return 1;
      }
    }
    int leftCousins = areCousins(root.left, x, y);
    int rightCousins = areCousins(root.right, x, y);
    if(leftCousins > -1) {
      return leftCousins;
    } else {
      return rightCousins;
    }
  }
}
