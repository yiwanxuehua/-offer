/**
 * 
 */
package a53�����ƥ��;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��24������7:48:52
	@����������
��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ���
��'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ���
 �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ��
 ���磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
	@�㷨˼·��
 
 */

public class Solution {
	public static void main(String[] args) {
		char []str={'\0','\0'};
		System.out.println(str.length);
		char []pattern={'\'','\''};
//		System.out.println(match(str,pattern));
	}
	
	static public boolean match(char[] str, char[] pattern){
//		if(str.length<=0||pattern.length<=0)
//			return false;
		int p1=0;
		int p2=0;
		return isMatch(str,p1,pattern,p2);
	}
	static public boolean isMatch(char[]str,int p1,char[]pattern,int p2){
		//��ֹ������str��ģʽ��patternͬʱ�ﵽĩβ��
		if(p1==str.length&&p2==pattern.length) return true;
		//����ַ�����û��ƥ�䵽ͷ������ģʽ���Ѿ���ͷ�ˣ���ôƥ��ʧ�ܣ�
		if(p1!=str.length&&p2==pattern.length) return false;
		
		//���ģʽ����ǰλ�ô�i����һλ��*ʱ��
		if(p2+1<pattern.length&&pattern[p2+1]=='*'){
			//�����ǰλ��ͬģʽ��ƥ��,ע�⵽Ҫ�ų�str���ܵ�ͷ�ˣ�����pattern��һ�����������
			if((p1!=str.length)&&(str[p1]==pattern[p2])||(p1!=str.length&&pattern[p2]=='.')){
				return isMatch(str,p1+1,pattern,p2)
						||isMatch(str,p1+1,pattern,p2+2)
						||isMatch(str,p1,pattern,p2+2);
			}else{
			//�����ǰλ��ͬģʽ����ƥ��
				return isMatch(str,p1,pattern,p2+2);
			}
		}
		//�����Զ���Ϊģʽ����һλ����*����Ϊ��*�Ļ��������ǲ���ִ�еģ������Ѿ�return�ˣ�
		if((p1!=str.length)&&(str[p1]==pattern[p2])||(p1!=str.length&&pattern[p2]=='.'))//��Ȼ��Ҫ�߽���жϣ�
			return isMatch(str,p1+1,pattern,p2+1);
		//���϶�����������false��
		return false;
	}
}























