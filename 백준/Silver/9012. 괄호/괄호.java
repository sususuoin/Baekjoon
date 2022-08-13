import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine()); // 입력 데이터 개수
		String vps;
		
		for (int i = 0; i < num; i++) {
			Stack<Character> st = new Stack<>();
			vps = br.readLine();
			if (vps.length() % 2 == 0) {
				st.push(vps.charAt(0));
				for (int j = 1; j < vps.length(); j++) {
					if (st.empty()) {
						st.push(vps.charAt(j));
					} else {
						if (st.peek() != vps.charAt(j) && st.peek() == '(') {
							st.pop();
						} else {
							st.push(vps.charAt(j));
						}
					}
				}
				if (st.empty()) {
					sb.append("YES\n");
				} else {
					sb.append("NO\n");
				}
			} else {
				sb.append("NO\n");
			}

		}
		System.out.println(sb);
	}

}