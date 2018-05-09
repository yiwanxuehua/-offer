package a13顺序调整奇数在欧数前;

import java.util.Arrays;

/*	@作者：yiwanxuehua
	@创建时间：2018年4月17日下午9:03:54

	@问题描述：
		输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
		所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
	@算法思路：
		剑指上给的是不要求排序后保证相对位置：采用前后双指针方式即可解决；
		这里采用修改冒泡排序的方式：
		也可以采用一个新数组保存偶数值：
 
*/
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,5,4,6,3,7};
		reOrderArray(a);
		System.out.println(Arrays.toString(a));
	}
	static public void reOrderArray(int [] array) {
		if(array==null||array.length<=0) System.out.println("cuowu");
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-i-1;j++){
				if((array[j]&1)==0&&((array[j+1]&1)==1)){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

}
