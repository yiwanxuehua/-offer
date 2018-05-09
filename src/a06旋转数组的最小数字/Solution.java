

/*把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *  输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 *   例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，
 * 该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * */
package a06旋转数组的最小数字;
/*
 * 一开始没有想到是有序数组，可以采用二分查找，而是用头尾指针向中间靠拢的办法。
 *如下：
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
    	if(i==0&&j==array.length-1) return array[i];//没有移动，即全部数字一样时；
    	else return array[i]<array[j+1]?array[i]:array[j+1];
    }
}
*/
/*
 * 有序数组时的查找应该想到二分查找以提高效率：
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
    	while(array[str]>=array[end]){//str与end以logn的速度夹逼最小点；
    		mid=(str+end)/2;
    		if(array[mid]>=array[str])//此时最小点在右侧，等号不能去掉；
    			str=mid;		//有时候最右侧的值全是相等的话，直接更新str也可以；
    		if(array[mid]<=array[end])//此时最小点在左侧，等号不能去，理由类似上。
    			end=mid;
    		if(end==str+1)//while一定会循环到这一步，此时str与end相邻；
    			break;
    	}
    	return array[str]<=array[end]?array[str]:array[end];
    }
}