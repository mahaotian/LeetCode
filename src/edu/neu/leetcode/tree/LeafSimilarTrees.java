package edu.neu.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafSequence1 = new ArrayList<>();
        List<Integer> leafSequence2 = new ArrayList<>();
        findLeafSequence(root1, leafSequence1);
        findLeafSequence(root2, leafSequence2);
        if (leafSequence1.size()!=leafSequence2.size())
            return false;
        for (int i =0;i<leafSequence1.size();i++) {
            if (leafSequence1.get(i)!=leafSequence2.get(i))
                return false;
        }
        return true;

    }

    private static void findLeafSequence(TreeNode treeNode, List<Integer> leafSequence) {
        if (treeNode == null)
            return;
        if (treeNode.left == null && treeNode.right == null)
            leafSequence.add(treeNode.val);
        else {
            findLeafSequence(treeNode.left, leafSequence);
            findLeafSequence(treeNode.right, leafSequence);
        }
    }
}
