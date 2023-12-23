package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5357 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input;
        StringBuilder sb;
        for(int i = 0; i < n; i ++){
            input = br.readLine();
            sb = new StringBuilder();
            sb.append(input.charAt(0));
            for(int j = 1; j < input.length(); j ++){
                if(input.charAt(j) != input.charAt(j-1)){
                    sb.append(input.charAt(j));
                }
            }
            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
