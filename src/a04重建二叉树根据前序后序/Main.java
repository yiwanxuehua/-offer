package a04重建二叉树根据前序后序;
/*
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果 * 中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 * 
 * 
 * 思路：
 * 1：采用递归，前序遍历第一个点a，在中序遍历中找到a，
 *:2：该点以前的部分为左子树，以后的部分为右子树；
 * 3：直到每层递归的起始点==结尾点；
 * */

import 结构.TreeNode;

public class Main {
	public static void main(String[]args){
		int []pre={1,2,3,4,5,6};
		int []in={4,2,1,5,3,6};
		TreeNode root=reConstructBinaryTree(pre,in);
	}
    static public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        
    	if(pre==null||pre.length<=0||in==null||in.length<=0) return null;
    	
    	TreeNode root=reConstruct(0,pre.length-1,pre,0,in.length-1,in);
    	
    	return root;
    }
    
    static private TreeNode reConstruct(int strPre,int endPre,int[]pre,int strIn,int endIn,int[]in){
    	if(strPre>endPre||strIn>endIn) return null;
    	//在in中找到pre中的第一个点；
    	TreeNode root=new TreeNode(pre[strPre]);
    	for(int i=0;i<=endIn;i++){
    		if(pre[strPre]==in[i]){
    			root.left=reConstruct(strPre+1,strPre+i-strIn,pre,strIn,i-1,in);
    			root.right=reConstruct(strPre+i-strIn+1,endPre,pre,i+1,endIn,in);
    		}
    	}
    	return root;
    }
}