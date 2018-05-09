package a05两个栈实现队列;

/*
 鐢ㄤ袱涓爤鏉ュ疄鐜颁竴涓槦鍒楋紝瀹屾垚闃熷垪鐨凱ush鍜孭op鎿嶄綔銆�
  闃熷垪涓殑鍏冪礌涓篿nt绫诲瀷銆�
 */
import java.util.Stack;

public class Solution {
	 Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	        stack1.push(node);
	    }
	    
	    public int pop() {
	        if(stack1.empty()&&stack2.isEmpty()) 
	            return -1;
	            //throw new RuntimeException();
	        if(stack2.isEmpty()){
	            while(!stack1.isEmpty())
	                stack2.push(stack1.pop());
	        }
	        return stack2.pop();
	    }
}
