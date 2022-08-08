import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char word = sc.next().charAt(0);
		int wordASCII = word;
		System.out.println(wordASCII);
		
		sc.close();

	}
}