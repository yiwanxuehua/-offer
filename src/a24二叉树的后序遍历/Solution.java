package a24�������ĺ������;
/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��4��24������10:20:55
	@����������
����һ���������飬�жϸ������ǲ���ĳ ���������� �ĺ�������Ľ����
	@�㷨˼·��
	���ڶ��������������䶨���֪����һ���ظ��ݹ�Ĺ��̡�
		//1���������һ��ֵ��һ����root�ڵ㡣
        //2��root�ڵ���ǰ��һ��С��root��Ľڵ�j����root����ڵ㣨������п�����null��
        //3��Ȼ�����Ǽ���str��j������нڵ�>root�Ļ���return false��
        //4����û�У���ʾ��ǰ����Թ��ɶ���������
         *5����str,j��(j+1,end)���еݹ飬��ô��ֹ����Ҳ��������if(str>=end)return true��

*/
public class Solution {
	public static void main(String[]args){
		int[]a={3,8,5,12,16,15,10};
		int[]b={3,8,5,12,15,16,10,};
		int []c={5,4,3,2,1};
//		System.out.println(VerifySquenceOfBST(a));
		System.out.println(VerifySquenceOfBST(c));

	}
	static public boolean VerifySquenceOfBST(int [] seq) {
		if(seq==null||seq.length<=0) return false;
		int end=seq.length-1;
		int str=0;
		return isBST(seq,str,end);
	}
	private static boolean isBST(int[]seq,int str,int end){
		if(str>=end) return true;
		int j=end;
		while(j>str&&seq[j]>=seq[end]){//j�����ҵ��˵�һ��С��root�ĵ㣻
			j--;
		}
		for(int i=str;i<j;i++){//j��϶�С��
			if(seq[i]>seq[end])
				return false;
		}						//���˿����жϱ�������������������㣻
		return isBST(seq,str,j)&&isBST(seq,j+1,end-1);
	}
}
