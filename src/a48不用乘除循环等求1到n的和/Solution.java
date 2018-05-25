/**
 * 
 */
package a48不用乘除循环等求1到n的和;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月24日下午2:45:01
	@问题描述：
求1+2+3+...+n，要求不能使用乘除法、for、while、if、
else、switch、case等关键字及条件判断语句（A?B:C）
	@算法思路：
题目不准用循环，循环的替代是递归，考虑递归行不行？一般的递归中使用if来判断终止条件，
但是不能用if，先看终止条件，我们一般会将条件设置为n=1或n=0时，那怎么样才能在n=0、1的时候
停止递归呢？想到逻辑操作，逻辑与或；
 
 */

public class Solution {
	public static void main(String[] args) {
		System.out.println(Sum_Solution(6));
	}
	static public int Sum_Solution(int n) {
		int sum=n;
		boolean b=(sum==0)||((sum+=Sum_Solution(n-1))>0);
//		boolean b=(sum>0)&&((sum+=Sum_Solution(n-1))>0);
		return sum;
	}

}
