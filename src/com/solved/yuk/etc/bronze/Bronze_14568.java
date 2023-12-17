package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14568 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), count = 0;
        if( N <= 5 ) bw.write("0");
        else {
            for (int i = 2; i <= N; ) { // 택희
                if (N - i >= 3) {
                    for (int j = 1; j <= N-i; j++) { // 영훈
                        for (int k = j+2; k <= N-i-j; k++) { // 남규
                            //bw.write(i + " " + j + " " + k + "\n");
                            if(i+j+k == N) count++;
                        }
                    }
                }
                i += 2;
            }
            bw.write(count+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

