/**
 * 
 */
package a67表示数值的字符串;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月29日下午3:01:35
	@问题描述：
	请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
	例如：
		字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 		但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
	@算法思路：
	一个合法的数值[+,-]A.B(e|E[+,-]C);
	1、A、B、C是整数；
 	写的有点乱；
 */

public class Solution {
	public static void main(String[] args) {
		char[] tem="5e".toCharArray();
		
		System.out.println(isNumeric1(tem));
		System.out.println(isNumeric(tem));
	}
	
	static public boolean isNumeric1(char[] str) {
			String tem=new String(str);
	       String res="[\\+\\-]?\\d*(\\.\\d*)?([eE][\\+\\-]?\\d+)?"; 
	       return tem.matches(res);
	}
	
	static boolean haspoint=false;
	static public boolean isNumeric(char[] str) {
		if(str==null) return false;
		int i=0;
		//判断小数点前面部分；
		if(str[i]=='+'||str[i]=='-')
			i++;
		i=hasInterger(str, i);
		
		//小数后部分：
		i=hasPoint(str,i);
		if(i<str.length&&haspoint){//如果有小数点
			int k=i;
			i=hasInterger(str,i);
			if(k==i) return false;
		}
		//是否有e：
		if(i<str.length&&(str[i]=='E'||str[i]=='e')){
			i++;
			if(i<str.length&&(str[i]=='+'||str[i]=='-'))
				i++;
			int k=i;
			i=hasInterger(str,i);
			if(k==i) return false;
			
		}else{
			i=hasInterger(str, i);
		}
		
		
		if(i==str.length) return true;
		else
			return false;
    }
	//有没有整数；
	static int hasInterger(char[]str,int i){
		while(i<str.length&&str[i]>='0'&&str[i]<='9')
			i++;
		return i;
	}
	//有没有小数点
	static int hasPoint(char[]str,int i){
		if(i<str.length&&str[i]=='.'){
			i++;
			haspoint=true;
		}
		return i;
	}
}















