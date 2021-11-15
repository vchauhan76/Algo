package Company.binarytree;

// Given a binary tree, return the level order traversal of its nodes' values.
// (ie, from left to right, level by level).

/*Given a pointer to the root of a binary tree,
        you need to print the level order traversal of this tree.
        In level-order traversal, nodes are visited level by level from left to right.*/

// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its level order traversal as:
// [
//   [3],
//   [9,20],
//   [15,7]
// ]

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        List<Integer> tempList = new ArrayList<>();
        tempList.add(root.val);
        result.add(tempList);

        while(!queue.isEmpty()) {
            Queue<TreeNode> currentLevel = new LinkedList<>();

            List<Integer> list = new ArrayList<>();

            while(!queue.isEmpty()) {
                TreeNode current = queue.remove();

                if(current.left != null) {
                    currentLevel.add(current.left);
                    list.add(current.left.val);
                }

                if(current.right != null) {
                    currentLevel.add(current.right);
                    list.add(current.right.val);
                }
            }

            if(list.size() > 0) {
                result.add(list);
            }

            queue = currentLevel;
        }

        return result;
    }

    public static void main(String args[]) {
        // Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7

        //for 3
         TreeNode topNode = new TreeNode(3);

         topNode.left = new TreeNode(9);
         topNode.right = new TreeNode(20);

         //for 20
         topNode.right.left = new TreeNode(15);
         topNode.right.right = new TreeNode(7);


        List<List<Integer>> valueList = BinaryTreeLevelOrderTraversal.levelOrder(topNode);

        for(List<Integer> lst : valueList) {

              for(Integer in : lst) {
                  System.out.println(in);
              }
        }







    }
}