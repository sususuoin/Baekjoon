import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer price = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(price.nextToken()); // 고정비용
		int b = Integer.parseInt(price.nextToken()); // 가변비용
		int c = Integer.parseInt(price.nextToken()); // 판매가

		if((c-b)<=0) {
			System.out.println(-1);
		} else {
			System.out.println(a/(c-b)+1);
		}
	}
}
