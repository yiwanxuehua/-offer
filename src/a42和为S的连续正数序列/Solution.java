/**
 * 
 */
package a42��ΪS��������������;

import java.util.ArrayList;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��23������3:51:55
	@����������
������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
	@�㷨˼·��
���������ڶ��е�˼�룬�ж϶�����Ԫ�صĺͣ�С�ڣ�ͷ�ϼ���Ԫ�أ����ڣ�β������Ԫ�أ�
 */
public class Solution {
	public static void main(String[] args) {
		FindContinuousSequence(100000000);
	}
	static public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList <ArrayList<Integer>> result=new ArrayList<>();
		if(sum<3) return null;
		
		int str=1;//β��
		int end=2;//ͷ��
		int res=3;
		int fin=sum/2+1;
		while(end<=fin){
			if(res<sum){
				end+=1;
				res+=end;
			}
			if(res>sum){
				res-=str;
				str+=1;
			}
			if(res==sum){
				ArrayList<Integer> list=new ArrayList<>();
				for(int i=str;i<=end;i++){
					list.add(i);
				}
				result.add(list);
				
				end++;//�������Ѱ�ң�
				res+=end;
			}
		}
		for(ArrayList l:result){
			System.out.println(l.toString());
		}
		return result;
	}
}





























