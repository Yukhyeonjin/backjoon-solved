package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1952 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]),
            N = Integer.parseInt(input[1]),
            arr[][] = new int[M][N],
            dir[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        arr[0][0] = 1;
        int nx = 0, ny = 0;
        int answer = 0;
        int d = 0;
        int temp = 0;
        while(true) {
            nx = nx + dir[d][0];
            ny = ny + dir[d][1];
            if(nx < 0 || ny < 0 || nx >= M || ny >= N || arr[nx][ny] == 1) {
                nx = nx - dir[d][0];
                ny = ny - dir[d][1];
                d = (d + 1) % 4;
                temp++;
            }
            if(temp == 4)
                break;
            else if(arr[nx][ny] == 0) {
                if(temp > 0)
                    answer++;
                temp = 0;
                arr[nx][ny] = 1;
            }
        }
        bw.write(answer+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
