package a13˳�����������ŷ��ǰ;

import java.util.Arrays;

/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��4��17������9:03:54

	@����������
		����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
		���е�ż��λ��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò���
	@�㷨˼·��
		��ָ�ϸ����ǲ�Ҫ�������֤���λ�ã�����ǰ��˫ָ�뷽ʽ���ɽ����
		��������޸�ð������ķ�ʽ��
		Ҳ���Բ���һ�������鱣��ż��ֵ��
 
*/
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,5,4,6,3,7};
		reOrderArray(a);
		System.out.println(Arrays.toString(a));
	}
	static public void reOrderArray(int [] array) {
		if(array==null||array.length<=0) System.out.println("cuowu");
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-i-1;j++){
				if((array[j]&1)==0&&((array[j+1]&1)==1)){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

}
