/**
 * 
 */
package a36�����е������;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��11������9:26:01
	@����������
�������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�
����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ�������
 �����P%1000000007
	@�㷨˼·��
 	��1�����ù鲢�����˼�룬���е�ÿһ�ν�������Ҫ��¼��������count��
 	��2����Ҫע�����count�ļ��㣬����Ҫ�ϲ�[a,b,c]��[d,e,f]
 		1):���������Ѿ��ź���
 		2):����copy���һλ��d��λ����j=mid+1;��ǰiλ����0��
 		3):��ôd������Ծ���mid-i��
 */
public class Solution {
	static int count =0;
	public static void main(String[] args) {

		Solution s=new Solution();
		int []a={1,2,3,4,5,6,7,0};
		s.InversePairs(a);
		System.out.println(count);
	}
	private int InversePairs(int [] array) {
       int end=array.length-1;
       int []copy=new int[array.length];
       sort(array,copy,0,end);
       return count;
    }
	private void sort(int[]arr,int[]copy,int str,int end){
		if(str<end){
			int mid=(str+end)/2;
			sort(arr,copy,str,mid);
			sort(arr,copy,mid+1,end);
			merge(arr,copy,str,mid,end);
		}
	}
	private void merge(int[]arr,int[]copy,int str,int mid,int end){
		int i=str;
		int j=mid+1;
		int k=0;
		while(i<=mid&&j<=end){
			if(arr[i]<=arr[j]){
				copy[k++]=arr[i++];
			}else{
				count+=mid+1-i;   //ע������
				copy[k++]=arr[j++];
				if(count>1000000007)
					count%=1000000007;
			}
		}
		while(i<=mid){
			
			copy[k++]=arr[i++];
		}
		while(j<=end){
			copy[k++]=arr[j++];
		}
		k=0;
		while(str<=end){
			arr[str++]=copy[k++];
		}
	}

}
