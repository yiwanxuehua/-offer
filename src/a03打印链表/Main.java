package a03��ӡ����;

import java.util.ArrayList;

import �ṹ.ListNode;
/*
 * 	����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��
 * �����õݹ�ȥ��
 * Ҳ���Խ���ArrayList.add(index,val)�ڹ̶������ĳֵ��
 */
public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
	}
	
	 public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        
		 ArrayList<Integer> res=new ArrayList<>();
		 if(listNode==null) return res;
		 while(listNode!=null){
			 res.add(0, listNode.val);;
			listNode=listNode.next;
		 }		 
		 return res;
	 }
}

