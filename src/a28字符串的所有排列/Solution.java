package a28�ַ�������������;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��2������8:53:40

	@����������
	����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
	���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��

	@�㷨˼·�����õݹ��˼�룬��abcΪ���ӣ�
	(1):������a��ͷ���ַ������²�ݹ�bc��
	(2)���ڶ��㣬������bΪ2�ŵĺ�������cΪ2�ŵģ�
	(3):�����㣺ֻ����һ��Ԫ�أ���cΪβ����bΪβ��
	������������aΪͷ��ȫ������ӡ������
	(4):ֻ��Ҫ��(1)֮ǰ����һ��ѭ������a�����ÿһλ��a����������ӡ��ʣ��Ԫ��Ϊͷ�ģ�
	(5):ÿ��ݹ��������Ҫ�����ص�ԭ����λ�á��������������Ĵ�ӡ����Ӱ�죻
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
				 swap(str2,start,i);//ʣ��Ԫ����iλ��Ԫ�ؿ�ͷ��
				 getArray(str2,start+1,end);
				 swap(str2,start,i);//������ȥ�ָ�ԭ����λ�ã�
			 }
		 }
	 }
	 private void swap(char[]str2,int i,int j){
		 char temp=str2[i];
		 str2[i]=str2[j];
		 str2[j]=temp;
	 }

}
