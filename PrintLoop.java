

public class PrintLoop {

	public static void printloop(int n) {
		int maxlength = String.format("%d", n).length() * n;

		for (int i = 1; i<=n; i++){
			String str = repeat( String.format("%d", i), i);
			String dots = repeat(".", maxlength - str.length());
			System.out.println(dots+str);
		}
	}
	
	private static String repeat(String s,int n) {
		return new String(new char[n]).replace("\0", s); 
	}
	
	public static void main(String[] args) {
        printloop(5);
	}
}
