package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25175 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        int next = 0;

        if (n >= 3) { // 전체 인원이 3명 이상이라면

            // 두부의 모 기준으로 사람의 번호를 value로 채워줬습니다.
            int[] arr = new int[n + 1];

            // 왼쪽으로 갈 수록 사람의 번호가 작아집니다.
            arr[1] = m - 2 > 0 ? m - 2 : m - 2 + n;
            arr[2] = m - 1 > 0 ? m - 1 : m - 1 + n;
            arr[3] = m;

            // 오른쪽으로 갈 수록 사람의 번호가 커집니다.
            for (int i = 4; i <= n; i++) {
                arr[i] = arr[i - 1] + 1 > n ? arr[i - 1] + 1 - n : arr[i - 1] + 1;
            }

            if (k < 0) { // 부른 두부의 모가 음수 일 때,
                next = arr[k % n + n];
            } else { // 짝수 일 떄
                next = arr[k % n == 0 ? n : k % n];
            }
        } else if (n == 1) { // 전체 인원이 1명이라면
            next = 1;
        } else if (n == 2) { // 전체 인원이 2명이라면
            if (k % 2 == 0) {
                next = m == 1 ? 2 : 1;
            } else {
                next = m == 1 ? 1 : 2;
            }
        }

        bw.write(Integer.toString(next));

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
