package a04�ؽ�����������ǰ�����;
/*
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ�� * �ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}��
 * ���ؽ������������ء�
 * 
 * 
 * ˼·��
 * 1�����õݹ飬ǰ�������һ����a��������������ҵ�a��
 *:2���õ���ǰ�Ĳ���Ϊ���������Ժ�Ĳ���Ϊ��������
 * 3��ֱ��ÿ��ݹ����ʼ��==��β�㣻
 * */

import �ṹ.TreeNode;

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
    	//��in���ҵ�pre�еĵ�һ���㣻
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