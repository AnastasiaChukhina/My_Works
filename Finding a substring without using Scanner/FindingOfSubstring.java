public class FindingOfSubstring {
	public static void main(String[] args) {	
		
		String a = args[0];
		//recieved sting
		
		String b = args[1];
		//verifiable substring
		
		char[] string1 = a.toCharArray();
		char[] substring = b.toCharArray();
		//arrays with string's and substring's symbols
		
		int n = 0;
		int firstSymbol = -1;
		int z = 0;
		int y = 1;
		
		if ( ( a.length() != 0 ) && (b.length() != 0) && ( a.length() >= b.length() ) ) {
			
			for (int i = 0; i <= (a.length() - b.length()); i++) {
				if (string1[i] == substring[z]) {
					n += 1;
					firstSymbol = i+1;
						
					for (int k = firstSymbol; k < firstSymbol + b.length() - 1; k++) {
							
						if (string1[k] == substring[y]) {
							n += 1;
							if (y < b.length() - 1 ) {
								y += 1;
							}	
						}	
					}
					if (n == b.length()) {
										
						System.out.println("String contains a verifiable substring." + '\n' + "The first symbol of the substring is " + firstSymbol + ".");
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

	