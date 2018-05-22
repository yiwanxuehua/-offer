/**
 * 
 */
package a38数字在排序数组中出现的次数;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月22日下午8:34:25
	@问题描述：
统计一个数字在排序数组中出现的次数。
	@算法思路：
方法一：遍历一遍，找到k后计数即可；
方法二：看到排序就想到二分查找；
	1、我们利用（str+end)/2找到中点，判断该点是不是k点；
	2、是直接返回该点位置；在其前后找即可；
	3、若小于，那么在k之前位置找；若大于在k之后位置找；
方法三：还是利用二分查找，我们能不能找到第一个k的位置和最后一个k的位置；
	1、二分查找时，还是之前的策略，但是当我们找到的mid点==k时；
	2、如过向前一位还是k，那么end=mid-1，这样找的是起始k点；
	3、如过向后一位还是k，那么str=mid+1，这样找到的是终结k点；
 */
public class Solution {

	public static void main(String[] args) {
		int []arr={1,2,3,3,3,3,3,3,4,4,4,4,5,5,6};
		System.out.println(GetNumberOfK(arr,4));
	}
	public static int GetNumberOfK(int [] array , int k) {
		
		int end=array.length;
		int firstK=getFirstMid(array,0,end,k);
		int lastK=getLastMid(array,0,end,k);
		
		System.out.println(firstK);
		System.out.println(lastK);
		
		int res=lastK-firstK+1;
		return res>=0?res:0;
		
	}
	
	static int getFirstMid(int[]array,int str,int end,int k ){
		if(str==end) return str;
		while(str<=end){
			int mid=(str+end)/2;
			if(k<array[mid]){
				end=mid-1;
			}
			else if(k>array[mid]){
				str=mid+1;
			}
			else if(mid-1>=str&&array[mid-1]==k) {
					end=mid-1;
			}else 
				return mid;
		}
		return -1;
	}
	
	static int getLastMid(int[]array,int str,int end,int k ){
		if(str==end) return str;
		while(str<=end){
			int mid=(str+end)/2;
			if(k<array[mid]){
				end=mid-1;
			}
			else if(k>array[mid]){
				str=mid+1;
			}
			else if(mid-1>=str&&array[mid+1]==k) {
					str=mid+1;
			}else 
				return mid;
		}
		return -1;
	}

}





















