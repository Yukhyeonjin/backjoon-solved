package com.solved.yuk.class3.silver;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Silver_1260 {
    static int node[][],
               checked[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        String input[] = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]), // 정점
            M = Integer.parseInt(input[1]), // 간선
            V = Integer.parseInt(input[2]); // 시작 노드

        node = new int[N+1][N+1];
        checked = new int[N+1];

        for(int i = 0; i < M; i ++){
             input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]),
                b = Integer.parseInt(input[1]);
            node[a][b] = 1;
            node[b][a] = 1;
        }
        dfs(V);
        Arrays.fill(checked, 0);
        System.out.println();
        bfs(V);

        bw.flush();
        bw.close();
    }

    public static void dfs(int x){
        if(checked[x] == 1) return;
        checked[x] = 1; // 방문 표시
        System.out.print(x+" ");
        for(int i = 0 ; i < node.length; i ++){
            if(node[x][i] == 1){ // x정점과 i정점이 연결 되어 있는지 확인
                dfs(i);
            }
        }
    }

    public static void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        checked[x] = 1; // 시작 노드 방문 표시
        while (!queue.isEmpty()){
            x = queue.poll();
            System.out.print(x+" ");
            for(int i = 0 ; i < node.length; i ++){
                if (node[x][i] == 1 && checked[i] != 1){
                    queue.offer(i);
                    checked[i] = 1;
                }
            }
        }
    }
}
