package a25�������к�Ϊĳһֵ��·��;

import java.util.ArrayList;

import �ṹ.TreeNode;

/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��4��24������7:16:39

	@����������
	����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
	·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
	
	@�㷨˼·����ÿ�εݹ�һ�㣬�Ƚ�����ڵ����list�����۵�����0������Ҫ������ڵ�ɾ����
	1������ݹ飬������root����list��
	2������ﵽҶ�ӽ����Ŀ��Ϊ0�����list��res��listɾ�����root�ڵ㣬����res��������ѭ����
	3�����2���������ж�root.left��root.right,�мǺ��listɾ������root�ڵ㣻
	4����󷵻�res���ɣ�
*/
public class Solution {
	 ArrayList<ArrayList<Integer>> res=new ArrayList();//��Ž����
	 ArrayList<Integer> list=new ArrayList();//�����ʱ���飻
	 public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
	     
		 if(root==null) return res;
		 list.add(root.val);
		 target=target-root.val;
		 if(target==0&&root.left==null&&root.right==null){
			 res.add(new ArrayList(list));//�¿���һ��ArrayList����ڵ������
			 list.remove(list.size()-1);  
             return res;					//����֮ǰһ��Ҫɾ�����ؽڵ㣻
		 }
		 FindPath(root.left,target);
		 FindPath(root.right,target);
		 list.remove(list.size()-1);//�Ƴ�������ӽ�ȥ�ĵ㣻
		 return res;
	 }
}
