/**
 * 
 */
package a55链表中环的入口节点;

import java.util.HashSet;

import 结构.ListNode;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月25日下午3:26:14
	@问题描述：
一个链表中包含环，请找出该链表的环的入口结点。
	@算法思路：
方法一：	
 1、两步走策略、p1每次走两步，p2每次走一步；
 2、假设头到入口距离为a1，入口到相遇点距离为a2，相遇点到入口的距离是a3；
 3、相遇时，p1走过了，a1+k(a2+a3)+a2;
 	p2走过了,a1+n(a2+a3)+a2;其中n<k。（这里的n应该是0，）
 	因为p1走过的是p2的两倍，有：
 		a1+k(a2+a3)+a2=2[a1+n(a2+a3)+a2]；
 	=》	a1=(k-2n)(a2+a3)-a2;
 	=》	a1=(k-1-2n)(a2+a3)+(a2+a3)-a2=(k-1-2n)(a2+a3)+a3;
 	由a3的定义，此时我们假设有一个点p从起点开始走：
 		当p与p2相遇时，p走了a1，p2走了(k-1-2n)(a2+a3)+a3；这个相遇点就是入口点；

 方法二：
 		使用Hash的方法；将遍历的节点作为key保存；
 */

public class Solution {
	public static void main(String[] args) {

	}
	static public ListNode EntryNodeOfLoop1(ListNode pHead){
		 ListNode p1=pHead;
	        ListNode p2=pHead;
	        while(p1.next!=null&&p1.next.next!=null){
	            p1=p1.next.next;
	            p2=p2.next;
	            if(p1==p2){
	                ListNode p3=pHead;
	                while(p3!=p2){
	                    p3=p3.next;
	                    p2=p2.next;
	                }
	                return p3;
	            }
	        }
	        return null;
	}
	static public ListNode EntryNodeOfLoop2(ListNode pHead){
		HashSet<ListNode> res=new HashSet();
		while(pHead!=null){
			if(res.contains(pHead))
				return pHead;
			res.add(pHead);
			pHead=pHead.next;
		}
		return null;
	}
}
























