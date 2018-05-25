/**
 * 
 */
package a59之字形打印二叉树;

import java.util.ArrayList;

import 结构.TreeNode;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月25日下午9:37:10
	@问题描述：
请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
	@算法思路：
	1、两个list分别存储奇数与偶数行；
	2、注意打印最后一行时，临时数组temp如果不判断是否为空，会多打印一行null；
	3、res的add一定要用new ArrayList保存，否则temp的clear会清除数据；
 */

public class Solution {
	public static void main(String[] args) {
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
	
	static public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		
		ArrayList<ArrayList<Integer> > res=new ArrayList<>();
		
		ArrayList<TreeNode> list1=new ArrayList();//奇数层
		ArrayList<TreeNode> list2=new ArrayList();//偶数层
		
		if(pRoot==null) return res;
		list1.add(pRoot);
		
		while(!list1.isEmpty()||!list2.isEmpty()){
			ArrayList<Integer> temp=new ArrayList();//用来保存节点的数值；
			while(!list1.isEmpty()){
				TreeNode p=list1.remove(0);//奇数层从头取；
				if(p.left!=null){
					list2.add(p.left);
				}
				if(p.right!=null){
					list2.add(p.right);
				}
				temp.add(p.val);
			}
			if(!temp.isEmpty()){//注意这里必须要判断，防止当temp为null时，res中添加null元素；
				res.add(new ArrayList(temp));
				temp.clear();
			}
			
			while(!list2.isEmpty()){
				TreeNode p=list2.remove(0);//也是从头取，为了维护list1的顺序；
				if(p.left!=null)
					list1.add(p.left);
				if(p.right!=null)
					list1.add(p.right);
				temp.add(0, p.val);
			}
			if(!temp.isEmpty()){//注意这里必须要判断，防止当temp为null时，res中添加null元素；
				res.add(new ArrayList(temp));
				temp.clear();
			}
		}
		return res;
    }

}
