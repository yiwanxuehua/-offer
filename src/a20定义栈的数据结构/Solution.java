package a20����ջ�����ݽṹ;
/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��4��20������9:31:56

	@��������������ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������

	@�㷨˼·��
		��ʽһ��
			1��ʹ��˫ջģʽ��s��tem.s��Ϊ����ջ��tem��¼��СԪ��ջ��
			2������һ��Ԫ��node��s������ջ����(tem==null||node<=tem.peek),��tem��ջ��
			3��ȡ��һ��Ԫ��,s������ջnode=s.pop()����node<=tem.peek,��tem��ջ������ά�֣�
		��ʽ����
			1��ͬ��
			2��s������ջ������tem�����node<tem��peek(),��ôtem��ջnode��
							����tem��peek(),�ٴ���ջtem��
			3����ջ��s��tem������ջ��
		��ʽ��temջ��С��s��ͬ����ʽһ��ʡtem�Ŀռ䡣

*/
import java.util.Stack;
public class Solution {
	Stack <Integer>s=new Stack();
    Stack <Integer>tem=new Stack();
    
    public void push(int node) {
    	s.push(node);
    	if(tem.isEmpty()||node<=tem.peek())//������<=,���������������������Сֵ��ֻ��<�����
    		tem.push(node);
//    	��ʽ����
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
    	
//    	��ʽ����
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
