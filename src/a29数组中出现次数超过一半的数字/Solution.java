package a29数组中出现次数超过一半的数字;
/*	@作者：yiwanxuehua
	@创建时间：2018年5月3日下午7:42:40

	@问题描述：
	数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
	例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
	由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
	如果不存在则输出0。

	@算法思路：
	(1)：注意题目的描述：超过一半，为什么要超过,为什么要一半？
	(2):用攻守阵地的思想：士兵为第一个元素，相同技术加一，不同减一，最后阵地上的那元素可能就是；
	
	(3):如果改成等于或者超过一半呢？
		如果存在，那么val必然存在于最后一次对比中（即array[len-1]处的对比，要寻找的数要么是此时的val，要么是array[len-1]）；
		见方法二；
*/
public class Solution {
	public static void main(String[]args){
		int[]a={2,3,2,3,2,4};
		Solution s1=new Solution();
		System.out.println(s1.MoreThanHalfNum_Solution2(a));
	}
	public int MoreThanHalfNum_Solution(int [] array) {
		int len=array.length;
		if(len<=0) return -1;
		int count=1;
		int val=array[0];
		for(int i=1;i<len;i++){
			if(array[i]==val)
				count++;
			else
				count--;
			if(count==0)
				val=array[i];
		}
		count=0;
		for(int i=0;i<len;i++){
			if(array[i]==val)
				count++;
		}
		if(count>len/2)
			return val;
		else return 0;
	}
	
	public int MoreThanHalfNum_Solution2(int [] array) {
		int len=array.length;
		if(len<=0) return -1;
		int count=1;
		int val=array[0];
		for(int i=1;i<len-1;i++){
			if(array[i]==val)
				count++;
			else
				count--;
			if(count==0){
				val=array[i];
				count=1;
			}
				
		}
		count=0;
		int count2=0;
		if(val!=array[len-1]){
			for(int i=0;i<len;i++){
				if(array[i]==val)
					count++;
				if(array[i]==array[len-1])
					count2++;
			}
			if((len&1)==0){//偶数个
				if(count>=len/2) return val;
				if(count2>=len/2) return array[len-1];
				return 0;
			}else{//奇数个
				if(count>len/2) return val;
				if(count2>len/2) return array[len-1];
				return 0;
			}
		}else{
			for(int i=0;i<len;i++){
				if(array[i]==val)
					count++;
			}
			if((len&1)==0){//偶数个
				if(count>=len/2) return val;
				else return 0;
			}else{
				if(count>len/2) return val;
				else return 0;
			}
		}
	}
	
}
