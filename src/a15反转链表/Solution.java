package a15��ת����;

import �ṹ.ListNode;

/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��4��18������7:26:33

	@��������������һ��������ת�����������������Ԫ�ء�

	@�㷨˼·�� (1)����ָ�룺ָ��end��ָ��pre=end.next;
			(2)ָ��temp����pre.next;
			(3)pre.nextָ��ָ��pre
			(4)end���µ�pre
			(5)pre���µ�temp
		ѭ����ֱ��preΪnull,��ʱ��ȫ����ת,����end��ΪͷԪ�أ�
		ע�⣺����ʼʱhead��nextָ��null��

*/
public class Solution {
	public ListNode ReverseList(ListNode head) {
		if(head==null||head.next==null) return head;
		ListNode pre=head;
		ListNode end=null;
		ListNode temp=null;
		while(pre!=null){
			temp=pre.next;
			pre.next=end;
			end=pre;
			pre=temp;
		}		
		return end;
	}
}
