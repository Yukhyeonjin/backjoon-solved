package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Silver_2161 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i ++){
            queue.add(i);
        }
        int sch = 0, flag = 1;
        while (!queue.isEmpty()){
            if(sch == 0){
                bw.write(queue.poll()+" ");
                flag *= -1;
            }
            else {
                queue.add(queue.poll());
                flag *= -1;
            }
            sch+=flag;
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
