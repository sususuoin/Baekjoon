import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int remainder[] = new int[10]; // 나머지를 저장할 배열
		boolean diff;
		int cnt = 0; // 서로 다른 나머지의 개수

		for (int i = 0; i<remainder.length; i++) {
			remainder[i] = Integer.parseInt(br.readLine()) % 42;
		}
		for (int i=0; i<remainder.length; i++) {
			diff = false;
			for (int j = i + 1; j < remainder.length; j++) {
				if (remainder[i] == remainder[j]) { // 두 값이 같으면 반복문 종료
					diff = true;
					break;
				}
			}
			if (diff == false) { // 나머지가 서로 다르면 cnt 증가
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}
}
