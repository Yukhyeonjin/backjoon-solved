package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_1012 {
    static boolean[][] dfs; // dfs 방문 배열
    static int[][] cabbage; // 당근 배열
    static int result, M ,N, K; // 지렁이 수, x, y, 배추 수
    static int[] moveX = {0,1,0,-1}, // x 좌표 이동 배열
                 moveY = {1,0,-1,0}; // y 좌표 이동 배열
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
            // 인접한 배추를 찾기 위해 미리 이동할 좌표 설정, 1,0 -1,0 0,1 0,-1
            int cx = x + moveX[i],
                cy = y + moveY[i];

            // 시작과 끝에서 -1이나 +1을 했을 경우 배열 크기를 벗어나는 경우가 있기 때문에 크기를 비교 후 접근
            if(cx >= 0 && cy >= 0 && cx < M && cy < N){
                if(!dfs[cx][cy] && cabbage[cx][cy] == 1){ // 방문하지 않았으며 해당 좌표가 배추일 경우에 해당 좌표에서 다시 dfs 작업
                    fs(cx, cy);
                }
            }
        }
    }
}
