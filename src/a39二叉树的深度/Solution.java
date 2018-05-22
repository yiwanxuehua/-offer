/**
 * 
 */
package a39二叉树的深度;

import java.util.ArrayList;

import 结构.TreeNode;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月22日下午9:50:06
	@问题描述：
输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）
形成树的一条路径，最长路径的长度为树的深度。
	@算法思路：
方法一：递归的方法，最底层返回，每返回一层，深度+1；
方法二：循环的方式，类似于数的从上到下打印，其思路如下：
	1、list中不断添加从上到下从左到右的二叉树节点；
	2、我们用nextCount保存本层的节点数量，当list的出链元素从0到nextCount值时，
		那么认为一层打印结束，count归零，nextCount=list.size()；
	3、每一个出栈的节点，我们将其非null的左右子节点加入list。
	4、循环，直到list为null即可。
 */

public class Solution {

	public static void main(String[] args) {

	}
	
	static public int TreeDepth1(TreeNode root){
		if(root==null) return 0;
		
		int left=TreeDepth1(root.left);
		int right=TreeDepth1(root.right);
		return Math.max(left, right)+1;
	}
	
	static public int TreeDepth2(TreeNode root) {
	       if(root==null) return 0;
	        ArrayList <TreeNode> list=new ArrayList();
	        list.add(root);
	        int count=0;
	        int nextCount=1;
	        int deep=0;
	        while(!list.isEmpty()){
	            TreeNode node=list.remove(0);
	            count++;
	            if(node.left!=null)
	                list.add(node.left);
	            if(node.right!=null)
	                list.add(node.right);
	            if(count==nextCount){
	                deep++;
	                nextCount=list.size();
	                count=0;
	            }
	        }
	        return deep;
	}
}








