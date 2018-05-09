package a28字符串的所有排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*	@作者：yiwanxuehua
	@创建时间：2018年5月2日下午8:53:40

	@问题描述：
	输入一个字符串,按字典序打印出该字符串中字符的所有排列。
	例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。

	@算法思路：采用递归的思想，以abc为例子；
	(1):所有以a开头的字符串，下层递归bc；
	(2)：第二层，所有以b为2号的和所有以c为2号的；
	(3):第三层：只余下一个元素：以c为尾和以b为尾；
	这样，所有以a为头的全部被打印出来；
	(4):只需要在(1)之前，加一个循环，将a后面的每一位与a调换，即打印以剩余元素为头的；
	(5):每层递归结束，都要交换回到原来的位置。以免对其他情况的打印产生影响；
*/
public class Solution {
	public static void main(String[]args){
		String str="abc";
		new Solution().Permutation(str);
		Collections.sort(res);
		for(String s:res){
			System.out.println(s);
		}
	}
	
	static  ArrayList<String> res=new ArrayList<>();
	 public ArrayList<String> Permutation(String str) {
		
		 char[] strs=str.toCharArray();
		 getArray(strs,0,strs.length-1);
		 return res;
	 }
	 private void getArray(char[]str2,int start,int end){
		 if(start==end){
			 String str=String.valueOf(str2);
			 if(!res.contains(str)){
				 res.add(str);
			 }
		 }else{
			 for(int i=start;i<=end;i++){
				 swap(str2,start,i);//剩余元素以i位置元素开头；
				 getArray(str2,start+1,end);
				 swap(str2,start,i);//交换回去恢复原来的位置；
			 }
		 }
	 }
	 private void swap(char[]str2,int i,int j){
		 char temp=str2[i];
		 str2[i]=str2[j];
		 str2[j]=temp;
	 }

}
