
//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
//n<=39


package a07斐波那契数列;

public class Solution {
	public static void main(String[]args){
		System.out.println( Fibonacci(6));
	}
	/*//递归
	static  public int Fibonacci(int n) {
    	if(n==0||n==1) return n; //返回条件：因为当前的斐波是由前两位的斐波相加的，
    							//故最后一层时,是return  Fibonacci(1)+ Fibonacci(0)；
    	return Fibonacci(n-1)+ Fibonacci(n-2);
    }
    */
	//递推，所有的递归都是可以用递推来实现的，因为，递归在内存里面就是对应入栈出栈
	static  public int Fibonacci(int n) {
		if(n==0||n==1) return n; 
		int pre=0;// 记录两个数中第0个数
		int end=1;// 记录两个书中第1个数
		//前两个数是0,1；
		for(int i=1;i<=n+1-2;i++){
		//斐波是从第0号开始的，此时已经有了两个数，第n项为n+1个数，还剩n+1-2个数，循环n+1-2次；
			end=pre+end;
			pre=end-pre;
		}
		
		return end;
	}
}