/**
 * 
 */
package a00回溯法方法中传入标记问题;

import java.util.Arrays;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月27日下午9:03:43
	@问题描述：
在回溯法当中，当递归的参数中传入标记时，如果在下一层递归修改了标记，那么在递归返回时，该层的标记到底是什么状态？有没有被修改？

	@算法思路：
我人为这个标记时没有被修改的，在当前层；
 
 */

public class Solution {
	
	public static void main(String[] args) {
		 int[]flag=new int[5];
		 int[]num={1,2,3,4,5};
		get(num,flag,0);
		System.out.println(Arrays.toString(flag));
	}
	
	static public void get(int[]num,int[]flag,int i){
		if(i>num.length-1) return;
		if(num[i]==2){
			flag[i]++;
		}
		get(num,flag,++i);
	}

}
