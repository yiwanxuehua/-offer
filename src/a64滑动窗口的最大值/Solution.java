/**
 * 
 */
package a64�������ڵ����ֵ;

import java.util.ArrayList;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��27������2:41:43
	@����������
	����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
	���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ�
���ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}��
 	�������{2,3,4,2,6,2,5,1}�Ļ�������������6����
{[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}�� {2,3,4,[2,6,2],5,1}�� 
{2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
	@�㷨˼·��
	1�����Ƚ�������ȣ�
		num������null��num�Ĵ�С����<=0��num��lenght����С��size�� ����ֱ�ӷ���null�ͺã�
	2��ÿ����һ�Σ���Ҫ�Ե�ǰ�����е�����ֵ�����
	3����i��¼���ڵ��Ҳ࣬j��¼���ڵ���ࡣ�õ�����������ൽ�Ҳ�����ֵ��
 
 ע����i��j��Ǵ��ڵ��ٽ硣iÿ��+1��jҲ��Ӧ+1���Ƚ����ֵ�봰�ڶ������¼����ֵ�Ĵ�С��
 �����������ֵ�ǲ����еģ���Ϊ������Ԫ��û��˳�򣬱���Ҫȫ���Ƚϣ��п��ܴ����������ֵ���
 
 */

public class Solution {

	public static void main(String[] args) {
		int[]num={2,3,4,2,6,2,5,1};
		System.out.println((maxInWindows(num,3).toString()));
	}
	
	static public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res=new ArrayList<>();
        
        if(num==null) return null;
        int len=num.length;
        if(len<size||size<=0) return res;
        int maxnum=0;
        int i=size-1;
        int j=0;
        while(i<len){
        	int temp=getMaxNum(num,j,i);
        	res.add(temp);
        	i++;
        	j++;
        }
		return res;
    }
	static int getMaxNum(int[]num,int j,int i){
		int temp=0;
		for(;j<=i;j++){
			if(num[j]>temp)
				temp=num[j];
		}
		return temp;
	}

}
