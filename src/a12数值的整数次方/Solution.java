package a12��ֵ�������η�;
/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��4��17������8:18:12

	@����������
		����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
	@�㷨˼·��
		@˼·һ����֤³�����ж����룻��1�����ж�exponent��������ͬһתΪ����(2):base��exponent�η�
		@˼·����������쳲�������a^n=a^(n/2)*a^(n/2) if nΪż��
						 a^n=a^(��n-1��/2)*a^(��n-1��/2) if nΪ�棻
			���Բ��õݹ��˼��:
				���������ж������exponent����ʽ�������
				�ݹ鷽����1\����double res����ÿһ���ֵ��������res��
					   2\�ݹ���յ��ǣ�exponent==1��return base;
					   3\res=��һ�㣨exp/2��,res*res;
					   4\Ҫ�Ǳ����exp��������res*base��
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
