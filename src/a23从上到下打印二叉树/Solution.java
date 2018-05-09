package a23从上到下打印二叉树;

import java.util.ArrayList;
import java.util.Arrays;

import 结构.TreeNode;

/*	@作者：yiwanxuehua
	@创建时间：2018年4月24日上午9:36:51
	@问题描述：
从上到下打印二叉树
	@算法思路：
*/
public class Solution {
	public static void main(String[] args) {
		TreeNode t1=new TreeNode(10);
		TreeNode t2=new TreeNode(1);
		TreeNode t3=new TreeNode(2);
		t1.left=t2;
		t1.right=t3;
		ArrayList<Integer> temp=PrintFromTopToBottom(t1);

		for (Integer i:temp){
			System.out.println(i);
		}
		
	}
	static public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list=new ArrayList();
		ArrayList<TreeNode> temp=new ArrayList();
		if(root==null) return list;
		temp.add(root);
		while(!temp.isEmpty()){
			TreeNode t=temp.remove(0);
			if(t.left!=null)
				temp.add(t.left);
            if(t.right!=null)
				temp.add(t.right);
			list.add(t.val);
		}
		return list;	
	}
}
