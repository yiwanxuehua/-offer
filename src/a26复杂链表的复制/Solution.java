package a26��������ĸ���;
/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��2������7:36:50

	@����������
	����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬
	��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head��
	��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�

	@�㷨˼·��
	���������һ��������Ļ�������Ҫ��λrandom�ȣ����鷳��
	(1):���µ�������һ�������뵽�������У�
	(2):�ؽ��������random���ԣ�
	(3):�����������������

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
		//�ھɱ����Դ˲����±�
		while(pre!=null){
			RandomListNode node=new RandomListNode(pre.label);
			node.next=pre.next;
			pre.next=node;
			pre=node.next;
		}
		pre=pHead;
		//�ؽ�random���ԣ�
		while(pre!=null){
			if(pre.random!=null){//pre.next�Ǻ�preһ���ģ�����pre.random����ȷ���Ƿ�Ϊnull;
				pre.next.random=pre.random.next;
			}
			pre=pre.next.next;
		}
		//�±���ɱ���룺
		pre=pHead;
		RandomListNode head=pre.next;
		RandomListNode copyHead=head;
		while(pre!=null){
			pre.next=pre.next.next;
			if(copyHead.next!=null){//��ȷ��copyHead��next�ǲ���null�ģ�
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
