/**
 * 
 */
package a37��������ĵ�һ�������ڵ�;

import �ṹ.ListNode;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��22������8:03:56
	@����������
�������������ҳ����ǵĵ�һ��������㡣
	@�㷨˼·��
����һ�����ǽ���һ��Set����ÿ�η��ʵ���������Ľڵ�ĵ�ַ���룬
	��������ظ��ģ������ظ��Ľڵ㣻�ڱ��������ظ��ڵ���ҵ��ˡ�

������������������һ���ڵ���ζ��ʲô����ζ�����������ڸýڵ��Ժ��Ǻϲ��ġ�
	��һ�α��������ǵõ���������ĳ��ȡ�
	�ýϳ����������ߣ�ֱ��ʣ�µ�������ȳ���Ȼ��һ���ߣ����Ƚϡ�

 
 */

public class Solution {

	public static void main(String[] args) {
	}
	public static ListNode FindFirstCommonNode(ListNode p1, ListNode p2) {
		
		if(p1==null||p2==null) return null;
		int l=getLength(p1);
		ListNode headL=p1;
		int s=getLength(p2);
		ListNode headS=p2;
		int len=l-s;
		if(len<0){
			headL=p2;
			headS=p1;
			len=-len;
		}//����headL�ǽϳ������ͷ��headSͬ��
		for(int i=0;i<len;i++){
			headL=headL.next;
		}
		while(headL!=headS){
			//���ﲻ���ж�headL��headS�ǲ���null�ģ���ʹ�ǣ�while��������ֱ�ӷ��صľ���null��
			headL=headL.next;
			headS=headS.next;
		}
		return headL;
	}
	
	public static int getLength(ListNode list){
		int index=0;
		while(list!=null){
			index++;
			list=list.next;
		}
		return index;
	}
}
