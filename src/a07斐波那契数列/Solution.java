
//��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
//n<=39


package a07쳲���������;

public class Solution {
	public static void main(String[]args){
		System.out.println( Fibonacci(6));
	}
	/*//�ݹ�
	static  public int Fibonacci(int n) {
    	if(n==0||n==1) return n; //������������Ϊ��ǰ��쳲�����ǰ��λ��쳲���ӵģ�
    							//�����һ��ʱ,��return  Fibonacci(1)+ Fibonacci(0)��
    	return Fibonacci(n-1)+ Fibonacci(n-2);
    }
    */
	//���ƣ����еĵݹ鶼�ǿ����õ�����ʵ�ֵģ���Ϊ���ݹ����ڴ�������Ƕ�Ӧ��ջ��ջ
	static  public int Fibonacci(int n) {
		if(n==0||n==1) return n; 
		int pre=0;// ��¼�������е�0����
		int end=1;// ��¼�������е�1����
		//ǰ��������0,1��
		for(int i=1;i<=n+1-2;i++){
		//쳲��Ǵӵ�0�ſ�ʼ�ģ���ʱ�Ѿ���������������n��Ϊn+1��������ʣn+1-2������ѭ��n+1-2�Σ�
			end=pre+end;
			pre=end-pre;
		}
		
		return end;
	}
}