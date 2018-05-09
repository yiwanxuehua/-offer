package a17�����ӽṹ;

import �ṹ.TreeNode;

/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��4��18������8:34:44

	@�����������������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��

	@�㷨˼·��
		1��if(root1.val==root2.val)	���ݹ��ж�root1��root2����һ�ڵ㣻
		2�����1���ж���false����ô�ж�root1.left��root2��
		3�����2���ж�Ҳ��false����ô�ж�root1.right��root2��

*/
public class Solution {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean istree=false;
        if(root1!=null&&root2!=null){
			if(root1.val==root2.val){
				istree=isTree(root1.left,root2.left)
						&&isTree(root1.right,root2.right);//��Ӧ1��������
			}
            if(istree==false){
                istree=HasSubtree(root1.left,root2)//��Ӧ2������
                    ||HasSubtree(root1.right,root2);//��Ӧ3������
            }
		}
        return istree;
	}
	private boolean isTree(TreeNode root1,TreeNode root2){
		if(root2==null)return true;			//�����2��ĩβ�ˣ�����ƥ�����
		else if(root1==null) return false;	//�����1��ĩβ�ˣ���ʱ2û��������ƥ��ʧ���ˣ�
		if(root1.val!=root2.val)			//������ǰ��1����2��ֵ��ͬ������ƥ��ʧ�ܣ�
			return false;
		return isTree(root1.left,root2.left)//������ǰ��ƥ��ɹ��ˣ�
				&&isTree(root1.right,root2.right);
	}
}
