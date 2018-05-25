/**
 * 
 */
package a46扑克牌顺子;

import java.util.Arrays;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月24日上午10:12:31
	@问题描述：

	@算法思路：
	1、首先要排序；
	2、判断0的个数；
	循环中结构：
	{
		if(当前是0){
			0的个数+1；
			继续；
		}否则{
			if（当前和下一个位置数相等）返回false；
			差值+=下一个位置数-当前位置数-1；
		}
		if(差值>0的个数) 返回false；
	}
 */

public class Solution {
	public static void main(String[] args) {
		int[]a={0,0,2,5,6,7,9};
		System.out.println(isContinuous(a));
	}
	
	static public boolean isContinuous(int [] num) {
		if(num==null||num.length<=0) return false;
		int count0=0;	//记录0的个数；
		int cha=0;		//记录差值；
		
		Arrays.sort(num);//先排序；
		for(int i=0;i<num.length-1;i++){
			if(num[i]==0){
				count0++;
				continue;
			}
			else{
				if(num[i]==num[i+1]) return false;
				cha+=num[i+1]-num[i]-1;
			}
			if(cha>count0) return false;
		}
		return true;
    }

}
