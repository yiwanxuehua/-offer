/**
 * 
 */
package a33�������ų���С��;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��9������7:51:14
	@����������
����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ��;
������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323

	@�㷨˼·��
 	(1):������������ôʵ�֣����������{3,32}����Ϊ332>323,���Խ����323����������ƾʲô�����323����
 	323����ô����ģ�
 	��2����������Ƕ�{3,32}����������һ�������Զ���Ĺ���ת��Ϊ{32,3},��ô���ֱ�� 32+""+3�ͺ��ˣ�
 	(3):ע��compare������ʽ
 */

public class Solution {

	public static void main(String[] args) {
		int []a={3,32,321};
		int []b={3,5,1,4,2};
		String s1=PrintMinNumber(b);
		System.out.println(s1);
	}
	private static String PrintMinNumber(int [] nums){
		ArrayList<String> list=new ArrayList<>();
		String res="";
		for(int i=0;i<nums.length;i++){
			list.add(String.valueOf(nums[i]));
		}
		Collections.sort(list, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return (o1+o2).compareTo(o2+o1);
				//4,3>3,4����ô�ͽ�3��4����λ�ã�
			}
			
		});
		for(String s:list){
			res=res+s;
		}
		return res;
	}
	

}
