package a21ջ��ѹ�뵯������;

import java.util.Stack;
/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��4��24������9:04:01
	@����������
	���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
	@�㷨˼·��
		1��˳����ջ��
		2��������ջ��
*/
public class Solution {
	public static void main(String args[]){
		int[] a={1,2,3,4,5};
		int[] b={4,5,3,1,2};
		System.out.println(IsPopOrder(a,b));
	}
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
    	Stack<Integer> stack=new Stack();
    	for(int i=0;i<pushA.length;i++){
    		stack.push(pushA[i]);
    		while((!stack.isEmpty())&&(stack.peek()==popA[i])){
    			stack.pop();
    			i++;
    		}
    	}
    	if(stack.isEmpty())return true;
    	return false;
    }
}
