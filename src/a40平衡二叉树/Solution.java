/**
 * 
 */
package a40平衡二叉树;

import 结构.TreeNode;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月23日下午2:22:41
	@问题描述：
输入一棵二叉树，判断该二叉树是否是平衡二叉树。
	@算法思路：
方法：用a39中的方法，判断二叉树的深度,我们在每一个节点，判断其返回的左右子树的深度差的绝对值情况；
	并通过一个全局boolean变量
 */

public class Solution {
	static boolean isB=true;//全局变量记录；
	public static void main(String[] args) {
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		n1.left=n2;
		n2.left=n3;
		n3.left=n4;
		n4.left=n5;
		System.out.println(IsBalanced_Solution(n1));
	}
    static public boolean IsBalanced_Solution(TreeNode root) {
    	getCount(root);
    	return isB;
    }
    static int getCount(TreeNode root){
    	if(root==null||isB==false) return 0;//这里判断isB有助于减少时间；
    	int left=getCount(root.left);
    	int right=getCount(root.right);
    	
    	int dif=left-right;//判断左右子树差的情况；
    	if(dif>1||dif<(-1)) isB=false;;
    	
    	return (Math.max(left, right)+1);//返回深度；
    }
}
