package a18�������ľ���;

import �ṹ.TreeNode;

/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��4��19������9:08:25

	@�������������������Ķ�����������任ΪԴ�������ľ���

	@�㷨˼·��
		��1�����ϵ��£������ڵ��������ӽڵ㣬��ô�������е��ӽڵ�Ҳ�������ˣ�
		��2����ʱ���ڽ������ҽڵ��ʣ�µ��ӽڵ�ͺ��ˡ�
		

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
