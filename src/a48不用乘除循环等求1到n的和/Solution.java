/**
 * 
 */
package a48���ó˳�ѭ������1��n�ĺ�;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��24������2:45:01
	@����������
��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��
else��switch��case�ȹؼ��ּ������ж���䣨A?B:C��
	@�㷨˼·��
��Ŀ��׼��ѭ����ѭ��������ǵݹ飬���ǵݹ��в��У�һ��ĵݹ���ʹ��if���ж���ֹ������
���ǲ�����if���ȿ���ֹ����������һ��Ὣ��������Ϊn=1��n=0ʱ������ô��������n=0��1��ʱ��
ֹͣ�ݹ��أ��뵽�߼��������߼����
 
 */

public class Solution {
	public static void main(String[] args) {
		System.out.println(Sum_Solution(6));
	}
	static public int Sum_Solution(int n) {
		int sum=n;
		boolean b=(sum==0)||((sum+=Sum_Solution(n-1))>0);
//		boolean b=(sum>0)&&((sum+=Sum_Solution(n-1))>0);
		return sum;
	}

}
