import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		String []nums = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		
		if(a>b)
			System.out.println(">");
		else if (a<b)
			System.out.println("<");
		else
			System.out.println("==");

	}
}