

/*��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 *  ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 *   ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת��
 * ���������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * */
package a06��ת�������С����;
/*
 * һ��ʼû���뵽���������飬���Բ��ö��ֲ��ң�������ͷβָ�����м俿£�İ취��
 *���£�
import java.util.ArrayList;
public class Solution {
	public static void main(String[]args){
		int []a={3,4,5,1,2};
		System.out.print(minNumberInRotateArray(a));
	}
    public static  int minNumberInRotateArray(int [] array) {
		
    	if(array==null||array.length<=0) return 0;
    	int i=0;int j=array.length-1;
    	
    	while(i<j&&array[j]<=array[i]){
    		i++;j--;
    	}
    	if(i==0&&j==array.length-1) return array[i];//û���ƶ�����ȫ������һ��ʱ��
    	else return array[i]<array[j+1]?array[i]:array[j+1];
    }
}
*/
/*
 * ��������ʱ�Ĳ���Ӧ���뵽���ֲ��������Ч�ʣ�
 * 
 */
import java.util.ArrayList;
public class Solution {
	public static void main(String[]args){
		int []a={3,4,5,1,2};
		System.out.print(minNumberInRotateArray(a));
	}
    public static  int minNumberInRotateArray(int [] array) {
    	if(array==null||array.length<=0) return 0;
    	int str=0;int end=array.length-1;
    	int mid=0;
    	while(array[str]>=array[end]){//str��end��logn���ٶȼб���С�㣻
    		mid=(str+end)/2;
    		if(array[mid]>=array[str])//��ʱ��С�����Ҳ࣬�ȺŲ���ȥ����
    			str=mid;		//��ʱ�����Ҳ��ֵȫ����ȵĻ���ֱ�Ӹ���strҲ���ԣ�
    		if(array[mid]<=array[end])//��ʱ��С������࣬�ȺŲ���ȥ�����������ϡ�
    			end=mid;
    		if(end==str+1)//whileһ����ѭ������һ������ʱstr��end���ڣ�
    			break;
    	}
    	return array[str]<=array[end]?array[str]:array[end];
    }
}