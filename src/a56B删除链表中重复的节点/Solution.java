/**
 * 
 */
package a56Bɾ���������ظ��Ľڵ�;

import �ṹ.ListNode;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��25������4:42:43
	@����������
��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣
 ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
	@�㷨˼·��
 1���õݹ�ȽϺ�����
 2���������ǵݹ��˼���ǣ����磺1��1,1,2,2,3,4��4,5��
 3����ÿһ�������ò����ظ���������1����ô����ֻ��ʣ�µ������ظ���return deleteDuplication(2);
 4�������ǰ�㲻��һ���ظ��㣬��3����ô3.next����deleteDuplication(4)�Ľ����
 
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
		//�Ƿ������ֹ������
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
