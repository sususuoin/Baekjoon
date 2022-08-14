import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int cnt = Integer.parseInt(br.readLine());
		int n = 0;
		
		for(int i=0; i<cnt; i++) {
			n = Integer.parseInt(br.readLine());
			
			if(n==0) {
				if(pq.isEmpty()) {
					sb.append("0\n");
				} else {
				sb.append(pq.poll()).append("\n");
				}
				
			} else {
				pq.add(n);
			}
			
		}
		System.out.println(sb);
		
	}
}
