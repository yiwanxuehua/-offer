/**
 * 
 */
package a42和为S的连续正数序列;

import java.util.ArrayList;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月23日下午3:51:55
	@问题描述：
输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
	@算法思路：
采用类似于队列的思想，判断队列中元素的和：小于，头上加新元素；大于，尾部减旧元素；
 */
public class Solution {
	public static void main(String[] args) {
		FindContinuousSequence(100000000);
	}
	static public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList <ArrayList<Integer>> result=new ArrayList<>();
		if(sum<3) return null;
		
		int str=1;//尾部
		int end=2;//头部
		int res=3;
		int fin=sum/2+1;
		while(end<=fin){
			if(res<sum){
				end+=1;
				res+=end;
			}
			if(res>sum){
				res-=str;
				str+=1;
			}
			if(res==sum){
				ArrayList<Integer> list=new ArrayList<>();
				for(int i=str;i<=end;i++){
					list.add(i);
				}
				result.add(list);
				
				end++;//继续向后寻找；
				res+=end;
			}
		}
		for(ArrayList l:result){
			System.out.println(l.toString());
		}
		return result;
	}
}





























