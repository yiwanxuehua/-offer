/**
 * 
 */
package a51�����е�һ���ظ�������;

import java.util.Arrays;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��24������6:39:53
	@����������
��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�
Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡� 
���磬������볤��Ϊ7������{2,3,1,0,2,5,3}��
��ô��Ӧ������ǵ�һ���ظ�������2��
	@�㷨˼·��
	1��������������еĵ�һ���ظ������֣�
	2�����ñ������ķ�ʽ��ÿһ�ν���������Ӧλ������ΪTRUE��
	3��������ظ������֣����ǻ��ٴη��ʵ����λ�ã���ʱ��⵽���λ����true��
	4����ô���λ�õĶ�Ӧ�������Ԫ�ؾ��ǵ�һ���ظ������֣�
ע�����Ҫ���ÿһ���ظ������֣���ôȥ��return��Ȼ��duplication���±�����Ϊ�����ļ��ɣ�
 
 */

public class Solution {
	public static void main(String[]args){
		int[]num={1,2,3,4,2,5,3,4};
		int[] res=new int[1];
		System.out.println(duplicate(num,num.length,res));
	}
	
	static public boolean duplicate(int[]numbers,int length,int[]duplication){
		boolean[]flag=new boolean[length];
		for(int i=0;i<length;i++){
			if(flag[numbers[i]]==true){
				duplication[0]=numbers[i];
				System.out.println(duplication[0]);
				return true;
			}else{
				flag[numbers[i]]=true;
			}
		}
		System.out.println(duplication[0]);
		return false;
		
	}

}
