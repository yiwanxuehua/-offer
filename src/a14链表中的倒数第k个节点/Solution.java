package a14�����еĵ�����k���ڵ�;

import �ṹ.ListNode;

/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��4��18������7:05:49

	@��������������һ����������������е�����k����㡣

	@�㷨˼·��˫ָ��˼·��ָ��pre��ָ��end��pre-end=k-1;
	��pre����ĩβʱ��end��Ŵ��ڵ�����k����λ�ã�

*/
public class Solution {
	
	public ListNode FindKthToTail(ListNode head,int k) {
		
		if(head==null||k<=0) return null;
		ListNode pre=head;
		//preָ������k-1��;���kֵ�����������ȣ�ֱ�ӷ��ؿգ�
		for(int i=0;i<k-1;i++){
			pre=pre.next;
			if(pre==null) 
				return null;
		}//˫ָ��ͬʱ�ߣ�
		while(pre.next!=null){
			pre=pre.next;
			head=head.next;
		}		
		return head;
	}
}
