package a31连续子数组的最大和;
/**
 * 
  	@作者：yiwanxuehua
	@创建时间：2018年5月8日下午9:06:44
	@问题描述：
{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)
	@算法思路：
	(1):maxInt保存最大值，res为不断累加的和，当res<0时，res=0重新开始；
 */
public class Solution {

	public static void main(String[] args) {
		int[]arr={6,-3,-2,7,-15,1,2,2};
		System.out.println(Find(arr));
	}
	
	public static int Find(int[] arr) {
		if(arr.length<=0) throw new RuntimeException("数组有误");
		int maxInt=arr[0];
		int res=0;
		for(int i=0;i<arr.length;i++){
			res=res+arr[i];
			maxInt=Math.max(res, maxInt);
			if(res<0)
				res=0;
		}
		return maxInt;
	}

}
