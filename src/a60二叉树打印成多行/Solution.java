/**
 * 
 */
package a60��������ӡ�ɶ���;

import java.util.ArrayList;

import �ṹ.TreeNode;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��25������10:29:43
	@����������
���ϵ��°����ӡ��������ͬһ����������������ÿһ�����һ�С�
	@�㷨˼·��
 ��������һ����˼�뵫û�б�Ҫ������ż�����ˣ�
 	1��temp������ֵ��list����ڵ㣻
 	2����ÿһ����count��¼�ܸ�����curnum��¼��ǰ��ѭ�����ڼ����ڵ㣻
 	3����ô��count==curnumʱ����ǰ���ӡ����ˣ�
 */

public class Solution {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
		//res�����ܽ����list����ڵ㣬temp���浱ǰ��Ľڵ����ֵ��
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
