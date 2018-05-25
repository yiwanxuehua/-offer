/**
 * 
 */
package a47圆圈中剩下的最后的数;

import java.util.ArrayList;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月24日上午10:41:17
	@问题描述：
0-n-1的n个数，随机说一个数m，o-n-1循环报数，报到n-1的人出对，下一个从0
接着报，知道剩下一个人；
	@算法思路：
	1、第一次位置好找，（m-1）%n，比如说在i处：解释为向对于0位置的偏移量；
	2、利用list模仿出队列的过程。
	3、主要在于要删除的下一个位置；
		从当前的删除位置i计：下一个位置在i+（m-1）%（list.size())处；
 */

public class Solution {
	public static void main(String[] args) {
	}
	public int LastRemaining_Solution(int n, int m) {
	 if(n<1||m<0) return 0;
	 ArrayList<Integer> list=new ArrayList<>();
	 for(int i=0;i<n;i++)
		 list.add(i);
	 int deletepoint=(m-1)%n;
	 while(list.size()>1){
		 list.remove(deletepoint);
		 deletepoint=(deletepoint+(m-1)%(list.size()));
	 }
	 return list.get(0);
	}
}
