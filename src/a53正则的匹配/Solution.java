/**
 * 
 */
package a53正则的匹配;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月24日下午7:48:52
	@问题描述：
请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
而'*'表示它前面的字符可以出现任意次（包含0次）。
 在本题中，匹配是指字符串的所有字符匹配整个模式。
 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
	@算法思路：
 
 */

public class Solution {
	public static void main(String[] args) {
		char []str={'\0','\0'};
		System.out.println(str.length);
		char []pattern={'\'','\''};
//		System.out.println(match(str,pattern));
	}
	
	static public boolean match(char[] str, char[] pattern){
//		if(str.length<=0||pattern.length<=0)
//			return false;
		int p1=0;
		int p2=0;
		return isMatch(str,p1,pattern,p2);
	}
	static public boolean isMatch(char[]str,int p1,char[]pattern,int p2){
		//终止条件是str和模式串pattern同时达到末尾；
		if(p1==str.length&&p2==pattern.length) return true;
		//如果字符串还没有匹配到头，但是模式串已经到头了，那么匹配失败；
		if(p1!=str.length&&p2==pattern.length) return false;
		
		//如果模式串当前位置处i的下一位是*时：
		if(p2+1<pattern.length&&pattern[p2+1]=='*'){
			//如果当前位置同模式串匹配,注意到要排除str可能到头了，但是pattern不一定，这种情况
			if((p1!=str.length)&&(str[p1]==pattern[p2])||(p1!=str.length&&pattern[p2]=='.')){
				return isMatch(str,p1+1,pattern,p2)
						||isMatch(str,p1+1,pattern,p2+2)
						||isMatch(str,p1,pattern,p2+2);
			}else{
			//如果当前位置同模式串不匹配
				return isMatch(str,p1,pattern,p2+2);
			}
		}
		//这里自动认为模式串下一位不是*，因为是*的话，下面是不会执行的，上面已经return了；
		if((p1!=str.length)&&(str[p1]==pattern[p2])||(p1!=str.length&&pattern[p2]=='.'))//仍然需要边界的判断；
			return isMatch(str,p1+1,pattern,p2+1);
		//以上都不成立返回false；
		return false;
	}
}























