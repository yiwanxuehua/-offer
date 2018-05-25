/**
 * 
 */
package a59֮���δ�ӡ������;

import java.util.ArrayList;

import �ṹ.TreeNode;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��25������9:37:10
	@����������
��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ��
�ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�
	@�㷨˼·��
	1������list�ֱ�洢������ż���У�
	2��ע���ӡ���һ��ʱ����ʱ����temp������ж��Ƿ�Ϊ�գ�����ӡһ��null��
	3��res��addһ��Ҫ��new ArrayList���棬����temp��clear��������ݣ�
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
		
		ArrayList<TreeNode> list1=new ArrayList();//������
		ArrayList<TreeNode> list2=new ArrayList();//ż����
		
		if(pRoot==null) return res;
		list1.add(pRoot);
		
		while(!list1.isEmpty()||!list2.isEmpty()){
			ArrayList<Integer> temp=new ArrayList();//��������ڵ����ֵ��
			while(!list1.isEmpty()){
				TreeNode p=list1.remove(0);//�������ͷȡ��
				if(p.left!=null){
					list2.add(p.left);
				}
				if(p.right!=null){
					list2.add(p.right);
				}
				temp.add(p.val);
			}
			if(!temp.isEmpty()){//ע���������Ҫ�жϣ���ֹ��tempΪnullʱ��res�����nullԪ�أ�
				res.add(new ArrayList(temp));
				temp.clear();
			}
			
			while(!list2.isEmpty()){
				TreeNode p=list2.remove(0);//Ҳ�Ǵ�ͷȡ��Ϊ��ά��list1��˳��
				if(p.left!=null)
					list1.add(p.left);
				if(p.right!=null)
					list1.add(p.right);
				temp.add(0, p.val);
			}
			if(!temp.isEmpty()){//ע���������Ҫ�жϣ���ֹ��tempΪnullʱ��res�����nullԪ�أ�
				res.add(new ArrayList(temp));
				temp.clear();
			}
		}
		return res;
    }

}
