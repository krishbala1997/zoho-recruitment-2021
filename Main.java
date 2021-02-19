package zoho;
import java.util.Scanner;
public class PatternPro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		str = sc.nextLine();
		String fh = str.substring(0, str.length()/2);
		String sh = str.substring(str.length()/2, str.length());
		int sValue = 0;
		int sPointer = str.length()-1;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<sPointer;j++) {
				System.out.print(" ");			
			}
			sValue = 0;
			for(int x=0;x<str.length()-sPointer;x++) {
				if(x <= sh.length()-1) {
					System.out.print(sh.charAt(x));
				} else {
					
					System.out.print(fh.charAt(sValue++));
				}
			}
			System.out.println();
			sPointer--;
		}
	}

}
