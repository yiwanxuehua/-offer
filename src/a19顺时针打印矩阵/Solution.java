package a19顺时针打印矩阵;

import java.util.ArrayList;

/*	@作者：yiwanxuehua
	@创建时间：2018年4月19日下午9:30:28

	@问题描述：
	输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字；
	例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
	则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

	@算法思路：
		（1）：顺时针打印一圈是一层，那么需要打多少层？（i=0->i=rows/2&&j=i->cols/2）层；
		（2）：顺时针打印怎么打印：printRow1，printCol1，printRow2，printCol2;

*/
public class Solution {
    boolean [][]flag;
    ArrayList<Integer> res=new ArrayList();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       int str=0;
       int rows=matrix.length;
        int cols=matrix[0].length;
        flag=new boolean[rows][cols];
        while(str*2<rows&&str*2<cols){
            print(str,matrix,flag,rows,cols);
                str++;
        }
        return res;
    }
    void print(int str,int [][] matrix,boolean[][]flag,int rows,int cols){
        int i=str;
        while(i<cols&&flag[str][i]==false){
            res.add(matrix[str][i]);
            flag[str][i]=true;
            i++;
        }
        str++;i--;//定位到下一个打印点
       while(str<rows&&flag[str][i]==false){
            res.add(matrix[str][i]);
            flag[str][i]=true;
            str++;
        }
        str--;i--;
        while(i>=0&&flag[str][i]==false){
            res.add(matrix[str][i]);
            flag[str][i]=true;
            i--;
        }
        str--;i++;
        while(str>=0&&flag[str][i]==false){
            res.add(matrix[str][i]);
            flag[str][i]=true;
            str--;
        }
    }
 }
