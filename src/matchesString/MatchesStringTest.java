package matchesString;

import java.util.regex.Pattern;

public class MatchesStringTest {

	public static void main(String[] args) {
		
		String string = "anderson ferreira";
		try {
			Float.parseFloat(string);
			System.out.println("É número");
		} catch (NumberFormatException e) {
			System.out.println("Não é número");
		}
		System.out.println(" ".matches("\\s"));
		System.out.println(string.contains(" ") || string.contains("\t"));

	}

}
