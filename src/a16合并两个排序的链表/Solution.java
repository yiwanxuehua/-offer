package a16�ϲ��������������;

import �ṹ.ListNode;

/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��4��18������7:45:58

	@�������������������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������

	@�㷨˼·��
		һ��ʼ������ѭ�������������㣺��1����ѭ������ͷ�ڵ���Ϣ��������״����Ƚ�ԭʼͷ�ڵ��val����
							��2����p1��p2�ҵ��Ǹ���С�󣬻���Ҫȷ��p.nextָ�򣬽�Ϊ�鷳
		�ݹ飺������ģ�2����֪��p.nextָ����һ��ݹ�ķ��ؼ�������������⣻

*/
public class Solution {
	public ListNode Merge(ListNode p1,ListNode p2) {
		//��ֹ������p1��ͷ�˻���p2��ͷ�ˣ���ôû��ͷ���Ǹ��Ͳ�������ֱ�ӷ��ؾ��У�  
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
