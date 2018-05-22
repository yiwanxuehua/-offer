/**
 * 
 */
package a38���������������г��ֵĴ���;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��22������8:34:25
	@����������
ͳ��һ�����������������г��ֵĴ�����
	@�㷨˼·��
����һ������һ�飬�ҵ�k��������ɣ�
������������������뵽���ֲ��ң�
	1���������ã�str+end)/2�ҵ��е㣬�жϸõ��ǲ���k�㣻
	2����ֱ�ӷ��ظõ�λ�ã�����ǰ���Ҽ��ɣ�
	3����С�ڣ���ô��k֮ǰλ���ң���������k֮��λ���ң�
���������������ö��ֲ��ң������ܲ����ҵ���һ��k��λ�ú����һ��k��λ�ã�
	1�����ֲ���ʱ������֮ǰ�Ĳ��ԣ����ǵ������ҵ���mid��==kʱ��
	2�������ǰһλ����k����ôend=mid-1�������ҵ�����ʼk�㣻
	3��������һλ����k����ôstr=mid+1�������ҵ������ս�k�㣻
 */
public class Solution {

	public static void main(String[] args) {
		int []arr={1,2,3,3,3,3,3,3,4,4,4,4,5,5,6};
		System.out.println(GetNumberOfK(arr,4));
	}
	public static int GetNumberOfK(int [] array , int k) {
		
		int end=array.length;
		int firstK=getFirstMid(array,0,end,k);
		int lastK=getLastMid(array,0,end,k);
		
		System.out.println(firstK);
		System.out.println(lastK);
		
		int res=lastK-firstK+1;
		return res>=0?res:0;
		
	}
	
	static int getFirstMid(int[]array,int str,int end,int k ){
		if(str==end) return str;
		while(str<=end){
			int mid=(str+end)/2;
			if(k<array[mid]){
				end=mid-1;
			}
			else if(k>array[mid]){
				str=mid+1;
			}
			else if(mid-1>=str&&array[mid-1]==k) {
					end=mid-1;
			}else 
				return mid;
		}
		return -1;
	}
	
	static int getLastMid(int[]array,int str,int end,int k ){
		if(str==end) return str;
		while(str<=end){
			int mid=(str+end)/2;
			if(k<array[mid]){
				end=mid-1;
			}
			else if(k>array[mid]){
				str=mid+1;
			}
			else if(mid-1>=str&&array[mid+1]==k) {
					str=mid+1;
			}else 
				return mid;
		}
		return -1;
	}

}





















