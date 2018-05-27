/**
 * 
 */
package a66机器人的运动范围;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月27日下午8:23:10
	@问题描述：
	地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
但是不能进入行坐标和列坐标的数位之和大于k的格子。
 	例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），
 因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
	@算法思路：
 依然采用回溯法：通过flag进行标记；
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
