package a19˳ʱ���ӡ����;

import java.util.ArrayList;

/*	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��4��19������9:30:28

	@����������
	����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
	���磬����������¾��� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
	�����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

	@�㷨˼·��
		��1����˳ʱ���ӡһȦ��һ�㣬��ô��Ҫ����ٲ㣿��i=0->i=rows/2&&j=i->cols/2���㣻
		��2����˳ʱ���ӡ��ô��ӡ��printRow1��printCol1��printRow2��printCol2;

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
        str++;i--;//��λ����һ����ӡ��
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
