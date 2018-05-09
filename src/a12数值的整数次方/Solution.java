package a12数值的整数次方;
/*	@作者：yiwanxuehua
	@创建时间：2018年4月17日下午8:18:12

	@问题描述：
		给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
	@算法思路：
		@思路一：保证鲁棒性判断输入；（1）：判断exponent的正负，同一转为正；(2):base的exponent次方
		@思路二：类似于斐波那契：a^n=a^(n/2)*a^(n/2) if n为偶；
						 a^n=a^(（n-1）/2)*a^(（n-1）/2) if n为奇；
			可以采用递归的思想:
				主方法：判断输入的exponent的形式，输出；
				递归方法：1\定义double res保存每一层的值，并返回res；
					   2\递归的终点是：exponent==1，return base;
					   3\res=下一层（exp/2）,res*res;
					   4\要是本层的exp是奇数，res*base；
*/
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Power(2.2,2));
	}
	/*
	static public double Power(double base, int exponent) {
		if(base==0.0&&exponent!=0) return 0;
		if(base!=0.0&&exponent==0) return 1;
		double res=base;
		boolean isFu=false;
		if(exponent<0) {
			isFu=true;
			exponent=-exponent;
		}
		for(int i=2;i<=exponent;i++){
			res*=base;
		}
		return isFu==true?1.0/res:res;
	}*/
	static public double Power(double base, int exponent) {
		if(base==0.0&&exponent!=0) return 0;
		if(base!=0.0&&exponent==0) return 1;
		double res=base;
		boolean isFu=false;
		if(exponent<0) {
			isFu=true;
			exponent=-exponent;
		}
		double res1=Power2(base,exponent);
		return isFu==true?1.0/res1:res1;
	}
	static double Power2(double base,int exp){
		if(exp==1) return base;
		double res=Power2(base,exp>>1);
		res*=res;
		if((exp&1)==1)
			res*=base;
		return res;		
	}

}
