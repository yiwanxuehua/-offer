/**
 * 
 */
package a41������ֻ����һ�ε�����;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��23������3:00:07
	@����������
һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
num1��num2��0��λ�ô��ֱ��������������
	@�㷨˼·��
����һ������HashMap��ֵ�Ե���ʽȥѰ�ң����������Ļ��ռ临�Ӷ���Щ�ߡ�
�����������ö��������㣺Ϊʲô��Ŀ�����������ֳ������Σ�
	      ����֪��a^a=0;��ô�������е����е�������^���������յĽ���ᱣ������Ѱ�ҵ�����������Ϣ��
	   1������һ�����飬�������������
	   2��������У������ҵ���������е�һ����Ϊ0��λ�ã�˵���ڸ�λ�ô��������ǲ�ͬ�ģ�
	   3���ٴα������飬ÿ����������2��λ�����ж����λ�Ƿ���1���ֱ����num0��num1��
	   4������������num1��num2��������ҪѰ�ҵ�����
 */

public class Solution {
	static int[]num1=new int[1];
	static int[]num2=new int[1];
	public static void main(String[] args) {
		int[]arr={1,2,3,4,5,6,7,6,5,2,7,1};
		FindNumsAppearOnce(arr, num1, num2);
		System.out.println(num1[0]+"--"+num2[0]);
	}
	
    static public void FindNumsAppearOnce(int [] arr,int num1[] , int num2[]) {
    	if(arr==null||arr.length<=0) return;
    	int temp=0;
    	for(int i=0;i<arr.length;i++){
    		temp^=arr[i];
    	}//temp����arr������������
    	int first1Location=get1Location(temp);//�ҵ��ӵ�λ��ʼ�ĵ�һ��������1��λ�ã�
    	
    	for(int i=0;i<arr.length;i++){
    		int p=arr[i]>>>first1Location;//�Ƶ���Ӧλ�ã�
    		if((p&1)==1)
    			num1[0]^=arr[i];//����һ��ֻ�����������е�һ��
    		else num2[0]^=arr[i];
    	}
    }
    static int get1Location(int temp){
    	int count=0;
    	while((temp&1)==0&&count<32){//���ܳ���int���͵�32λ����
    		count++;
    		temp=(temp>>>1);
    	}
    	
    	return 0;
    }
}
