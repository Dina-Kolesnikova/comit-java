package Oct2;

public class Test2 {

	public static void main(String[] args) {
		
		String str1 = "New day";
		System.out.println( str1.length() );
		
		String str3 = "ComIT";
		String str2 = "Hello";
		String str4 = str2 + " " + str3;
		System.out.println(str4);
		
		String str6 = "Hello";
		System.out.println(str6.charAt(3));
		
		System.out.println(str6.contains("llo"));
		System.out.println(str6.indexOf("l"));
		
		String str7 = "hello";
		System.out.println(str6.equals(str7));
		System.out.println(str6.equalsIgnoreCase(str7));
		
		System.out.println(str7.replace("ell", "mx"));
		str7 = str7.replace("ell", "mx");
		System.out.println(str7);
		
		String str8 = "ComIT, I love Java";
		System.out.println(str8.substring(7));
		
		
		

	}

}
