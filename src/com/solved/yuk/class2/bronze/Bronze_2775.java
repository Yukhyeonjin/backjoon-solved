package com.solved.yuk.class2.bronze;

import java.io.*;

public class Bronze_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 0층의 1호는 1명 2호는 2명 3호는 3명  4호는 4명  5호는 5명
        // 1층의 1호는 1명 2호는 3명 3호는 6명  4호는 10명 5호는 15명
        // 2층의 1호는 1명 2호는 4명 3호는 10명 4호는 20명 5호는 35명
        // 3층의 1호는 1명 2호는 5명 3호는 15명 4호는 35명 5호는 70명
        // k층의 n호 : k층 n-1 호 + k-1층 n호
        int T = Integer.parseInt(br.readLine());
        int k = 0, n = 0; // k : 층, n : 호
        for (int i = 0; i < T * 2; i++) {
            if (i % 2 == 0) {
                k = Integer.parseInt(br.readLine());
                continue;
            } else {
                n = Integer.parseInt(br.readLine());
                int[][] arr = new int[k+1][n];

                for(int j = 0; j < k+1; j ++){
                    for(int l = 0; l < n; l ++){
                        if (j == 0) arr[j][l] = l+1;
                        else if (l == 0) arr[j][l] = 1;
                        else arr[j][l] = arr[j][l-1] + arr[j-1][l];
                    }
                }
                bw.write(Integer.toString(arr[k][n-1]) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
