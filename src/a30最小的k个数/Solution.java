package a30��С��k����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��3������8:38:42

	@����������
����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�
����С��4��������1,2,3,4,��

	@�㷨˼·��
(��һ)����k��Ԫ�ص����ѣ���ʣ��Ԫ�أ����С�ڶѶ����򽻻������µ����ѣ������ھ���ʣ����Сk��Ԫ���ˣ�
(����)ͨ��PriorityQueue�������ʵ�֣����ڲ��ǻ�����С��ʵ�ֵģ��Ѷ������СԪ�ء�
���ǽ������Ϊ��СΪk�ģ��Ѷ�������Ԫ�ص����ȶ��У�������һ��ѭ�����ܽ�����⣻

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
	
	//����priorityqueueʵ�ֵģ����ڲ��ѣ�
	
	private static  ArrayList<Integer> GetLeastNumbers_Solution2(int [] input, int k) {
		int len=input.length;
		if(k>len||k==0) return res;
		PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(k,new Comparator<Integer>(){
			public int compare(Integer o1,Integer o2){
				return o2.compareTo(o1);//������Ĭ�ϵ�˳�򣬴�ʱ�Ѷ�������Ԫ�أ�
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
