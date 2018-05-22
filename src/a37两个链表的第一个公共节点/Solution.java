/**
 * 
 */
package a37两个链表的第一个公共节点;

import 结构.ListNode;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月22日下午8:03:56
	@问题描述：
输入两个链表，找出它们的第一个公共结点。
	@算法思路：
方法一：我们建立一个Set，将每次访问的两个链表的节点的地址放入，
	如果出现重复的，就是重复的节点；在遍历到该重复节点就找到了。

方法二：两个链表共用一个节点意味着什么？意味着两个链表在该节点以后是合并的。
	第一次遍历，我们得到两条链表的长度。
	让较长的链表先走，直到剩下的与端链等长，然后一起走，并比较。

 
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
		}//到此headL是较长链表的头，headS同理；
		for(int i=0;i<len;i++){
			headL=headL.next;
		}
		while(headL!=headS){
			//这里不用判断headL与headS是不是null的，即使是，while会跳出，直接返回的就是null；
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
