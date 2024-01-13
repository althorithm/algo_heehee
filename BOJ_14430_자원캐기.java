import java.io.*;
import java.util.*;

public class BOJ_14430_자원캐기 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] map = new int[N][M];
		int[][] dp = new int[N][M];
		for(int i=0;i<N;i++){
			st = new StringTokenizer(in.readLine());
			for(int j=0;j<M;j++){
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dp[0][0] = map[0][0];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(i+1<N && dp[i][j] + map[i+1][j] > dp[i+1][j] ) dp[i+1][j] = dp[i][j] + map[i+1][j];
				if(j+1<M && dp[i][j] + map[i][j+1] > dp[i][j+1]) dp[i][j+1] = dp[i][j] + map[i][j+1];
			}
		}

		System.out.println(dp[N-1][M-1]);
	}
}
