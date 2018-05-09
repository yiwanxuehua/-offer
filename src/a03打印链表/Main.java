package a03打印链表;

import java.util.ArrayList;

import 结构.ListNode;
/*
 * 	输入一个链表，从尾到头打印链表每个节点的值。
 * 可以用递归去做
 * 也可以借用ArrayList.add(index,val)在固定点插入某值；
 */
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
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

