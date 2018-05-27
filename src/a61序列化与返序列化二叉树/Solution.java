/**
 * 
 */
package a61序列化与返序列化二叉树;

import 结构.TreeNode;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月26日下午2:52:46
	@问题描述：
请实现两个函数，分别用来序列化和反序列化二叉树
	@算法思路：
//什么是序列化与返序列化：
 * 本题中将二叉树序列化为一个String输出，没有给定其中的顺序；
 * 返序列化将STring 再次构造成 二叉树；
 
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
		System.out.println(Serialize(n1));
		System.out.println(Serialize(Deserialize(Serialize(n1))));
	}

	static StringBuffer sb =new StringBuffer();
	static int i=0;
	static String Serialize(TreeNode root) {
		if(root==null) sb.append("#,");
		else{
			sb.append(root.val+",");
			Serialize(root.left);
			Serialize(root.right);
		}
		
		return sb.toString();
	}
	static TreeNode Deserialize(String str) {
	    
		String[]temp=str.split(",");
		TreeNode p=null;
		if(!temp[i].equals("#")){
			p=new TreeNode(Integer.valueOf(temp[i]));
			i++;
			p.left=Deserialize(str);
			p.right=Deserialize(str);
		}else
			i++;
		return p;
	}
}
























