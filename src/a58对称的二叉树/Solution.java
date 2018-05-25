/**
 * 
 */
package a58对称的二叉树;

import java.util.ArrayList;

import 结构.TreeNode;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月25日下午8:21:37
	@问题描述：
请实现一个函数，用来判断一颗二叉树是不是对称的。
注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
	@算法思路：
方法一：使用循环，list保存元素有规律，比如a和b，
		1、如果a和b都是null，继续；
		2、a=b，res保存，a的左，b的右，a的右，b的左；
		3、否则就返回false；

方法二：使用递归：因为要判断两个数是否相等，所以我们最好新增一个方法区实现：
		思路不难
 */

public class Solution {
	public static void main(String[] args) {

	} 
	
	static ArrayList<TreeNode> res=new ArrayList();
	static boolean isSymmetrical1(TreeNode p)
    {
		//首先我们判断根节点的左右节点的情况，并装进res中；
		if(p==null) return true;
		if(p.left==null&&p.right==null) return true;
		if(p.left!=null&&p.right!=null){
			res.add(p.left);
    		res.add(p.right);
		}else return false;
		//最开始时，res中包含两个节点；	
		while(res.size()!=0){
			TreeNode left=res.remove(0);
			TreeNode right=res.remove(0);
			if(left==null&&right==null) continue;
			if(left!=null&&right!=null&&left.val==right.val){
				res.add(left.left);
				res.add(right.right);
				res.add(left.right);
				res.add(right.left);
			}else{
				return false;
			}
		}
		return true;
    }
	//递归方法：
	static boolean isSymmetrical2(TreeNode p){
		
		if(p==null) return true;
		else{
			return isMirror(p.left,p.right);
		}
	}
	
	static boolean isMirror(TreeNode left,TreeNode right){
		
		if(left==null&&right==null) return true;
		if(left!=null&&right!=null&&left.val==right.val){
			return isMirror(left.left,right.right)
					&&isMirror(left.right,right.left);
		}else return false;
	}
}

























