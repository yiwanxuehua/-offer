/**
 * 
 */
package a61���л��뷵���л�������;

import �ṹ.TreeNode;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��26������2:52:46
	@����������
��ʵ�������������ֱ��������л��ͷ����л�������
	@�㷨˼·��
//ʲô�����л��뷵���л���
 * �����н����������л�Ϊһ��String�����û�и������е�˳��
 * �����л���STring �ٴι���� ��������
 
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
























