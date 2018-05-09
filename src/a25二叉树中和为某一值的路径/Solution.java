package a25二叉树中和为某一值的路径;

import java.util.ArrayList;

import 结构.TreeNode;

/*	@作者：yiwanxuehua
	@创建时间：2018年4月24日下午7:16:39

	@问题描述：
	输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
	路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
	
	@算法思路：，每次递归一层，先将本层节点加入list，无论到不到0，都需要将本层节点删除；
	1、本层递归，将本层root加入list；
	2、如果达到叶子结点且目标为0，添加list到res，list删除这个root节点，返回res结束本层循环；
	3、如果2不成立，判断root.left和root.right,切记后跟list删除本层root节点；
	4、最后返回res即可；
*/
public class Solution {
	 ArrayList<ArrayList<Integer>> res=new ArrayList();//存放结果；
	 ArrayList<Integer> list=new ArrayList();//存放临时数组；
	 public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
	     
		 if(root==null) return res;
		 list.add(root.val);
		 target=target-root.val;
		 if(target==0&&root.left==null&&root.right==null){
			 res.add(new ArrayList(list));//新开辟一个ArrayList保存节点情况；
			 list.remove(list.size()-1);  
             return res;					//返回之前一定要删除本地节点；
		 }
		 FindPath(root.left,target);
		 FindPath(root.right,target);
		 list.remove(list.size()-1);//移除本层添加进去的点；
		 return res;
	 }
}
