/**
 * 
 */
package a45翻转单词的顺序;

import java.util.Arrays;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月24日上午9:59:56
	@问题描述：
直接举例：student. a am I翻转，，正确的是 I am a Student.

	@算法思路：
 
 */

public class Solution {
	public static void main(String[]args){
		System.out.println(ReverseSentence("student. a am I "));
	}
    static public String ReverseSentence(String str) {
    	String[]temp=str.split(" ");
    	System.out.println(Arrays.toString(temp));
    	StringBuffer sb=new StringBuffer();
    	for(int i=temp.length-1;i>=0;i--){
    		sb.append(temp[i]);
    		sb.append(" ");
    	}
    	
    	
    	return sb.toString().trim();
    }

}
