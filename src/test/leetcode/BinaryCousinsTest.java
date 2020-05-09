package leetcode;

import org.junit.Before;
import org.junit.Test;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class BinaryCousinsTest {

  TreeNode root;
  List<Integer> treeArr;
  int x,y;

  @Before
  public void init() {
    treeArr = new ArrayList<>();
    int[] nodeArr = {1,2,3,0,4,0,5};
    x = 5;
    y = 4;
    root = new TreeNode();
    root = root.constructBinaryTree(nodeArr);
  }

  @Test
  public void isCousins() {
    BinaryCousins binaryCousins = new BinaryCousins();
    // true for root = [1,2,3,null,4,null,5], x = 5, y = 4
    //false for root = [1,2,3,null,4], x = 2, y = 3
    // false for root = [1,2,3,4], x = 4, y = 3
    assert binaryCousins.isCousins(root,x,y);
  }
}