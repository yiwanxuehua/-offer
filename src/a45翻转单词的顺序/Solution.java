/**
 * 
 */
package a45��ת���ʵ�˳��;

import java.util.Arrays;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��24������9:59:56
	@����������
ֱ�Ӿ�����student. a am I��ת������ȷ���� I am a Student.

	@�㷨˼·��
 
 */

public class Solution {
	public static void main(String[]args){
		System.out.println(ReverseSentence("student. a am I "));
	}
    static public String ReverseSentence(String str) {
    	String[]temp=str.split(" ");
    	System.out.println(Arrays.toString(temp));
    	StringBuffer sb=new StringBuffer();
    	for(int i=temp.length-1;i>=0;i--){
    		sb.append(temp[i]);
    		sb.append(" ");
    	}
    	
    	
    	return sb.toString().trim();
    }

}
