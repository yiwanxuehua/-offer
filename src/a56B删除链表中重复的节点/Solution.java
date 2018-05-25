/**
 * 
 */
package a56B删除链表中重复的节点;

import 结构.ListNode;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月25日下午4:42:43
	@问题描述：
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
	@算法思路：
 1、用递归比较好做；
 2、这里我们递归的思想是：比如：1，1,1,2,2,3,4，4,5；
 3、在每一层把如果该层是重复数，比如1，那么我们只对剩下的数求重复；return deleteDuplication(2);
 4、如果当前点不是一个重复点，如3，那么3.next就是deleteDuplication(4)的结果；
 
 */

public class Solution {
	public static void main(String[] args) {
		ListNode p1=new ListNode(1);
		ListNode p2=new ListNode(1);
		ListNode p3=new ListNode(1);
		ListNode p4=new ListNode(3);
		ListNode p5=new ListNode(3);
		p1.next=p2;p2.next=p3;p3.next=p4;p4.next=p5;
		System.out.println(deleteDuplication(p1).val);
	}
	
	static public ListNode deleteDuplication(ListNode pHead)
    {
		//是否可做终止条件；
		if(pHead==null||pHead.next==null) return pHead;
		
		ListNode p=pHead;
		
		if(p.next!=null && p.next.val==p.val){
			p=p.next;
			while(p!=null&&pHead.val==p.val){
				p=p.next;
			}
			return deleteDuplication(p);
		}else{
			p.next=deleteDuplication(p.next);
			return p;
		}
    }

}
