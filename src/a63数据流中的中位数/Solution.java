/**
 * 
 */
package a63数据流中的中位数;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月26日下午4:10:57
	@问题描述：
如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
	@算法思路：
//一般而言，将取值操作的时间复杂度尽量降低；
 * 使用API中的排序队列PriorityQueue：会按照自然序进行排序，对头为最小值；
 *1、 我们使用一个计数index记录插入的元素个数，
 *2、但是如何控制小队列与大队列中的元素个数，使其个数最多相差1个呢？
 *		采用如下的逻辑：
 *		index是奇数，向大的插入元素，我们必须保证大堆中个数增加了1，同时，不违背大堆>小堆的原则；
 *			因此：如果a>大堆顶，直接插；如果小于，这个值应该放在小堆，但是要保证大堆+1,需要将小堆的尾元素加入到大堆中；
 3、注意，compare方法如何使用：
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
	//分别定义了大堆、小堆和计数器
	//定义：最小堆的元素都小于最大堆，最小堆的最大元素在堆顶；
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
		if((index&1)==1){//奇数,向小堆中插入；
			if(!maxHeap.isEmpty()&&num>maxHeap.peek()){//如果插入值大于大堆的最小值，该值应插入大堆；
				maxHeap.offer(num);//大堆插入
				num=maxHeap.poll();//大堆的最小值出栈；
			}
			minHeap.offer(num);
		}else{
			if(!minHeap.isEmpty()&&num<minHeap.peek()){//如果插入值小于小堆的最小值，该值应插入小堆；
				minHeap.offer(num);//小堆插入；
				num=minHeap.poll();//小堆的最大值出栈；
			}
			maxHeap.offer(num);
		}
	}

	static public Double GetMedian() {
		return (index&1)==1?Double.valueOf(minHeap.peek()):(minHeap.peek()+maxHeap.peek())/2.0;
	}

}
