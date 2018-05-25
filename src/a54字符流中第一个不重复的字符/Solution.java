/**
 * 
 */
package a54字符流中第一个不重复的字符;

import java.util.ArrayList;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月25日下午2:59:23
	@问题描述：
请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，
第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
	@算法思路：
 1、重点是：第一个只出现一次的字符；
 2、使用int型标记数组，大小事128；
 */

public class Solution {
	
	 ArrayList<Character> res=new ArrayList<>();
	 int[]flag=new int[128];
	  //Insert one char from stringstream
	 public void Insert(char ch)
	 {
	     res.add(ch);
	     flag[ch]++;
	 }
	  //return the first appearence once char in current stringstream
	 public char FirstAppearingOnce()
	 {
	    for(int i=0;i<res.size();i++){
	    	if(flag[res.get(i)]==1)
	    		return res.get(i);
	    }
	   return '#';
	 }

}
