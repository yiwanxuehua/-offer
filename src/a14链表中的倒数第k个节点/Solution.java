package a14链表中的倒数第k个节点;

import 结构.ListNode;

/*	@作者：yiwanxuehua
	@创建时间：2018年4月18日下午7:05:49

	@问题描述：输入一个链表，输出该链表中倒数第k个结点。

	@算法思路：双指针思路：指针pre与指针end：pre-end=k-1;
	当pre到达末尾时，end这号处在倒数第k个的位置；

*/
public class Solution {
	
	public ListNode FindKthToTail(ListNode head,int k) {
		
		if(head==null||k<=0) return null;
		ListNode pre=head;
		//pre指针先走k-1步;如果k值超出了链表长度，直接返回空；
		for(int i=0;i<k-1;i++){
			pre=pre.next;
			if(pre==null) 
				return null;
		}//双指针同时走；
		while(pre.next!=null){
			pre=pre.next;
			head=head.next;
		}		
		return head;
	}
}
