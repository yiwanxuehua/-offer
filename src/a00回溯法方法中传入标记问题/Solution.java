/**
 * 
 */
package a00���ݷ������д���������;

import java.util.Arrays;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��27������9:03:43
	@����������
�ڻ��ݷ����У����ݹ�Ĳ����д�����ʱ���������һ��ݹ��޸��˱�ǣ���ô�ڵݹ鷵��ʱ���ò�ı�ǵ�����ʲô״̬����û�б��޸ģ�

	@�㷨˼·��
����Ϊ������ʱû�б��޸ĵģ��ڵ�ǰ�㣻
 
 */

public class Solution {
	
	public static void main(String[] args) {
		 int[]flag=new int[5];
		 int[]num={1,2,3,4,5};
		get(num,flag,0);
		System.out.println(Arrays.toString(flag));
	}
	
	static public void get(int[]num,int[]flag,int i){
		if(i>num.length-1) return;
		if(num[i]==2){
			flag[i]++;
		}
		get(num,flag,++i);
	}

}
