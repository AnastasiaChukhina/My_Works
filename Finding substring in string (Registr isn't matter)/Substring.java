import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String a = in.nextLine();
		//recieved sting
		
		String b = in.nextLine();
		//verifiable substring
		
		char[] string1 = a.toCharArray();
		char[] substring = b.toCharArray();
		//arrays with string's and substring's symbols
		
		int n = 0;
		int firstSymbol = -1;
		int z = 0;
		int y = 1;
		boolean flag = true;
		
		if ( ( a.length() != 0 ) && (b.length() != 0) && ( a.length() >= b.length() ) ) {
			
			for (int i = 0; i <= (a.length() - b.length()); i++) {
				if ( ((string1[i] == substring[z]) || ( ((int)string1[i] + 32) == (int)substring[z] ) || ( (int)string1[i] == ((int)substring[z] + 32))) && (flag) )  {
					n += 1;
					firstSymbol = i+1;
						
					for (int k = firstSymbol; k < firstSymbol + b.length() - 1; k++) {
							
						if  ( (string1[k] == substring[y]) || ( ((int)string1[k] + 32) == (int)substring[y] ) || ( (int)string1[k] == ((int)substring[y] + 32)) ) {
							n += 1;
							if (y < b.length() - 1 ) {
								y += 1;
							}	
						}	
					}
					if (n == b.length()) {
										
						System.out.println("String contains a verifiable substring." + '\n' + "The first symbol of the substring is " + firstSymbol + ".");
						flag = false;
					}
					else {
						n = 0;
						firstSymbol = -1;
						z = 0;
					}	
				}
			}
			if ( firstSymbol == -1) {
				System.out.println("Substring is not found in the recieved string.");
			}
		}
		else {
			System.out.println("Substring cannot be longer than a string.");
		}
	}
}

	