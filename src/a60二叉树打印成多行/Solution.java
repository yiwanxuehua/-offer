/**
 * 
 */
package a60二叉树打印成多行;

import java.util.ArrayList;

import 结构.TreeNode;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月25日下午10:29:43
	@问题描述：
从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
	@算法思路：
 可以用上一个的思想但没有必要分奇数偶数层了：
 	1、temp保存数值，list保存节点；
 	2、对每一层用count记录总个数，curnum记录当前层循环到第几个节点；
 	3、那么当count==curnum时代表当前层打印完毕了；
 */

public class Solution {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		System.out.println(Print(n1));;
	}
	static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		//res保存总结过，list保存节点，temp保存当前层的节点的数值；
		ArrayList<ArrayList<Integer> > res=new ArrayList<>();
		ArrayList<TreeNode> list=new ArrayList();
		ArrayList<Integer> temp=new ArrayList();
		
		if(pRoot==null) return res;
		list.add(pRoot);
		int count=1;
		int curnum=0;
		
		while(!list.isEmpty()){
			TreeNode p=list.remove(0);
			curnum++;
			if(p.left!=null)
				list.add(p.left);
			if(p.right!=null)
				list.add(p.right);
			temp.add(p.val);
			if(curnum==count){
				res.add(new ArrayList(temp));
				temp.clear();
				count=list.size();
				curnum=0;
			}
		}
		return res;
	}
}
