/**
 * 
 */
package a47ԲȦ��ʣ�µ�������;

import java.util.ArrayList;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��24������10:41:17
	@����������
0-n-1��n���������˵һ����m��o-n-1ѭ������������n-1���˳��ԣ���һ����0
���ű���֪��ʣ��һ���ˣ�
	@�㷨˼·��
	1����һ��λ�ú��ң���m-1��%n������˵��i��������Ϊ�����0λ�õ�ƫ������
	2������listģ�³����еĹ��̡�
	3����Ҫ����Ҫɾ������һ��λ�ã�
		�ӵ�ǰ��ɾ��λ��i�ƣ���һ��λ����i+��m-1��%��list.size())����
 */

public class Solution {
	public static void main(String[] args) {
	}
	public int LastRemaining_Solution(int n, int m) {
	 if(n<1||m<0) return 0;
	 ArrayList<Integer> list=new ArrayList<>();
	 for(int i=0;i<n;i++)
		 list.add(i);
	 int deletepoint=(m-1)%n;
	 while(list.size()>1){
		 list.remove(deletepoint);
		 deletepoint=(deletepoint+(m-1)%(list.size()));
	 }
	 return list.get(0);
	}
}
