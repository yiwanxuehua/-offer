/**
 * 
 */
package a51数组中第一个重复的数字;

import java.util.Arrays;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月24日下午6:39:53
	@问题描述：
在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 
例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，
那么对应的输出是第一个重复的数字2。
	@算法思路：
	1、就是输出数组中的第一个重复的数字；
	2、采用标记数组的方式，每一次将标记数组对应位置设置为TRUE；
	3、如果有重复的数字，我们会再次访问到这个位置，此时检测到这个位置是true；
	4、那么这个位置的对应的数组的元素就是第一个重复的数字；
注：如果要输出每一个重复的数字，那么去掉return，然后duplication的下标设置为增长的即可；
 
 */

public class Solution {
	public static void main(String[]args){
		int[]num={1,2,3,4,2,5,3,4};
		int[] res=new int[1];
		System.out.println(duplicate(num,num.length,res));
	}
	
	static public boolean duplicate(int[]numbers,int length,int[]duplication){
		boolean[]flag=new boolean[length];
		for(int i=0;i<length;i++){
			if(flag[numbers[i]]==true){
				duplication[0]=numbers[i];
				System.out.println(duplication[0]);
				return true;
			}else{
				flag[numbers[i]]=true;
			}
		}
		System.out.println(duplication[0]);
		return false;
		
	}

}
