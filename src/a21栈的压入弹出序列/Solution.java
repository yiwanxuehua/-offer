package a21栈的压入弹出序列;

import java.util.Stack;
/*	@作者：yiwanxuehua
	@创建时间：2018年4月24日上午9:04:01
	@问题描述：
	输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序
	@算法思路：
		1、顺序入栈；
		2、相等则出栈；
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
