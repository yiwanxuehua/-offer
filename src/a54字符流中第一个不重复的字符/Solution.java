/**
 * 
 */
package a54�ַ����е�һ�����ظ����ַ�;

import java.util.ArrayList;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��25������2:59:23
	@����������
��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
��һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
	@�㷨˼·��
 1���ص��ǣ���һ��ֻ����һ�ε��ַ���
 2��ʹ��int�ͱ�����飬��С��128��
 */

public class Solution {
	
	 ArrayList<Character> res=new ArrayList<>();
	 int[]flag=new int[128];
	  //Insert one char from stringstream
	 public void Insert(char ch)
	 {
	     res.add(ch);
	     flag[ch]++;
	 }
	  //return the first appearence once char in current stringstream
	 public char FirstAppearingOnce()
	 {
	    for(int i=0;i<res.size();i++){
	    	if(flag[res.get(i)]==1)
	    		return res.get(i);
	    }
	   return '#';
	 }

}
