/*
	��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
	ÿһ�ж����մ��ϵ��µ�����˳�����������һ����������
	��������һ����ά�����һ���������ж��������Ƿ��и�������

��������ת�۵㣺���½Ǻ����ϽǶ���ת�۵㣬��a[2][3]Ϊ����
1���ж�a[1][0]��tar�Ĺ�ϵ��
		��ȷ���true��
		if���ڣ�ȥ�����һ�У��ж�a[0][0];
		ifС�ڣ�ȥ�����һ�У��ж�a[1][1];
2:����ѭ����
��һ�����󣬴����½ǿ�ʼ��һ�飬�����ж��Ƿ���ڸõ�Ĺ��̡�

*/

package a01��ά�������;

public class Main {

	public static void main(String[] args) {
		
	}
	
	public static boolean Find(int target,int[][]array){
		
		if(array==null||array.length<=0) return false;
		
		int rows=array.length;
		int cols=array[0].length;
		
		int i=rows-1,j=0;
		while(i>=0&&j<cols){
			if(target==array[i][j]) return true;
			if(target>array[i][j]){
				j++;
				continue;
			}
			if(target<array[i][j]){
				i--;
			}
		}
		
		return false;
	}
}
