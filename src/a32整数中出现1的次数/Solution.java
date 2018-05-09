package a32整数中出现1的次数;
/**
 * 
  	@作者：yiwanxuehua
	@创建时间：2018年5月8日下午9:30:51
	@问题描述：
求出任意非负整数区间中1出现的次数。如;求出1~13的整数中1出现的次数;
1~13中包含1的数字有1、10、11、12、13因此共出现6次
	@算法思路：*重要*
	我们的思路是按位判断该位上的1的数字个数；
	例如：abcde；
	（1）：开始我们判断e位为1的个数：
			大于e位：abcde/10*1个
			e位上面：abcde%10=e，如果e>=1,那么有1个；如果e<1,那么有0个；
		。。。。
	（2）：当我们判断c位时：
			大于c的：abcde/(10*10*10)*（10*10）个
			c位上的：abcde%(10*10*10)=cde;
				如果cde>199,加上100个；如果cde<100,加上0个；如果100<cde<199,加上cde-100+1个；
	再举例假设判断c位，即判断百位；k=n%(10*i)=cde；
	Math.min(i,Math.max(k-i+1,0):
		[1]:cde-100+1是cde在[100,199]区间内百位为1的个数；
		[2]:0是cde在[0,99]区间内百位为1的个数，当然是0了；
			[1][2]两者中的较大值就是cde在哪个区间。
		[3]:i表示cde>199时，cde中有100个百位为1的数；
		[4]:取min也是为了判断cde是否大于当前的i。
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(find(1233));
	}
	 private static int find(int n) {
		    
		 int count=0;
		 int k=0;
		 for(int i=1;i<=n;i*=10){
			 k=n%(10*i);
			 count+=(n/(10*i))*i+Math.min(i,Math.max(k-i+1,0));
		 }
		 return count;
	 }

}
