/**
 * 
 */
package a44����ת�ַ���;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��24������9:18:22
	@����������
����һ���������ַ�����S���������ѭ������Kλ������������
���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc����
	@�㷨˼·��
	1:ע��String.substring(int begin,int end)�ļ���λ�á�
	2����n�ĳ��ȳ���lengthʱ������λ���ڣ�n%str.length()������
		��abcdefg����8������8λ��Ϊbcdefga��
		����λ����1����
	3����abcdefg��.substring(0,1):����0λ��ʼ���У���1λΪֹ��������1λ��substring(0,0)����к�Ϊ"";
 
 */

public class Solution {
	public static void main(String[] args) {
		String temp="abcdefg";
		System.out.println(LeftRotateString(temp,2));
		
		System.out.println("���"+"abcdef".substring(0, 0));
		System.out.println("".length());
	}
	static public String LeftRotateString(String str,int n) {
		
		if(str==null||str.length()<=0) return "";
		String part1=str.substring(0,n%str.length());
		System.out.println(part1);
		String part2=str.substring(n%str.length(),str.length());
		System.out.println(part2);
		return part2+part1;
	}

}
