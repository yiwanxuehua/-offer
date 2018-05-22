/**
 * 
 */
package a35第一次只出现一次的字符位置;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月11日下午9:01:10
	@问题描述：
	在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置

	@算法思路：
	方法一：设置一个flag数组，保存所有遍历过的数据；
	方法二：通过hashmap,str[i]为key，count为value；
 */
public class Solution {

	public static void main(String[] args) {
		
	}
	
	private int FirstNotRepeatingChar(String str) {
		if(str.length()<=0) return -1;
		int[] flag=new int[256];
		for(int i=0;i<str.length();i++){
			char temp=str.charAt(i);
			flag[temp]++;
		}
	    for(int i=0;i<flag.length;i++){
	    	if(flag[str.charAt(i)]==1)
	    		return i;
	    }
	    return -1;
	}

}
