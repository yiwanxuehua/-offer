/**
 * 
 */
package a34����;

import java.util.ArrayList;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��9������8:50:49
	@����������
��ֻ��������2��3��5�����������������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
����6��8���ǳ�������14���ǣ���Ϊ����������7��
	@�㷨˼·��
	(1):�����鱣��
	(2):��������ָ�룬�ֱ�ָ������λ�ã�
	(3):����λ�÷ֱ��ǣ����ڳ�2����С���������ڳ�3����С���������ڳ�5����С������
	(4):ע�⣬��ʱ����ܳ�������a==b���������ôi��j�����м�1������
 
 */
public class Solution {

	public static void main(String[] args) {
		
		int temp=GetUglyNumber_Solution(10);
		System.out.println(temp);
	}
	private static int GetUglyNumber_Solution(int index) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		int i,j,k;
		i=j=k=0;
		while(list.size()<index){
			int a=list.get(i)*2;
			int b=list.get(j)*3;
			int c=list.get(k)*5;
			int min=Math.min(a, Math.min(c, b));
			list.add(min);
			if(min==a) 
				{i++;}//���ܼ�continue��
			if(min==b) 
				{j++;}
			if(min==c) 
				{k++;}
		}
		return list.get(index-1);
	 }

}
