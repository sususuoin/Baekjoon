import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;


public class Main {
	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb1 = new StringBuilder();
		
		for(int i=0; i<num; i++) {
			for(int j=1; j<num-i; j++) {
				System.out.print(" ");
			}
			sb1.append("*");
			System.out.println(sb1.toString());
		}

	}
}