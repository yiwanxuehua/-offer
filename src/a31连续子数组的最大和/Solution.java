package a31���������������;
/**
 * 
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��8������9:06:44
	@����������
{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)
	@�㷨˼·��
	(1):maxInt�������ֵ��resΪ�����ۼӵĺͣ���res<0ʱ��res=0���¿�ʼ��
 */
public class Solution {

	public static void main(String[] args) {
		int[]arr={6,-3,-2,7,-15,1,2,2};
		System.out.println(Find(arr));
	}
	
	public static int Find(int[] arr) {
		if(arr.length<=0) throw new RuntimeException("��������");
		int maxInt=arr[0];
		int res=0;
		for(int i=0;i<arr.length;i++){
			res=res+arr[i];
			maxInt=Math.max(res, maxInt);
			if(res<0)
				res=0;
		}
		return maxInt;
	}

}
