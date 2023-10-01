package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30032 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), D = Integer.parseInt(input[1]);
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < N; i ++){
            input = br.readLine().split("");
            for(int j = 0; j < N; j ++){
                if("d".equals(input[j]) && D == 1) sb.append("q");
                if("b".equals(input[j]) && D == 1) sb.append("p");
                if("q".equals(input[j]) && D == 1) sb.append("d");
                if("p".equals(input[j]) && D == 1) sb.append("b");
                if("d".equals(input[j]) && D == 2) sb.append("b");
                if("b".equals(input[j]) && D == 2) sb.append("d");
                if("q".equals(input[j]) && D == 2) sb.append("p");
                if("p".equals(input[j]) && D == 2) sb.append("q");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
