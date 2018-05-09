package a24二叉树的后序遍历;
/*	@作者：yiwanxuehua
	@创建时间：2018年4月24日上午10:20:55
	@问题描述：
输入一个整数数组，判断该数组是不是某 二叉搜索树 的后序遍历的结果。
	@算法思路：
	对于二叉搜索树，尤其定义可知其是一个重复递归的过程。
		//1、数组最后一个值，一定是root节点。
        //2、root节点向前第一个小于root点的节点j就是root的左节点（这个点有可能是null）
        //3、然后我们检查从str到j，如果有节点>root的话，return false；
        //4、若没有，表示当前层可以构成二叉子树，
         *5、（str,j）(j+1,end)进行递归，那么终止条件也就清晰了if(str>=end)return true；

*/
public class Solution {
	public static void main(String[]args){
		int[]a={3,8,5,12,16,15,10};
		int[]b={3,8,5,12,15,16,10,};
		int []c={5,4,3,2,1};
//		System.out.println(VerifySquenceOfBST(a));
		System.out.println(VerifySquenceOfBST(c));

	}
	static public boolean VerifySquenceOfBST(int [] seq) {
		if(seq==null||seq.length<=0) return false;
		int end=seq.length-1;
		int str=0;
		return isBST(seq,str,end);
	}
	private static boolean isBST(int[]seq,int str,int end){
		if(str>=end) return true;
		int j=end;
		while(j>str&&seq[j]>=seq[end]){//j代表找到了第一个小于root的点；
			j--;
		}
		for(int i=str;i<j;i++){//j点肯定小鱼
			if(seq[i]>seq[end])
				return false;
		}						//到此可以判断本层二叉搜索树条件满足；
		return isBST(seq,str,j)&&isBST(seq,j+1,end-1);
	}
}
