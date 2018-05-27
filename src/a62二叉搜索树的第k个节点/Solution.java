/**
 * 
 */
package a62二叉搜索树的第k个节点;

import 结构.TreeNode;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月26日下午3:31:55
	@问题描述：
给定一颗二叉搜索树，请找出其中的第k大的结点。
例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4
	@算法思路：
这个题有歧义：按节点数值大小的话，第三个节点应该是6；
	按照我们的理解写出的程序是方法一：
		先找右子树，再找根节点，再找左子树；
	方法二：按照从小到大，例子正确：
 
 */
public class Solution {
	
	public static void main(String[] args) {

		TreeNode n1=new TreeNode(8);
		TreeNode n2=new TreeNode(6);
		TreeNode n3=new TreeNode(10);
		TreeNode n4=new TreeNode(5);
		TreeNode n5=new TreeNode(7);
		TreeNode n6=new TreeNode(9);
		TreeNode n7=new TreeNode(11);
		n1.left=n2;n1.right=n3;
		n2.left=n4;n2.right=n5;
		n3.left=n6;n3.right=n7;
		System.out.println(KthNode1(n1,5).val);
	}
	static int i=0;
	static TreeNode res=null;
	//从大到小的顺序
	static TreeNode KthNode(TreeNode pRoot, int k){
		 
		 if(pRoot==null) return null;
		 
		 if(pRoot.right!=null){
			 KthNode(pRoot.right,k); 
		 }
		 if(++i==k) res=pRoot;
		 if(pRoot.left!=null){
			 KthNode(pRoot.left,k); 
		 }
		 return res;
	 }
	//从大到下更简单的写法：
	static TreeNode KthNode1(TreeNode pRoot, int k){
		 
		 if(pRoot==null) return null;
		 else{
			 KthNode1(pRoot.right,k); 
			 if(++i==k) res=pRoot;
			 KthNode1(pRoot.left,k);
		 }
		 return res;
	 }
	//从小到大的顺序
	static TreeNode KthNode2(TreeNode pRoot, int k){
		
		if(pRoot==null) return null;
		
		else{
			KthNode2(pRoot.left,k);
			if(++i==k) res=pRoot;
			KthNode2(pRoot.right,k);
		}
		return res;
	}
}































