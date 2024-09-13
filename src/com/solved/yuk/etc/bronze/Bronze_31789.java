package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31789 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);

        int flag = 0;
        for (int i = 0; i < N; i ++) {
            input = br.readLine().split(" ");
            int C = Integer.parseInt(input[0]);
			int P = Integer.parseInt(input[1]);
			if(X >= C && P > S) {
				flag = 1;
			}
        }

        if(flag == 1) {
			bw.write("YES");
		}else {
			bw.write("NO");
		}
        

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
