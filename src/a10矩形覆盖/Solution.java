package a10矩形覆盖;
/*用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
 * 总共有多少种方法？* 
 * */
/*思路：类似于跳台阶的问题：
 * 1、矩形宽度为n，高度为2；
 * 2、从宽度的角度：
 * 	（1）小矩形可以横着放（高为2，那么此时已经确定小矩形两个横着叠放），余下长度为n-2；
 * 	（2）若竖着放：高正好为2，余下长度n-1;
 * 3：得：f(n)=f(n-2)+f(n-1);斐波那契；
 * */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int RectCover(int target) {
		if(target<=2) return target;
		int pre=1;
		int sec=2;
		for(int i=2;i<target;i++){
			sec+=pre;
			pre=sec-pre;
		}
		return sec;
		
    }

}
