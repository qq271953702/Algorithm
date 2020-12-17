package strings;

/**
 * 将小写的字符串转换成大写字符串
 * @author 乔布斯
 *
 */
public class ToUpperCase {
		
	public static void main(String[] args) {
			String s[]= {"avc123","ABC32av","BBBbaAA32"};
			for(String str :s) {
				System.out.println( str.toUpperCase().equals(upperCase1(str)) );
			}
			
	}
	
	
	
	public static String upperCase1(String str) {
		if(str==null || str.isEmpty()) {
			return str;
		}
		char s[] =str.toCharArray();
		for(int i=0;i<s.length;i++) {
			if(Character.isLetter(s[i]) &&Character.isLowerCase(s[i])) {
				s[i]=Character.toUpperCase(s[i]);
				}
			}
		return new String(s);
			
		}
		
}

