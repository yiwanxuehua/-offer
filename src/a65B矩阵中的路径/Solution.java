/**
 * 
 */
package a65B�����е�·��;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��27������3:20:12
	@����������
	�����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����
·�����ԴӾ����е�����һ�����ӿ�ʼ��ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ�
���һ��·�������˾����е�ĳһ�����ӣ����·�������ٽ���ø��ӡ�
 	���� a b c e s f c s a d e e �����а���һ���ַ���"bcced"��·����
 ���Ǿ����в�����"abcb"·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��
 ·�������ٴν���ø��ӡ�
	@�㷨˼·��
	
	��Boolean��¼�Ƿ��λ�ñ����ʹ����������ҵ�˳��Ѱ�ң��Ҳ����ݹ鷵����һ�㣬boolean��¼�����޸ģ�
	
 "ABCESFCSADEE",3,4,"ABCCED";
 ��д�����µ��߼���ţ����ҳ��ͨ����������"ABCESFCSADEE",3,4,"ABCB"���������ϣ���ʾ�ҵĳ�����true��
 ��������eclipse������ʾȷʵ��false����֪Ϊ�Σ�

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
	        if(ismix(matrix,rows,cols,str,i-1,j,flag,1+k)||//������i++������++iҲ���в�֪Ϊ�Σ�
	          ismix(matrix,rows,cols,str,i+1,j,flag,1+k)||
	          ismix(matrix,rows,cols,str,i,j-1,flag,1+k)||
	          ismix(matrix,rows,cols,str,i,j+1,flag,1+k)){
	            return true;
	        } 
	        flag[index]=0;
	        return false;
	    }
	
	
	
	//�Լ�д�ģ�ţ��δͨ����
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
		//i����ʼλ�ã�
		//˳���������ң�
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
