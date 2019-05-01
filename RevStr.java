import java.util.*;
class RevStr
{
	public static void main(String[] ar)
	{
		String str = "A man, a plan, a canal: Panama";
		System.out.println(reverse(str));
	}
	public static String reverse(String str) {
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
			rev+=Character.toString(str.charAt(i));
		return rev;
	}
}