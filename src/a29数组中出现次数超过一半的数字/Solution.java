package a29�����г��ִ�������һ�������;
/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��3������7:42:40

	@����������
	��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
	��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
	��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2��
	��������������0��

	@�㷨˼·��
	(1)��ע����Ŀ������������һ�룬ΪʲôҪ����,ΪʲôҪһ�룿
	(2):�ù�����ص�˼�룺ʿ��Ϊ��һ��Ԫ�أ���ͬ������һ����ͬ��һ���������ϵ���Ԫ�ؿ��ܾ��ǣ�
	
	(3):����ĳɵ��ڻ��߳���һ���أ�
		������ڣ���ôval��Ȼ���������һ�ζԱ��У���array[len-1]���ĶԱȣ�ҪѰ�ҵ���Ҫô�Ǵ�ʱ��val��Ҫô��array[len-1]����
		����������
*/
public class Solution {
	public static void main(String[]args){
		int[]a={2,3,2,3,2,4};
		Solution s1=new Solution();
		System.out.println(s1.MoreThanHalfNum_Solution2(a));
	}
	public int MoreThanHalfNum_Solution(int [] array) {
		int len=array.length;
		if(len<=0) return -1;
		int count=1;
		int val=array[0];
		for(int i=1;i<len;i++){
			if(array[i]==val)
				count++;
			else
				count--;
			if(count==0)
				val=array[i];
		}
		count=0;
		for(int i=0;i<len;i++){
			if(array[i]==val)
				count++;
		}
		if(count>len/2)
			return val;
		else return 0;
	}
	
	public int MoreThanHalfNum_Solution2(int [] array) {
		int len=array.length;
		if(len<=0) return -1;
		int count=1;
		int val=array[0];
		for(int i=1;i<len-1;i++){
			if(array[i]==val)
				count++;
			else
				count--;
			if(count==0){
				val=array[i];
				count=1;
			}
				
		}
		count=0;
		int count2=0;
		if(val!=array[len-1]){
			for(int i=0;i<len;i++){
				if(array[i]==val)
					count++;
				if(array[i]==array[len-1])
					count2++;
			}
			if((len&1)==0){//ż����
				if(count>=len/2) return val;
				if(count2>=len/2) return array[len-1];
				return 0;
			}else{//������
				if(count>len/2) return val;
				if(count2>len/2) return array[len-1];
				return 0;
			}
		}else{
			for(int i=0;i<len;i++){
				if(array[i]==val)
					count++;
			}
			if((len&1)==0){//ż����
				if(count>=len/2) return val;
				else return 0;
			}else{
				if(count>len/2) return val;
				else return 0;
			}
		}
	}
	
}
