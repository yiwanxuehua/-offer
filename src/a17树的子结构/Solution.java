package a17树的子结构;

import 结构.TreeNode;

/*	@作者：yiwanxuehua
	@创建时间：2018年4月18日下午8:34:44

	@问题描述：输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

	@算法思路：
		1、if(root1.val==root2.val)	，递归判断root1和root2的下一节点；
		2、如果1的判断是false，那么判断root1.left与root2；
		3、如果2的判断也是false，那么判断root1.right与root2；

*/
public class Solution {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean istree=false;
        if(root1!=null&&root2!=null){
			if(root1.val==root2.val){
				istree=isTree(root1.left,root2.left)
						&&isTree(root1.right,root2.right);//对应1的描述；
			}
            if(istree==false){
                istree=HasSubtree(root1.left,root2)//对应2描述；
                    ||HasSubtree(root1.right,root2);//对应3的描述
            }
		}
        return istree;
	}
	private boolean isTree(TreeNode root1,TreeNode root2){
		if(root2==null)return true;			//如果树2到末尾了，表明匹配完成
		else if(root1==null) return false;	//如果数1到末尾了，此时2没到，表明匹配失败了；
		if(root1.val!=root2.val)			//若果当前树1与树2的值不同，表明匹配失败；
			return false;
		return isTree(root1.left,root2.left)//表明当前层匹配成功了；
				&&isTree(root1.right,root2.right);
	}
}
