package a26复杂链表的复制;
/*	@作者：yiwanxuehua
	@创建时间：2018年5月2日下午7:36:50

	@问题描述：
	输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
	另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
	（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）

	@算法思路：
	如果单独建一个新链表的话，还需要定位random等，很麻烦；
	(1):将新的链表先一个个插入到旧链表中；
	(2):重建新链表的random属性；
	(3):分离旧链表与新链表；

*/
public class Solution {
	public static void main(String args[]){
		RandomListNode n1=new RandomListNode(1);
		RandomListNode n2=new RandomListNode(2);
		RandomListNode n3=new RandomListNode(3);
		RandomListNode n4=new RandomListNode(4);
		RandomListNode n5=new RandomListNode(5);
		n1.next=n2;	n2.next=n3;n3.next=n4;n4.next=n5;
		n1.random=n5;
		n2.random=n4;
		System.out.println(new Solution().Clone(n1));

	}
	public RandomListNode Clone(RandomListNode pHead){
		
		if(pHead==null) return null;
		RandomListNode pre=pHead;
		//在旧表中以此插入新表；
		while(pre!=null){
			RandomListNode node=new RandomListNode(pre.label);
			node.next=pre.next;
			pre.next=node;
			pre=node.next;
		}
		pre=pHead;
		//重建random属性：
		while(pre!=null){
			if(pre.random!=null){//pre.next是和pre一样的，但是pre.random不能确定是否为null;
				pre.next.random=pre.random.next;
			}
			pre=pre.next.next;
		}
		//新表与旧表分离：
		pre=pHead;
		RandomListNode head=pre.next;
		RandomListNode copyHead=head;
		while(pre!=null){
			pre.next=pre.next.next;
			if(copyHead.next!=null){//不确定copyHead的next是不是null的：
				copyHead.next=copyHead.next.next;
			}			
			pre=pre.next;
			copyHead=copyHead.next;
		}
		return head;
	}
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
