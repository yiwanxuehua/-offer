/**
 * 
 */
package a34丑数;

import java.util.ArrayList;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月9日下午8:50:49
	@问题描述：
把只包含因子2、3和5的数称作丑数，我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
例如6、8都是丑数，但14不是，因为它包含因子7；
	@算法思路：
	(1):用数组保存
	(2):定义三个指针，分别指向三个位置；
	(3):三个位置分别是：用于乘2的最小的数、用于乘3的最小的数，用于乘5的最小的数；
	(4):注意，有时候可能出现类似a==b的情况，那么i与j都进行加1操作。
 
 */
public class Solution {

	public static void main(String[] args) {
		
		int temp=GetUglyNumber_Solution(10);
		System.out.println(temp);
	}
	private static int GetUglyNumber_Solution(int index) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		int i,j,k;
		i=j=k=0;
		while(list.size()<index){
			int a=list.get(i)*2;
			int b=list.get(j)*3;
			int c=list.get(k)*5;
			int min=Math.min(a, Math.min(c, b));
			list.add(min);
			if(min==a) 
				{i++;}//不能加continue；
			if(min==b) 
				{j++;}
			if(min==c) 
				{k++;}
		}
		return list.get(index-1);
	 }

}
