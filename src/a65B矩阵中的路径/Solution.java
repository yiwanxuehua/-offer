/**
 * 
 */
package a65B矩阵中的路径;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年5月27日下午3:20:12
	@问题描述：
	请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 	例如 a b c e s f c s a d e e 矩阵中包含一条字符串"bcced"的路径，
 但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，
 路径不能再次进入该格子。
	@算法思路：
	
	用Boolean记录是否该位置被访问过；上左下右的顺序寻找，找不到递归返回上一层，boolean记录不用修改；
	
 "ABCESFCSADEE",3,4,"ABCCED";
 我写了以下的逻辑，牛客网页不通过，卡在了"ABCESFCSADEE",3,4,"ABCB"这组数据上，提示我的程序是true；
 但是我在eclipse中跑显示确实是false；不知为何；

 */

public class Solution {
	public static void main(String[] args) {
		char[] matrix={'a','b','c','e','s','f','c','s','a','d','e','e'};
		char[] str={'a','b','c','c','e','d'};
		System.out.println(hasPath1(matrix,3,4,str));
		System.out.println(hasPath(matrix,3,4,str));
		
	}
	
	static public boolean hasPath1(char[] matrix, int rows, int cols, char[] str)
	    {
	        if(matrix==null||matrix.length<=0||str.length<=0||str==null) return false;
	        int [] flag=new int[matrix.length];
	        for(int i=0;i<rows;i++){
	            for(int j=0;j<cols;j++){
	                if(ismix(matrix,rows,cols,str,i,j,flag,0))
	                    return true;
	            }
	        }
	        return false;
	    }
	   static public boolean ismix(char[] matrix, int rows, int cols, char[] str,int i,int j,int[]flag,int k){
	        int index=i*cols+j;
	        if(i<0||i>=rows||j<0||j>=cols||flag[index]==1||matrix[index]!=str[k]) return false;
	        if(k==str.length-1) return true;
	        flag[index]=1;
	        if(ismix(matrix,rows,cols,str,i-1,j,flag,1+k)||//不能用i++，这里++i也不行不知为何？
	          ismix(matrix,rows,cols,str,i+1,j,flag,1+k)||
	          ismix(matrix,rows,cols,str,i,j-1,flag,1+k)||
	          ismix(matrix,rows,cols,str,i,j+1,flag,1+k)){
	            return true;
	        } 
	        flag[index]=0;
	        return false;
	    }
	
	
	
	//自己写的，牛客未通过：
	static boolean flag=false;
	static public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
	{
	    if(matrix==null||matrix.length<=0||matrix.length<str.length) return false;
	    int len=matrix.length;
	    boolean[] sym=new boolean[len];
	    for(int i=0;i<matrix.length;i++){
	    	if(flag==true) return flag;
	    	else{
	    		if(matrix[i]==str[0]){
	    			isPath(matrix, rows,cols,str,sym,i,0);
	    		}
	    	}
	    }
		return flag;
	}
	static void isPath(char[] matrix, int rows, int cols, char[] str,boolean[]sym,int i,int j){
		//i是起始位置；
		//顺序上下左右；
		if(i>=0&&i<matrix.length&&j>=0&&j<str.length&&sym[i]==false&&matrix[i]==str[j]){
			if(j==str.length-1){
				flag=true;
				return;
			}
			sym[i]=true;
			if(flag==false)
				isPath(matrix, rows,cols,str,sym,i-cols,j+1);
			if(flag==false)
				isPath(matrix, rows,cols,str,sym,i-1,j+1);
			if(flag==false)
				isPath(matrix, rows,cols,str,sym,i+cols,j+1);
			if(flag==false)
				isPath(matrix, rows,cols,str,sym,i+1,j+1);
			sym[i]=false;
		}else{
			return;
		}
	}
}
