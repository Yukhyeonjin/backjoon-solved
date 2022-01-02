package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_1012 {
    static boolean[][] dfs;
    static int[][] cabbage;
    static int result, M ,N, K;
    static int[] moveX = {0,1,0,-1},
                 moveY = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        int T = Integer.parseInt(br.readLine()), X, Y;
        for(int i = 0; i < T; i ++){
            String[] input = br.readLine().split(" ");
            M = Integer.parseInt(input[0]);
            N = Integer.parseInt(input[1]);
            K = Integer.parseInt(input[2]);
            cabbage = new int[M+1][N+1];
            dfs = new boolean[M+1][N+1];
            result = 0;
            for(int j = 0; j < K; j ++){
                input = br.readLine().split(" ");
                X = Integer.parseInt(input[0]);
                Y = Integer.parseInt(input[1]);
                cabbage[X][Y] = 1;
            }
            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if(cabbage[x][y] == 1 && !dfs[x][y]){
                        fs(x, y);
                        result++;
                    }
                }
            }
            bw.write(result+"\n");
        }

        bw.flush();
        bw.close();
    }

    public static void fs(int x, int y){
        dfs[x][y] = true;
        for(int i = 0; i < 4; i ++){
            int cx = x + moveX[i],
                cy = y + moveY[i];

            if(cx >= 0 && cy >= 0 && cx < M && cy < N){
                if(!dfs[cx][cy] && cabbage[cx][cy] == 1){
                    fs(cx, cy);
                }
            }
        }
    }

    /*
    * static void dfs(int x, int y) {
		visit[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];

			if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
				if (!visit[cx][cy] && cabbage[cx][cy] == 1) {
					dfs(cx, cy);
				}
			}

		}

	}
    *
    * */
}
