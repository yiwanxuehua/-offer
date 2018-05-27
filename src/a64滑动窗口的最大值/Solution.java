/**
 * 
 */
package a64滑动窗口的最大值;

import java.util.ArrayList;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月27日下午2:41:43
	@问题描述：
	给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
	例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
他们的最大值分别为{4,4,6,6,6,5}；
 	针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
{[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， 
{2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
	@算法思路：
	1、首先进行冗余度：
		num可能是null；num的大小可能<=0；num的lenght可能小于size； 那样直接返回null就好；
	2、每滑动一次，就要对当前窗口中的所有值求最大。
	3、用i记录窗口的右侧，j记录窗口的左侧。用单独函数求左侧到右侧的最大值；
 
 注：用i和j标记窗口的临界。i每次+1；j也对应+1；比较最大值与窗口丢弃与新加入的值的大小；
 这样更新最大值是不可行的，因为数组内元素没有顺序，必须要全部比较；有可能存在两个最大值相等
 
 */

public class Solution {

	public static void main(String[] args) {
		int[]num={2,3,4,2,6,2,5,1};
		System.out.println((maxInWindows(num,3).toString()));
	}
	
	static public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res=new ArrayList<>();
        
        if(num==null) return null;
        int len=num.length;
        if(len<size||size<=0) return res;
        int maxnum=0;
        int i=size-1;
        int j=0;
        while(i<len){
        	int temp=getMaxNum(num,j,i);
        	res.add(temp);
        	i++;
        	j++;
        }
		return res;
    }
	static int getMaxNum(int[]num,int j,int i){
		int temp=0;
		for(;j<=i;j++){
			if(num[j]>temp)
				temp=num[j];
		}
		return temp;
	}

}
