/**
 * 
 */
package a50�ַ���ת��������;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��5��24������4:39:50
	@����������
��һ���ַ���ת����һ��������Ҫ����ʹ���ַ���ת�������Ŀ⺯���� 
��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0
	@�㷨˼·��
	������ַ�������ȷ�����ָ�ʽ�а�����[+,-,���ﲻ����С������Ϊ������]��
	ֻ����һ�λ򲻳��֣������������֣�
	һ������������ʾΪ��reg="[+,-]?\\d+(\\.\\d+)?"��
����һ�� 	1����Ҫ��¼���ţ���Ϊ���ʱ������Ҫ������ţ�
 		2����Ϊ�����������˵��������Ժ�
 	 		����[1,9]:t=(res[i]-'0')+t*10;��¼ǧ��λ�ȣ�
 	 		������������ʱֱ�ӷ���0���ɣ�

������������ķ���ʹ������ȥ�ж��Ƿ�Ϻ��淶��
	1����������Ϲ淶��ֱ�ӷ���0��
	2�������Ϲ淶�����ǽ�str����[+,-]�г����ݣ�
	�����з��ŵĻᱻ�г��������֣���һ�����ǿա����ģ�
	3�������еĽ��������Double.valueOf(str)����ת��Ϊdouble���ͣ�
	4������str�����ַ�������ж������
 */

public class Solution {
	public static void main(String[] args) {
		System.out.println(StrToInt1("+123-4.546"));
	}
	static public int StrToInt(String str) {
	  char[] res=str.toCharArray();
	  int i=0;
	  int fuHao=0;
	  int t=0;
	  if(res[0]=='-'){
		  fuHao=1;
		  i++;
	  }
	  if(res[0]=='+'){
		  i++;
	  }
	  for(;i<res.length;i++){
		  if(res[i]>='0'&&res[i]<=9){
			  t=(res[i]-'0')+t*10;
		  }else return 0;
	  }
	  return fuHao==1?-1*t:t;
	}
	//������С����������
	static public double StrToInt1(String str){
		String reg="[+,-]?\\d+(.\\d+)?";
		boolean b=str.matches(reg);
		double res=0.0;
		if(b==true){//��һ���Ϸ��������ַ�����
			String[] str1=str.split("[+,-]");
			if(str1.length==2){//˵��ǰ����ŷ��ţ�
				res=Double.valueOf(str1[1]);
			}else{
				 res=Double.valueOf(str1[0]);
			}
		}else{
			return 0;
		}
		if(str.indexOf(0)=='-') return -res;
		else return res;
	}

}









