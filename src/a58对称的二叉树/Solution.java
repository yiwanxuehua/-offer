/**
 * 
 */
package a58�ԳƵĶ�����;

import java.util.ArrayList;

import �ṹ.TreeNode;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��25������8:21:37
	@����������
��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�
ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
	@�㷨˼·��
����һ��ʹ��ѭ����list����Ԫ���й��ɣ�����a��b��
		1�����a��b����null��������
		2��a=b��res���棬a����b���ң�a���ң�b����
		3������ͷ���false��

��������ʹ�õݹ飺��ΪҪ�ж��������Ƿ���ȣ����������������һ��������ʵ�֣�
		˼·����
 */

public class Solution {
	public static void main(String[] args) {

	} 
	
	static ArrayList<TreeNode> res=new ArrayList();
	static boolean isSymmetrical1(TreeNode p)
    {
		//���������жϸ��ڵ�����ҽڵ���������װ��res�У�
		if(p==null) return true;
		if(p.left==null&&p.right==null) return true;
		if(p.left!=null&&p.right!=null){
			res.add(p.left);
    		res.add(p.right);
		}else return false;
		//�ʼʱ��res�а��������ڵ㣻	
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
	//�ݹ鷽����
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

























