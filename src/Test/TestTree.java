package Test;/*
 *Description：xxx<br/>
 *Copyright(c),2021,SKY<br/>
 *This program is protected by copyrigth laws.<br/>
 *Date:2021年10月05日
 *@author SKY
 *@version:1.0
 */

import Tree.BianryTree;
import Tree.TreeNode;

public class TestTree {

    public static void main(String[] args) {

        BianryTree bt = new BianryTree();
        TreeNode root1 = new TreeNode(1);

        bt.setRoot(root1);

        TreeNode rootl = new TreeNode(2);
        TreeNode rootr = new TreeNode(3);

        root1.setLeftNode(rootl);
        root1.setRightNode(rootr);

//        rootl.setLeftNode(new TreeNode(4));
//        rootl.setRightNode(new TreeNode(5));
//
//        rootr.setRightNode(new TreeNode(6));
        //rootr.setRightNode(new TreeNode(7));

        root1.frontShow();

        BianryTree bt2 = new BianryTree();
        TreeNode root2 = new TreeNode(1);

        bt2.setRoot(root2);

        TreeNode rootl2 = new TreeNode(2);
        TreeNode rootr2 = new TreeNode(3);

        root2.setLeftNode(rootl2);
        root2.setRightNode(rootr2);

       // rootl.setLeftNode(new TreeNode(4));
       // rootl.setRightNode(new TreeNode(5));

       // rootr.setRightNode(new TreeNode(6));
        //rootr.setRightNode(new TreeNode(7));

        root2.frontShow();

        TreeNode t2 = new TreeNode(0);
        t2.mergeTrees(root1,root2).frontShow();


    }
}
