package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        // 팩토리얼을 소인수 분해 했을 때 2 * 5의 갯수를 찾는다.
        int N = Integer.parseInt(br.readLine()), countingZero = 0;
        while (N >= 5){
            countingZero += N/5;
            N /= 5;
        }
        bw.write(Integer.toString(countingZero));
        bw.flush();
        bw.close();
    }
}
