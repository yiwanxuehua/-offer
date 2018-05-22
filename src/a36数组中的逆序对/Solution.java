/**
 * 
 */
package a36数组中的逆序对;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月11日下午9:26:01
	@问题描述：
在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。
 即输出P%1000000007
	@算法思路：
 	（1）采用归并排序的思想，其中的每一次交换都需要记录交换次数count。
 	（2）需要注意的是count的计算，比如要合并[a,b,c]与[d,e,f]
 		1):两个数组已经排好序；
 		2):假设copy后第一位是d，位置是j=mid+1;当前i位置是0；
 		3):那么d的逆序对就是mid-i；
 */
public class Solution {
	static int count =0;
	public static void main(String[] args) {

		Solution s=new Solution();
		int []a={1,2,3,4,5,6,7,0};
		s.InversePairs(a);
		System.out.println(count);
	}
	private int InversePairs(int [] array) {
       int end=array.length-1;
       int []copy=new int[array.length];
       sort(array,copy,0,end);
       return count;
    }
	private void sort(int[]arr,int[]copy,int str,int end){
		if(str<end){
			int mid=(str+end)/2;
			sort(arr,copy,str,mid);
			sort(arr,copy,mid+1,end);
			merge(arr,copy,str,mid,end);
		}
	}
	private void merge(int[]arr,int[]copy,int str,int mid,int end){
		int i=str;
		int j=mid+1;
		int k=0;
		while(i<=mid&&j<=end){
			if(arr[i]<=arr[j]){
				copy[k++]=arr[i++];
			}else{
				count+=mid+1-i;   //注意数量
				copy[k++]=arr[j++];
				if(count>1000000007)
					count%=1000000007;
			}
		}
		while(i<=mid){
			
			copy[k++]=arr[i++];
		}
		while(j<=end){
			copy[k++]=arr[j++];
		}
		k=0;
		while(str<=end){
			arr[str++]=copy[k++];
		}
	}

}
