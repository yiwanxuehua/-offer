/**
 * 
 */
package a50字符串转换成数字;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月24日下午4:39:50
	@问题描述：
将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 
数值为0或者字符串不是一个合法的数值则返回0
	@算法思路：
	输入的字符串中正确的数字格式中包含：[+,-,这里不包括小数点因为是整数]？
	只出现一次或不出现，其他都是数字；
	一个合理的正则表示为：reg="[+,-]?\\d+(\\.\\d+)?"；
方法一： 	1、需要记录负号，因为输出时可能需要输出负号；
 		2、因为是整数，过滤掉正负号以后，
 	 		若是[1,9]:t=(res[i]-'0')+t*10;记录千百位等；
 	 		若不符合条件时直接返回0即可；

方法二：正则的方法使用正则去判断是否合乎规范：
	1：如果不符合规范，直接返回0；
	2：若符合规范：我们将str按照[+,-]切成两份：
	其中有符号的会被切成两个部分，第一部分是空“”的；
	3：根据切的结果，利用Double.valueOf(str)将其转化为double类型；
	4：根据str的首字符的情况判断输出；
 */

public class Solution {
	public static void main(String[] args) {
		System.out.println(StrToInt1("+123-4.546"));
	}
	static public int StrToInt(String str) {
	  char[] res=str.toCharArray();
	  int i=0;
	  int fuHao=0;
	  int t=0;
	  if(res[0]=='-'){
		  fuHao=1;
		  i++;
	  }
	  if(res[0]=='+'){
		  i++;
	  }
	  for(;i<res.length;i++){
		  if(res[i]>='0'&&res[i]<=9){
			  t=(res[i]-'0')+t*10;
		  }else return 0;
	  }
	  return fuHao==1?-1*t:t;
	}
	//假设有小数点的情况；
	static public double StrToInt1(String str){
		String reg="[+,-]?\\d+(.\\d+)?";
		boolean b=str.matches(reg);
		double res=0.0;
		if(b==true){//是一个合法的数字字符串；
			String[] str1=str.split("[+,-]");
			if(str1.length==2){//说明前面待着符号；
				res=Double.valueOf(str1[1]);
			}else{
				 res=Double.valueOf(str1[0]);
			}
		}else{
			return 0;
		}
		if(str.indexOf(0)=='-') return -res;
		else return res;
	}

}









