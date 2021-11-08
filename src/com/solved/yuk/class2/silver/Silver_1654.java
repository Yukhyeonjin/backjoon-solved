package com.solved.yuk.class2.silver;

import java.io.*;

public class Silver_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        String[] firstLine = br.readLine().split(" ");
        int K = Integer.parseInt(firstLine[0]),
                N = Integer.parseInt(firstLine[1]);
        int[] numberArray = new int[K];
        int numberInput;
        long max = 0;
        for(int i = 0; i < K; i ++){
            numberInput = Integer.parseInt(br.readLine());
            numberArray[i] = numberInput;
            max = Math.max(max, numberInput);
        }
        max++;
        long min = 0; // 탐색 길이 최솟값
        long mid = 0;

        while (min < max) {
            mid = (max + min) / 2;
            long count = 0;
            for (int i = 0; i < numberArray.length; i++) {
                count += (numberArray[i] / mid);
            }
            if(count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        bw.write(Long.toString(min - 1));

        bw.flush();
        bw.close();
    }
}
