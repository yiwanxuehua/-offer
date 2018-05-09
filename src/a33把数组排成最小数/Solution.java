/**
 * 
 */
package a33把数组排成最小数;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月9日下午7:51:14
	@问题描述：
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个;
例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323

	@算法思路：
 	(1):看给定例子怎么实现？如果两个数{3,32}，因为332>323,所以结果是323，但是我们凭什么输出的323，即
 	323是怎么输出的？
 	（2）：如果我们对{3,32}进行排序，以一种我们自定义的规则，转化为{32,3},那么输出直接 32+""+3就好了；
 	(3):注意compare的排序方式
 */

public class Solution {

	public static void main(String[] args) {
		int []a={3,32,321};
		int []b={3,5,1,4,2};
		String s1=PrintMinNumber(b);
		System.out.println(s1);
	}
	private static String PrintMinNumber(int [] nums){
		ArrayList<String> list=new ArrayList<>();
		String res="";
		for(int i=0;i<nums.length;i++){
			list.add(String.valueOf(nums[i]));
		}
		Collections.sort(list, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return (o1+o2).compareTo(o2+o1);
				//4,3>3,4：那么就将3与4互换位置；
			}
			
		});
		for(String s:list){
			res=res+s;
		}
		return res;
	}
	

}
