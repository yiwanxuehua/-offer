package a10���θ���;
/*��2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ�
 * �ܹ��ж����ַ�����* 
 * */
/*˼·����������̨�׵����⣺
 * 1�����ο��Ϊn���߶�Ϊ2��
 * 2���ӿ�ȵĽǶȣ�
 * 	��1��С���ο��Ժ��ŷţ���Ϊ2����ô��ʱ�Ѿ�ȷ��С�����������ŵ��ţ������³���Ϊn-2��
 * 	��2�������ŷţ�������Ϊ2�����³���n-1;
 * 3���ã�f(n)=f(n-2)+f(n-1);쳲�������
 * */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int RectCover(int target) {
		if(target<=2) return target;
		int pre=1;
		int sec=2;
		for(int i=2;i<target;i++){
			sec+=pre;
			pre=sec-pre;
		}
		return sec;
		
    }

}
