
//һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������


package a0809��̨�׺ͱ�̬��̨��;


public class Solution {

	public static void main(String[] args) {
		System.out.println(JumpFloor4(5));
		
	}
//���ܵ����һ��ǰ����λ�������ֿ��ܣ���n-1������n-2��
//Ҳ���ǣ�������n�׵ķ���=����n-1��+����n-2�׵ķ����ͣ��ݹ�˼�룻
	static public int JumpFloor(int target) {
		if(target==1||target==2) return target;
		return JumpFloor(target-1)+JumpFloor(target-2);
	}
	//ת����ʵ��
	static public int JumpFloor2(int target) {
		if(target==1||target==2) return target;//�����٣������Ǵӵ�������ʼ��
		int pre=1;
		int end=2;
		for(int i=1;i<=target-2;i++){//������⣬�������ף�����target-2��û������
			end=pre+end;
			pre=end-pre;
		}
		return end;
	}


//һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
//��̨��n�ϣ����ܿ��Դ�n-1�����ϣ��ɴ�n-2������...�ɴ�1�����ϣ���ֱ�����ϡ�
//	  f(n)=f(n-1)+f(n-2)+f(n-3)+...+1;
//  f(n-1)=f(n-2)+f(n-3)+f(n-4)+...+1;
//  ...
//    f(2)=f(1)+1;
//    f(1)=1;
//��һ�м��ڶ���Լȥ�� f(n)=2f(n-1)���ֹ�ϵ��
    //���ƣ�
	static public int JumpFloor3(int tar) {
		if(tar==0) return 0;
		int pre=1;
		for(int i=1;i<=tar-1;i++){
			pre*=2;
		}
		return pre;
	}
	//�ݹ飺
	static public int JumpFloor4(int target) {
		if(target==0||target==1) return target;
		return 2*JumpFloor4(target-1);
	}
	
	
}






