package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_15649 {
    // DFS 문제
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        // N : 노드의 총 개수(1 ~ N), M : 수열의 크기(1 ~ M)
        int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]);

        arr = new int[M];
        visit = new boolean[N];
        dfs(N,M,0);
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static void dfs(int N, int M, int depth){
        if(depth == M){
            for(int val : arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i < N; i ++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N,M,depth+1);
                visit[i] = false;
            }
        }
    }
}
