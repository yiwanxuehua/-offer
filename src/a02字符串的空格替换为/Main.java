package a02�ַ����Ŀո��滻Ϊ;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
