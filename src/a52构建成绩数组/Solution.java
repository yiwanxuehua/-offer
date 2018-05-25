/**
 * 
 */
package a52构建成绩数组;

import java.util.Arrays;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月24日下午7:06:38
	@问题描述：
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
	@算法思路：
	1、B[0]=A[1]*..*A[n-1]，没有A[0];
	2、B[2]=A[0]*A[1]*A[3]....，没有A[2];
	是不断累乘的结果；
	用pre数组保存i之前位置的累积；
	用end数组保存i之后位置的累积；
	最后一次循环，pre[i]*end[i]即可；
 */

public class Solution {
	public static void main(String[]args){
		int[]A={1,2,3,4,5};
		System.out.println(Arrays.toString(multiply(A)));
	}
	
	static public int[] multiply(int[] A) {
		int len=A.length;
		int[]pre=new int[A.length];
		pre[0]=1;
		int[]end=new int[A.length];
		end[len-1]=1;
		int[]B=new int[len];
		for(int i=1;i<len;i++){
			pre[i]=pre[i-1]*A[i-1];
			end[len-1-i]=end[len-i]*A[len-i];
		}
		for(int i=0;i<len;i++){
			B[i]=pre[i]*end[i];
		}
		return B;
    }
}
