/**
 * 
 */
package a57B二叉树的下一个节点;
import java.util.ArrayList;
import 结构.TreeLinkNode;
/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月25日下午7:40:41
	@问题描述：
给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
	@算法思路：
	1、我们可以分为以下几种情况：
		1：是根节点，且只有一个点；
		2：有右孩子：返回右孩子的左孩子的左...；
		3：是左孩子：返回父节点；
		4：是右孩子且是叶子节点：
			找到父亲是爷爷左孩子的父亲节点，返回父亲的父节点；
	2、我们可以将1,3,4合成一个，都是返回父节点；		
 */

public class Solution {
	public static void main(String[] args) {
	}
	static public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
		if(pNode==null) return pNode;
        //如果该节点有右子树；
		if(pNode.right!=null){
			pNode=pNode.right;
			while(pNode.left!=null)
				pNode=pNode.left;
			return pNode;
		}
		//假设该节点是父节点的右孩子：
		while(pNode.next!=null&&pNode.next.right==pNode)
			pNode=pNode.next;
			//循环结束时，pNode.next是要返回的点；
		//包含了到此所有的情况
		return pNode.next;
    }

}
