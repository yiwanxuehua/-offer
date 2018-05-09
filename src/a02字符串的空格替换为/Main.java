package a02字符串的空格替换为;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		StringBuffer s=new StringBuffer("We Are Happy");
		System.out.println(replaceSpace(s));
	}
	
	
	public static String replaceSpace(StringBuffer str) {
		
    	char[] c=str.toString().toCharArray();
    	str=new StringBuffer();
    	for(int i=0;i<c.length;i++){
    		if(c[i]==' ')
    			str.append("%20");
    		else str.append(c[i]);
    	}
		return str.toString();
    }

}
