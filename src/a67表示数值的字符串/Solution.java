/**
 * 
 */
package a67��ʾ��ֵ���ַ���;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��29������3:01:35
	@����������
	��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
	���磺
		�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ��
 		����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
	@�㷨˼·��
	һ���Ϸ�����ֵ[+,-]A.B(e|E[+,-]C);
	1��A��B��C��������
 	д���е��ң�
 */

public class Solution {
	public static void main(String[] args) {
		char[] tem="5e".toCharArray();
		
		System.out.println(isNumeric1(tem));
		System.out.println(isNumeric(tem));
	}
	
	static public boolean isNumeric1(char[] str) {
			String tem=new String(str);
	       String res="[\\+\\-]?\\d*(\\.\\d*)?([eE][\\+\\-]?\\d+)?"; 
	       return tem.matches(res);
	}
	
	static boolean haspoint=false;
	static public boolean isNumeric(char[] str) {
		if(str==null) return false;
		int i=0;
		//�ж�С����ǰ�沿�֣�
		if(str[i]=='+'||str[i]=='-')
			i++;
		i=hasInterger(str, i);
		
		//С���󲿷֣�
		i=hasPoint(str,i);
		if(i<str.length&&haspoint){//�����С����
			int k=i;
			i=hasInterger(str,i);
			if(k==i) return false;
		}
		//�Ƿ���e��
		if(i<str.length&&(str[i]=='E'||str[i]=='e')){
			i++;
			if(i<str.length&&(str[i]=='+'||str[i]=='-'))
				i++;
			int k=i;
			i=hasInterger(str,i);
			if(k==i) return false;
			
		}else{
			i=hasInterger(str, i);
		}
		
		
		if(i==str.length) return true;
		else
			return false;
    }
	//��û��������
	static int hasInterger(char[]str,int i){
		while(i<str.length&&str[i]>='0'&&str[i]<='9')
			i++;
		return i;
	}
	//��û��С����
	static int hasPoint(char[]str,int i){
		if(i<str.length&&str[i]=='.'){
			i++;
			haspoint=true;
		}
		return i;
	}
}















