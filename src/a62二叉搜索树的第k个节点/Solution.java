/**
 * 
 */
package a62�����������ĵ�k���ڵ�;

import �ṹ.TreeNode;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��26������3:31:55
	@����������
����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣
���磬 5 / \ 3 7 /\ /\ 2 4 6 8 �У��������ֵ��С˳�����������ֵΪ4
	@�㷨˼·��
����������壺���ڵ���ֵ��С�Ļ����������ڵ�Ӧ����6��
	�������ǵ����д���ĳ����Ƿ���һ��
		���������������Ҹ��ڵ㣬������������
	�����������մ�С����������ȷ��
 
 */
public class Solution {
	
	public static void main(String[] args) {

		TreeNode n1=new TreeNode(8);
		TreeNode n2=new TreeNode(6);
		TreeNode n3=new TreeNode(10);
		TreeNode n4=new TreeNode(5);
		TreeNode n5=new TreeNode(7);
		TreeNode n6=new TreeNode(9);
		TreeNode n7=new TreeNode(11);
		n1.left=n2;n1.right=n3;
		n2.left=n4;n2.right=n5;
		n3.left=n6;n3.right=n7;
		System.out.println(KthNode1(n1,5).val);
	}
	static int i=0;
	static TreeNode res=null;
	//�Ӵ�С��˳��
	static TreeNode KthNode(TreeNode pRoot, int k){
		 
		 if(pRoot==null) return null;
		 
		 if(pRoot.right!=null){
			 KthNode(pRoot.right,k); 
		 }
		 if(++i==k) res=pRoot;
		 if(pRoot.left!=null){
			 KthNode(pRoot.left,k); 
		 }
		 return res;
	 }
	//�Ӵ��¸��򵥵�д����
	static TreeNode KthNode1(TreeNode pRoot, int k){
		 
		 if(pRoot==null) return null;
		 else{
			 KthNode1(pRoot.right,k); 
			 if(++i==k) res=pRoot;
			 KthNode1(pRoot.left,k);
		 }
		 return res;
	 }
	//��С�����˳��
	static TreeNode KthNode2(TreeNode pRoot, int k){
		
		if(pRoot==null) return null;
		
		else{
			KthNode2(pRoot.left,k);
			if(++i==k) res=pRoot;
			KthNode2(pRoot.right,k);
		}
		return res;
	}
}































