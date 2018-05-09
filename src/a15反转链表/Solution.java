package a15反转链表;

import 结构.ListNode;

/*	@作者：yiwanxuehua
	@创建时间：2018年4月18日下午7:26:33

	@问题描述：输入一个链表，反转链表后，输出链表的所有元素。

	@算法思路： (1)两个指针：指针end和指针pre=end.next;
			(2)指针temp保存pre.next;
			(3)pre.next指向指针pre
			(4)end更新到pre
			(5)pre更新到temp
		循环，直到pre为null,此时已全部反转,返回end即为头元素；
		注意：将开始时head的next指向null；

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
