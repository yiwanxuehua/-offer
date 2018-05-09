
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。


package a0809跳台阶和变态跳台阶;


public class Solution {

	public static void main(String[] args) {
		System.out.println(JumpFloor4(5));
		
	}
//青蛙的最后一跳前所处位置有两种可能：在n-1或者在n-2；
//也就是，调到第n阶的方法=调到n-1阶+调到n-2阶的方法和，递归思想；
	static public int JumpFloor(int target) {
		if(target==1||target==2) return target;
		return JumpFloor(target-1)+JumpFloor(target-2);
	}
	//转递推实现
	static public int JumpFloor2(int target) {
		if(target==1||target==2) return target;//不能少，下面是从第三级开始的
		int pre=1;
		int end=2;
		for(int i=1;i<=target-2;i++){//方便理解，以跳两阶，还有target-2阶没有跳。
			end=pre+end;
			pre=end-pre;
		}
		return end;
	}


//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
//在台阶n上，青蛙可以从n-1处跳上，可从n-2处跳上...可从1处跳上，可直接跳上。
//	  f(n)=f(n-1)+f(n-2)+f(n-3)+...+1;
//  f(n-1)=f(n-2)+f(n-3)+f(n-4)+...+1;
//  ...
//    f(2)=f(1)+1;
//    f(1)=1;
//第一行减第二行约去后 f(n)=2f(n-1)发现关系；
    //递推：
	static public int JumpFloor3(int tar) {
		if(tar==0) return 0;
		int pre=1;
		for(int i=1;i<=tar-1;i++){
			pre*=2;
		}
		return pre;
	}
	//递归：
	static public int JumpFloor4(int target) {
		if(target==0||target==1) return target;
		return 2*JumpFloor4(target-1);
	}
	
	
}






