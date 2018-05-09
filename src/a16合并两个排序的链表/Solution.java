package a16合并两个排序的链表;

import 结构.ListNode;

/*	@作者：yiwanxuehua
	@创建时间：2018年4月18日下午7:45:58

	@问题描述：输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则

	@算法思路：
		一开始想着用循环，但是有两点：（1）：循环后保留头节点信息，这个容易处理，比较原始头节点的val即可
							（2）：p1和p2找到那个最小后，还需要确定p.next指向，较为麻烦
		递归：从上面的（2）可知，p.next指向下一层递归的返回即可完美解决问题；

*/
public class Solution {
	public ListNode Merge(ListNode p1,ListNode p2) {
		//终止条件，p1到头了或者p2到头了，那么没到头的那个就不用排了直接返回就行；  
		if(p1==null) return p2;
		else if(p2==null)return p1;
		
		ListNode root=null;
		if(p1!=null&&p2!=null){
			if(p1.val<=p2.val){
				root=p1;
				p1=p1.next;
			}else{
				root=p2;
				p2=p2.next;
			}
			root.next=Merge(p1,p2);
		}
		return root;
	}
}
