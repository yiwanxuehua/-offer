/**
 * 
 */
package a40ƽ�������;

import �ṹ.TreeNode;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��23������2:22:41
	@����������
����һ�ö��������жϸö������Ƿ���ƽ���������
	@�㷨˼·��
��������a39�еķ������ж϶����������,������ÿһ���ڵ㣬�ж��䷵�ص�������������Ȳ�ľ���ֵ�����
	��ͨ��һ��ȫ��boolean����
 */

public class Solution {
	static boolean isB=true;//ȫ�ֱ�����¼��
	public static void main(String[] args) {
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		n1.left=n2;
		n2.left=n3;
		n3.left=n4;
		n4.left=n5;
		System.out.println(IsBalanced_Solution(n1));
	}
    static public boolean IsBalanced_Solution(TreeNode root) {
    	getCount(root);
    	return isB;
    }
    static int getCount(TreeNode root){
    	if(root==null||isB==false) return 0;//�����ж�isB�����ڼ���ʱ�䣻
    	int left=getCount(root.left);
    	int right=getCount(root.right);
    	
    	int dif=left-right;//�ж�����������������
    	if(dif>1||dif<(-1)) isB=false;;
    	
    	return (Math.max(left, right)+1);//������ȣ�
    }
}
