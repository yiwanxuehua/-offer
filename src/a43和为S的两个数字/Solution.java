/**
 * 
 */
package a43��ΪS����������;

import java.util.ArrayList;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��23������4:16:05
	@����������
����һ����������������һ������S���������в������������ǵ����ǵĺ�������S��
����ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
	@�㷨˼·��
˼·������a42�ķ��������в�ͬ��
1���������飬ȫ��������2*6<4*4;���Դ�ͷβ�����ҵ��ĵ�һ�������Ǵ𰸣�
2��Ѱ�ҹ����У�����s<sum,��Ǯָ��������Ҹ�����ģ�
			   ����s��sum�����ָ����ǰ�ƣ�ʹ��Сһ�㣻
 */

public class Solution {
	public static void main(String[] args) {
		int []a={1,2,3,4,5,8};

	}
	static public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> res=new ArrayList();
        if(array==null||sum==0) return res ;
        
        int j=array.length-1;//j������β����ǰ��
        int i=0;			 //i������ͷ����ǰ��
        int s=0;
        while(i<j){
            s=array[i]+array[j];
            if(s==sum){
                res.add(array[i]);
                res.add(array[j]);
                return res;
            }else{
                if(s<sum) i++;
                else j--;
            }
        }
        return res;
	}
}
