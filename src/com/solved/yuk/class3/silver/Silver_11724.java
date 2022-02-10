package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_11724 {
    static boolean graph[][], visited[];
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        String input[] = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 0; i < M; i ++){
            input = br.readLine().split(" ");
            graph[Integer.parseInt(input[0])][Integer.parseInt(input[1])] = graph[Integer.parseInt(input[1])][Integer.parseInt(input[0])] = true;
        }
        int count = 0;
        for(int i = 1; i <= N; i ++){
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }
        bw.write(count+"");

        bw.flush();
        bw.close();
    }
    public static void dfs(int start){
        if(!visited[start]){
            visited[start] = true;
            for(int i = 1; i <= N; i ++){
                if(graph[start][i] == true) dfs(i);
            }
        }
    }

}
