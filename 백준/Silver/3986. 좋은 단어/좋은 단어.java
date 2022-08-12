import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String word;
		int cnt = 0;


		for (int i = 0; i < num; i++) {
			Stack<Character> stack = new Stack<>();
			word = br.readLine();
			if (word.length() % 2 == 0) {
				stack.push(word.charAt(0));
				
				for (int j = 1; j < word.length(); j++) {
					if(stack.empty()) {
						stack.push(word.charAt(j));
					} else {
						if (stack.peek() == word.charAt(j)) {
							stack.pop();
						} else {
							stack.push(word.charAt(j));
						}
					}
				}

				if(stack.empty()) {
					cnt++;
				}
			}

		}
		System.out.println(cnt);

	}

}