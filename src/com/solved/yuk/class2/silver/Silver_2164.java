package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.*;

public class Silver_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 1; i <= N; i ++){
            queue.offer(i);
        }
        if(queue.size() > 1) {
            while (true) {
                queue.remove(); // 숫자 버리기
                if (queue.size() == 1) break;
                int changeNumber = queue.poll();
                queue.offer(changeNumber);
            }
        }
        int lastCard = queue.poll();
        bw.write(Integer.toString(lastCard));

        bw.flush();
        bw.close();
    }
}
