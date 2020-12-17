package strings;

/**
 * 进行字符串反转的算法
 * @author 乔布斯
 *
 */
public class reverse {
		
	public static void main(String[] args) {
		System.out.println(reverse1("abc321"));
		System.out.println(reverse2("abc321"));
		System.out.println(reverse2(null));
	}
	
	public static String reverse1(String str) {
		return new StringBuffer(str).reverse().toString();
	}
	public static String reverse2(String str) {
		if(str==null || str.isEmpty()) {
			return str;
		}
		char s[] =str.toCharArray();
		for(int i=0,j=s.length-1;i<j;i++,j--) {
			char temp=s[i];
			s[i]=s[j];
			s[j]=temp;
		}
		return new String(s);
	}
}
