/**
 * 
 */
package a39�����������;

import java.util.ArrayList;

import �ṹ.TreeNode;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��22������9:50:06
	@����������
����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩
�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
	@�㷨˼·��
����һ���ݹ�ķ�������ײ㷵�أ�ÿ����һ�㣬���+1��
��������ѭ���ķ�ʽ�����������Ĵ��ϵ��´�ӡ����˼·���£�
	1��list�в�����Ӵ��ϵ��´����ҵĶ������ڵ㣻
	2��������nextCount���汾��Ľڵ���������list�ĳ���Ԫ�ش�0��nextCountֵʱ��
		��ô��Ϊһ���ӡ������count���㣬nextCount=list.size()��
	3��ÿһ����ջ�Ľڵ㣬���ǽ����null�������ӽڵ����list��
	4��ѭ����ֱ��listΪnull���ɡ�
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








