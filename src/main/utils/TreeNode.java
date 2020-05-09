package utils;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;
  public TreeNode parent;
  public TreeNode() {}
  TreeNode(int val) { this.val = val; }
  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
  public TreeNode(int val, TreeNode left, TreeNode right, TreeNode parent) {
    this.val = val;
    this.left = left;
    this.right = right;
    this.parent = parent;
  }

  public TreeNode constructBinaryTree(int[] nodeArray) {
    List<TreeNode> treeNodeList = new ArrayList<>();
    int numNodes = nodeArray.length;
    for (int i = 0; i < numNodes; i++) {
      if(nodeArray[i] != 0) {
        treeNodeList.add(new TreeNode(nodeArray[i], null, null));
      } else {
        treeNodeList.add(new TreeNode());
      }
    }
    for (int i = 0; i < numNodes; i++) {
      if(2*i + 1 < numNodes) {
        treeNodeList.get(i).left = treeNodeList.get(2*i+1);
        treeNodeList.get(2*i+1).parent = treeNodeList.get(i);
      }
      if(2*i + 2 < numNodes) {
        treeNodeList.get(i).right = treeNodeList.get(2*i+2);
        treeNodeList.get(2*i+2).parent = treeNodeList.get(i);
      }
    }
    return treeNodeList.get(0);
  }
}
