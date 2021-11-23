package com.solved.yuk.class3.silver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Silver_2606 {
    static int node[][]; // 그래프
    static int check[]; // 방문
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        int computer = Integer.parseInt(br.readLine()),
                partnerComputer = Integer.parseInt(br.readLine());
        node = new int[computer+1][computer+1];
        check = new int[computer+1];
        String[] input;
        for(int i = 0; i< partnerComputer; i ++){
            input = br.readLine().split(" ");
            int leftCom = Integer.parseInt(input[0]), rightCom = Integer.parseInt(input[1]);
            node[leftCom][rightCom] = 1;
            node[rightCom][leftCom] = 1;
        }
        int count = bfs(1);
        bw.write(Integer.toString(count));

        bw.flush();
        bw.close();
    }

    static int bfs(int start){
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        check[start] = 1; // 방문 표시
        queue.offer(start);
        while (!queue.isEmpty()){
            int x = queue.poll(); // 인접 노드를 찾을 지점
            for(int i = 1; i < node.length; i ++){
                if(node[x][i] == 1 && check[i] != 1){
                    queue.offer(i);
                    check[i] = 1;
                    count++;
                }
            }
        }

        return count;
    }
}
