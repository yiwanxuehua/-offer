/**
 * 
 */
package a57B����������һ���ڵ�;
import java.util.ArrayList;
import �ṹ.TreeLinkNode;
/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��25������7:40:41
	@����������
����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
	@�㷨˼·��
	1�����ǿ��Է�Ϊ���¼��������
		1���Ǹ��ڵ㣬��ֻ��һ���㣻
		2�����Һ��ӣ������Һ��ӵ����ӵ���...��
		3�������ӣ����ظ��ڵ㣻
		4�����Һ�������Ҷ�ӽڵ㣺
			�ҵ�������үү���ӵĸ��׽ڵ㣬���ظ��׵ĸ��ڵ㣻
	2�����ǿ��Խ�1,3,4�ϳ�һ�������Ƿ��ظ��ڵ㣻		
 */

public class Solution {
	public static void main(String[] args) {
	}
	static public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
		if(pNode==null) return pNode;
        //����ýڵ�����������
		if(pNode.right!=null){
			pNode=pNode.right;
			while(pNode.left!=null)
				pNode=pNode.left;
			return pNode;
		}
		//����ýڵ��Ǹ��ڵ���Һ��ӣ�
		while(pNode.next!=null&&pNode.next.right==pNode)
			pNode=pNode.next;
			//ѭ������ʱ��pNode.next��Ҫ���صĵ㣻
		//�����˵������е����
		return pNode.next;
    }

}
