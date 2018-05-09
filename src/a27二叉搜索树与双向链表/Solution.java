package a27二叉搜索树与双向链表;

import 结构.TreeNode;

/*	@作者：yiwanxuehua
	@创建时间：2018年5月2日下午8:27:23

	@问题描述：
	输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
	要求不能创建任何新的结点，只能调整树中结点指针的指向。

	@算法思路：
	1、如果:用二叉树，递归，若用普通的递归思想，需要将下一层最后一个节点的right指向本层，不太好解决；
	2、   （1）：假设两个全局属性head和pre记录当前已经改变成双向链表的最尾部的节点；
		（2）：这样在每一层中先处理左子树；
		（3）：本层节点root和已到达节点pre，很容易实现双向连接；
	

*/
public class Solution {
	TreeNode head=null;
	TreeNode pre=null;
	
    public TreeNode Convert(TreeNode root) {
    	if(root==null)return head;
    	
    	Convert(root.left);
    	
    	if(head==null){//head还没有时，保存头结点；
    		head=pre=root;
    	}else{
    		pre.right=root;
    		root.left=pre;
    		pre=root;
    	}
    	Convert(root.right);
    	
    	return head;
    }

}
