/**
 * 
 */
package a52�����ɼ�����;

import java.util.Arrays;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��24������7:06:38
	@����������
����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],
����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����
	@�㷨˼·��
	1��B[0]=A[1]*..*A[n-1]��û��A[0];
	2��B[2]=A[0]*A[1]*A[3]....��û��A[2];
	�ǲ����۳˵Ľ����
	��pre���鱣��i֮ǰλ�õ��ۻ���
	��end���鱣��i֮��λ�õ��ۻ���
	���һ��ѭ����pre[i]*end[i]���ɣ�
 */

public class Solution {
	public static void main(String[]args){
		int[]A={1,2,3,4,5};
		System.out.println(Arrays.toString(multiply(A)));
	}
	
	static public int[] multiply(int[] A) {
		int len=A.length;
		int[]pre=new int[A.length];
		pre[0]=1;
		int[]end=new int[A.length];
		end[len-1]=1;
		int[]B=new int[len];
		for(int i=1;i<len;i++){
			pre[i]=pre[i-1]*A[i-1];
			end[len-1-i]=end[len-i]*A[len-i];
		}
		for(int i=0;i<len;i++){
			B[i]=pre[i]*end[i];
		}
		return B;
    }
}
