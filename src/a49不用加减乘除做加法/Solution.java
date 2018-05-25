/**
 * 
 */
package a49不用加减乘除做加法;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月24日下午3:22:05
	@问题描述：
写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
	@算法思路：
一般我们会想到用位运算：13+11为例子：
1101&1011=9得到哪些位上会产生进制，左移一会后称为18，表示加到该位上；
1101^1011=6得到哪些位上不会产生进制；
所以(a^b)+(a&b)<<1=a+b;
知道进位为0了，那么a&b就是结果；
 
 */

public class Solution {
	public static void main(String[] args) {
		System.out.println(Add1(3,5));
		System.out.println(Math.pow(2, 32));
	}
	static public int Add1(int a,int b) {
		
		while(b!=0){
			int pre=(a&b)<<1;//pre表示进位,保存过渡值；
			a=a^b;			//a表示当前非进位；
			b=pre;			//此时a、b保存了一组新的和元素；
		}
		return a;
	}

}
