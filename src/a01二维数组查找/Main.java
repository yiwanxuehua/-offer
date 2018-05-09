/*
	在一个二维数组中，每一行都按照从左到右递增的顺序排序，
	每一列都按照从上到下递增的顺序排序。请完成一个函数，输
	入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

分析：找转折点：左下角和右上角都是转折点，以a[2][3]为例：
1：判断a[1][0]与tar的关系：
		相等返回true；
		if大于，去掉最后一行，判断a[0][0];
		if小于，去掉左侧一列，判断a[1][1];
2:以上循环；
画一个矩阵，从左下角开始走一遍，就是判断是否存在该点的过程。

*/

package a01二维数组查找;

public class Main {

	public static void main(String[] args) {
		
	}
	
	public static boolean Find(int target,int[][]array){
		
		if(array==null||array.length<=0) return false;
		
		int rows=array.length;
		int cols=array[0].length;
		
		int i=rows-1,j=0;
		while(i>=0&&j<cols){
			if(target==array[i][j]) return true;
			if(target>array[i][j]){
				j++;
				continue;
			}
			if(target<array[i][j]){
				i--;
			}
		}
		
		return false;
	}
}
