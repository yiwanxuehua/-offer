/**
 * 
 */
package a55�����л�����ڽڵ�;

import java.util.HashSet;

import �ṹ.ListNode;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��25������3:26:14
	@����������
һ�������а����������ҳ�������Ļ�����ڽ�㡣
	@�㷨˼·��
����һ��	
 1�������߲��ԡ�p1ÿ����������p2ÿ����һ����
 2������ͷ����ھ���Ϊa1����ڵ����������Ϊa2�������㵽��ڵľ�����a3��
 3������ʱ��p1�߹��ˣ�a1+k(a2+a3)+a2;
 	p2�߹���,a1+n(a2+a3)+a2;����n<k���������nӦ����0����
 	��Ϊp1�߹�����p2���������У�
 		a1+k(a2+a3)+a2=2[a1+n(a2+a3)+a2]��
 	=��	a1=(k-2n)(a2+a3)-a2;
 	=��	a1=(k-1-2n)(a2+a3)+(a2+a3)-a2=(k-1-2n)(a2+a3)+a3;
 	��a3�Ķ��壬��ʱ���Ǽ�����һ����p����㿪ʼ�ߣ�
 		��p��p2����ʱ��p����a1��p2����(k-1-2n)(a2+a3)+a3����������������ڵ㣻

 ��������
 		ʹ��Hash�ķ������������Ľڵ���Ϊkey���棻
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
























