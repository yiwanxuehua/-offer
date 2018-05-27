/**
 * 
 */
package a63�������е���λ��;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��26������4:10:57
	@����������
��εõ�һ���������е���λ����������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��
������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ��
	@�㷨˼·��
//һ����ԣ���ȡֵ������ʱ�临�ӶȾ������ͣ�
 * ʹ��API�е��������PriorityQueue���ᰴ����Ȼ��������򣬶�ͷΪ��Сֵ��
 *1�� ����ʹ��һ������index��¼�����Ԫ�ظ�����
 *2��������ο���С�����������е�Ԫ�ظ�����ʹ�����������1���أ�
 *		�������µ��߼���
 *		index�����������Ĳ���Ԫ�أ����Ǳ��뱣֤����и���������1��ͬʱ����Υ�����>С�ѵ�ԭ��
 *			��ˣ����a>��Ѷ���ֱ�Ӳ壻���С�ڣ����ֵӦ�÷���С�ѣ�����Ҫ��֤���+1,��Ҫ��С�ѵ�βԪ�ؼ��뵽����У�
 3��ע�⣬compare�������ʹ�ã�
 */

public class Solution {

	
	public static void main(String[] args) {
		Insert(5);
		Insert(2);
		Insert(3);
		Insert(4);
		Insert(1);
		Insert(6);
		Insert(7);
		Insert(0);
		Insert(8);
		System.out.println(GetMedian());
		
	}
	//�ֱ����˴�ѡ�С�Ѻͼ�����
	//���壺��С�ѵ�Ԫ�ض�С�����ѣ���С�ѵ����Ԫ���ڶѶ���
	static PriorityQueue<Integer> minHeap=new PriorityQueue<>(11,new Comparator<Integer>(){

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		}
		
	});
	static PriorityQueue<Integer> maxHeap=new PriorityQueue<>();
	static int index=0;
	
	static public void Insert(Integer num) {
		++index;
		if((index&1)==1){//����,��С���в��룻
			if(!maxHeap.isEmpty()&&num>maxHeap.peek()){//�������ֵ���ڴ�ѵ���Сֵ����ֵӦ�����ѣ�
				maxHeap.offer(num);//��Ѳ���
				num=maxHeap.poll();//��ѵ���Сֵ��ջ��
			}
			minHeap.offer(num);
		}else{
			if(!minHeap.isEmpty()&&num<minHeap.peek()){//�������ֵС��С�ѵ���Сֵ����ֵӦ����С�ѣ�
				minHeap.offer(num);//С�Ѳ��룻
				num=minHeap.poll();//С�ѵ����ֵ��ջ��
			}
			maxHeap.offer(num);
		}
	}

	static public Double GetMedian() {
		return (index&1)==1?Double.valueOf(minHeap.peek()):(minHeap.peek()+maxHeap.peek())/2.0;
	}

}
