/**
 * 
 */
package a43和为S的两个数字;

import java.util.ArrayList;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月23日下午4:16:05
	@问题描述：
输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，
如果有多对数字的和等于S，输出两个数的乘积最小的。
	@算法思路：
思路类似于a42的方法，但有不同：
1、有序数组，全是正数，2*6<4*4;所以从头尾两处找到的第一组数就是答案；
2、寻找过程中，若和s<sum,则钱指针向后移找个更大的；
			   若和s。sum，则后指针向前移，使和小一点；
 */

public class Solution {
	public static void main(String[] args) {
		int []a={1,2,3,4,5,8};

	}
	static public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> res=new ArrayList();
        if(array==null||sum==0) return res ;
        
        int j=array.length-1;//j从数组尾部向前；
        int i=0;			 //i从数组头部向前；
        int s=0;
        while(i<j){
            s=array[i]+array[j];
            if(s==sum){
                res.add(array[i]);
                res.add(array[j]);
                return res;
            }else{
                if(s<sum) i++;
                else j--;
            }
        }
        return res;
	}
}
