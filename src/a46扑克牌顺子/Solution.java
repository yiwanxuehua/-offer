/**
 * 
 */
package a46�˿���˳��;

import java.util.Arrays;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��24������10:12:31
	@����������

	@�㷨˼·��
	1������Ҫ����
	2���ж�0�ĸ�����
	ѭ���нṹ��
	{
		if(��ǰ��0){
			0�ĸ���+1��
			������
		}����{
			if����ǰ����һ��λ������ȣ�����false��
			��ֵ+=��һ��λ����-��ǰλ����-1��
		}
		if(��ֵ>0�ĸ���) ����false��
	}
 */

public class Solution {
	public static void main(String[] args) {
		int[]a={0,0,2,5,6,7,9};
		System.out.println(isContinuous(a));
	}
	
	static public boolean isContinuous(int [] num) {
		if(num==null||num.length<=0) return false;
		int count0=0;	//��¼0�ĸ�����
		int cha=0;		//��¼��ֵ��
		
		Arrays.sort(num);//������
		for(int i=0;i<num.length-1;i++){
			if(num[i]==0){
				count0++;
				continue;
			}
			else{
				if(num[i]==num[i+1]) return false;
				cha+=num[i+1]-num[i]-1;
			}
			if(cha>count0) return false;
		}
		return true;
    }

}
