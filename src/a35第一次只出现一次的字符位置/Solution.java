/**
 * 
 */
package a35��һ��ֻ����һ�ε��ַ�λ��;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��11������9:01:10
	@����������
	��һ���ַ���(1<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��

	@�㷨˼·��
	����һ������һ��flag���飬�������б����������ݣ�
	��������ͨ��hashmap,str[i]Ϊkey��countΪvalue��
 */
public class Solution {

	public static void main(String[] args) {
		
	}
	
	private int FirstNotRepeatingChar(String str) {
		if(str.length()<=0) return -1;
		int[] flag=new int[256];
		for(int i=0;i<str.length();i++){
			char temp=str.charAt(i);
			flag[temp]++;
		}
	    for(int i=0;i<flag.length;i++){
	    	if(flag[str.charAt(i)]==1)
	    		return i;
	    }
	    return -1;
	}

}
