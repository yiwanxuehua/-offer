/**
 * 
 */
package a66�����˵��˶���Χ;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��27������8:23:10
	@����������
	������һ��m�к�n�еķ���һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ��
���ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ�
 	���磬��kΪ18ʱ���������ܹ����뷽��35,37������Ϊ3+5+3+7 = 18�����ǣ������ܽ��뷽��35,38����
 ��Ϊ3+5+3+8 = 19�����ʸû������ܹ��ﵽ���ٸ����ӣ�
	@�㷨˼·��
 ��Ȼ���û��ݷ���ͨ��flag���б�ǣ�
 */

public class Solution {

	public static void main(String[] args) {
		
		System.out.println(movingCount(18,38,38));
	}
	
	static public int movingCount(int threshold, int rows, int cols)
    {
        if(threshold<=0||rows<=0||cols<=0) return 0;
        boolean[][]flag=new boolean[rows][cols];
        
        return getCount(threshold,rows,cols,flag,0,0);
		
    }
	static public int getCount(int threshold, int rows, int cols,boolean[][]flag,int i,int j){
		
		if(i<0||i>rows-1||j<0||j>cols-1||flag[i][j]==true||sum(i,j,threshold)>0) return 0;
		flag[i][j]=true;
		return 1+getCount(threshold,rows,cols,flag,i+1,j)+getCount(threshold,rows,cols,flag,i,j+1);
	}
	
	static public int sum(int i,int j,int threshold){
		int sum=0;
		while(i>0){
			sum+=i%10;
			i=i/10;
		}
		while(j>0){
			sum+=j%10;
			j=j/10;
		}
		return sum-threshold;
	}

}
