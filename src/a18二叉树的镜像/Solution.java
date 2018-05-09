package a18二叉树的镜像;

import 结构.TreeNode;

/*	@作者：yiwanxuehua
	@创建时间：2018年4月19日下午9:08:25

	@问题描述：操作给定的二叉树，将其变换为源二叉树的镜像

	@算法思路：
		（1）从上到下，交换节点子左右子节点，那么后续所有的子节点也都交换了；
		（2）此时，在交换左右节点的剩下的子节点就好了。
		

*/
public class Solution {
	public void Mirror(TreeNode root){
		if(root==null) return;
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		Mirror(root.left);
		Mirror(root.right);
	}
}
