package a27������������˫������;

import �ṹ.TreeNode;

/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��2������8:27:23

	@����������
	����һ�ö��������������ö���������ת����һ�������˫������
	Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��

	@�㷨˼·��
	1�����:�ö��������ݹ飬������ͨ�ĵݹ�˼�룬��Ҫ����һ�����һ���ڵ��rightָ�򱾲㣬��̫�ý����
	2��   ��1������������ȫ������head��pre��¼��ǰ�Ѿ��ı��˫���������β���Ľڵ㣻
		��2����������ÿһ�����ȴ�����������
		��3��������ڵ�root���ѵ���ڵ�pre��������ʵ��˫�����ӣ�
	

*/
public class Solution {
	TreeNode head=null;
	TreeNode pre=null;
	
    public TreeNode Convert(TreeNode root) {
    	if(root==null)return head;
    	
    	Convert(root.left);
    	
    	if(head==null){//head��û��ʱ������ͷ��㣻
    		head=pre=root;
    	}else{
    		pre.right=root;
    		root.left=pre;
    		pre=root;
    	}
    	Convert(root.right);
    	
    	return head;
    }

}
