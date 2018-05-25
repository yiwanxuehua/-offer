/**
 * 
 */
package a44左旋转字符串;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月24日上午9:18:22
	@问题描述：
对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
	@算法思路：
	1:注意String.substring(int begin,int end)的剪切位置。
	2：当n的长度超过length时，剪切位置在（n%str.length()）处：
		“abcdefg”，8；左移8位后为bcdefga；
		剪切位置在1处。
	3：“abcdefg”.substring(0,1):即从0位开始剪切，到1位为止，不包括1位。substring(0,0)则剪切后为"";
 
 */

public class Solution {
	public static void main(String[] args) {
		String temp="abcdefg";
		System.out.println(LeftRotateString(temp,2));
		
		System.out.println("输出"+"abcdef".substring(0, 0));
		System.out.println("".length());
	}
	static public String LeftRotateString(String str,int n) {
		
		if(str==null||str.length()<=0) return "";
		String part1=str.substring(0,n%str.length());
		System.out.println(part1);
		String part2=str.substring(n%str.length(),str.length());
		System.out.println(part2);
		return part2+part1;
	}

}
