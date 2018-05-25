/**
 * 
 */
package a41数组中只出现一次的数字;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月23日下午3:00:07
	@问题描述：
一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
num1与num2的0号位置处分别存放这两个结果；
	@算法思路：
方法一：设置HashMap键值对的形式去寻找，不过这样的话空间复杂度有些高。
方法二：利用二进制运算：为什么题目给出其他数字出现两次？
	      我们知道a^a=0;那么将数组中的所有的数进行^操作，最终的结果会保留我们寻找的两个数的信息；
	   1、遍历一遍数组，所有数进行异或；
	   2、异或结果中，我们找到其二进制中第一个不为0的位置，说明在改位置处两个数是不同的；
	   3、再次遍历数组，每个数字右移2中位数后，判断最低位是否是1，分别异或到num0和num1；
	   4、遍历结束、num1与num2就是我们要寻找的数；
 */

public class Solution {
	static int[]num1=new int[1];
	static int[]num2=new int[1];
	public static void main(String[] args) {
		int[]arr={1,2,3,4,5,6,7,6,5,2,7,1};
		FindNumsAppearOnce(arr, num1, num2);
		System.out.println(num1[0]+"--"+num2[0]);
	}
	
    static public void FindNumsAppearOnce(int [] arr,int num1[] , int num2[]) {
    	if(arr==null||arr.length<=0) return;
    	int temp=0;
    	for(int i=0;i<arr.length;i++){
    		temp^=arr[i];
    	}//temp保存arr数组的异或结果；
    	int first1Location=get1Location(temp);//找到从低位开始的第一个二进制1的位置；
    	
    	for(int i=0;i<arr.length;i++){
    		int p=arr[i]>>>first1Location;//移到对应位置；
    		if((p&1)==1)
    			num1[0]^=arr[i];//其中一定只包含两个数中的一个
    		else num2[0]^=arr[i];
    	}
    }
    static int get1Location(int temp){
    	int count=0;
    	while((temp&1)==0&&count<32){//不能超过int类型的32位限制
    		count++;
    		temp=(temp>>>1);
    	}
    	
    	return 0;
    }
}
