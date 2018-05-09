package a20定义栈的数据结构;
/*	@作者：yiwanxuehua
	@创建时间：2018年4月20日上午9:31:56

	@问题描述：定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。

	@算法思路：
		方式一：
			1、使用双栈模式：s与tem.s作为正常栈，tem记录最小元素栈；
			2、存入一个元素node，s正常入栈；若(tem==null||node<=tem.peek),则tem入栈；
			3、取出一个元素,s正常出栈node=s.pop()；若node<=tem.peek,则tem出栈，否则维持；
		方式二：
			1、同上
			2、s正常入栈；对于tem：如果node<tem的peek(),那么tem入栈node；
							否则将tem的peek(),再次入栈tem；
			3、出栈：s与tem正常出栈；
		方式二tem栈大小与s相同，方式一节省tem的空间。

*/
import java.util.Stack;
public class Solution {
	Stack <Integer>s=new Stack();
    Stack <Integer>tem=new Stack();
    
    public void push(int node) {
    	s.push(node);
    	if(tem.isEmpty()||node<=tem.peek())//必须是<=,试想如果连续存入两个最小值，只有<会错误；
    		tem.push(node);
//    	方式二：
//        s.push(node);
//        if(tem.isEmpty()) tem.add(node);
//        else{
//        	if(node<tem.peek()) tem.add(node);
//        	else tem.add(tem.peek());
//        }
    }
    
    public void pop() {
    	if(s.peek()<=tem.peek()) tem.pop();
    	s.pop();
    	
//    	方式二：
//        s.pop();
//        tem.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int min() {
        return tem.peek();
    }
    public static void main(String[]args){
    	Solution s1=new Solution();
    	s1.push(3);
    	s1.push(2);
    	s1.push(1);
    	s1.push(1);
    	s1.pop();
    	System.out.println(s1.min());
    }
}
