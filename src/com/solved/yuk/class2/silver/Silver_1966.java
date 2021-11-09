package com.solved.yuk.class2.silver;

import java.io.*;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Silver_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int countCase = Integer.parseInt(br.readLine()), N, M, maxImportance, removeCount;
        String[] input;
        Queue<Integer> queue;
        Queue<Integer> resultQueue;
        for (int i = 0; i < countCase * 2; i += 2) {
            input = br.readLine().split(" ");
            N = Integer.parseInt(input[0]);
            M = Integer.parseInt(input[1]);

            input = br.readLine().split(" ");
            queue = new LinkedList<>();
            resultQueue = new LinkedList<>();
            maxImportance = 0;
            for (int j = 0; j < N; j++) {
                if (j == M) resultQueue.offer(1);
                else resultQueue.offer(0);

                int importance = Integer.parseInt(input[j]);
                maxImportance = Math.max(importance, maxImportance);
                queue.offer(importance);
            }
            removeCount = 0;
            while (!queue.isEmpty()) {
                if (queue.contains(maxImportance)) {
                    int peek = queue.peek();
                    if (peek == maxImportance) {
                        queue.poll();
                        removeCount++;
                        if (resultQueue.poll() == 1) break;
                    } else {
                        int tempNumber = queue.poll(),
                                tempResuleQueueNumber = resultQueue.poll();
                        queue.offer(tempNumber);
                        resultQueue.offer(tempResuleQueueNumber);
                    }
                } else maxImportance--;
            }
            bw.write(Integer.toString(removeCount) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
