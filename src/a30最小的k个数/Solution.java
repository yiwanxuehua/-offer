package a30最小的k个数;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

/*	@作者：yiwanxuehua
	@创建时间：2018年5月3日下午8:38:42

	@问题描述：
输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，
则最小的4个数字是1,2,3,4,。

	@算法思路：
(法一)构建k个元素的最大堆，对剩余元素，如果小于堆顶，则交换，重新调整堆，最后堆内就是剩余最小k个元素了；
(法二)通过PriorityQueue排序队列实现，其内部是基于最小堆实现的，堆顶存放最小元素。
我们将其调整为大小为k的，堆顶存放最大元素的优先队列，这样，一次循环就能解决问题；

*/
public class Solution {

	static ArrayList<Integer> res=new ArrayList<>();
	public static void main(String[] args) {
		int[]a={4,5,1,6,2,7,3,8,9,0};
		GetLeastNumbers_Solution2(a,4);
		System.out.println(Arrays.toString(res.toArray()));
	}
	
	private static  ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

		for(int i=(k-1)/2;i>=0;i--){
			HeapSort(input,i,k-1);
		}
		for(int i=k;i<input.length;i++){
			if(input[i]<input[0]){
				swap(input,0,i);
				HeapSort(input,0,k-1);
			}
		}
		for(int i=0;i<k;i++){
			res.add(input[i]);
		}
		return res;
	}
	private static void HeapSort(int[]input,int str,int end){
		int temp=input[str];
		for(int i=2*str+1;i<=end;i=i*2+1){
			if(i<end&&input[i+1]>input[i])
				i++;
			if(temp>=input[i])
				break;
			input[str]=input[i];
			str=i;
		}
		input[str]=temp;
	}
	private static void swap(int[]input,int i,int j){
		input[i]=input[i]^input[j];
		input[j]=input[i]^input[j];
		input[i]=input[i]^input[j];
	}
	
	//基于priorityqueue实现的，（内部堆）
	
	private static  ArrayList<Integer> GetLeastNumbers_Solution2(int [] input, int k) {
		int len=input.length;
		if(k>len||k==0) return res;
		PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(k,new Comparator<Integer>(){
			public int compare(Integer o1,Integer o2){
				return o2.compareTo(o1);//交换了默认的顺序，此时堆顶存放最大元素；
			}
		});
		for(int i=0;i<len;i++){
			if(maxHeap.size()!=k)
				maxHeap.offer(input[i]);
			else{
				if(input[i]<maxHeap.peek()){
					maxHeap.poll();
					maxHeap.offer(input[i]);
				}
			}
		}
		for(int i:maxHeap){
			res.add(i);
		}
		return res;
	}


}
