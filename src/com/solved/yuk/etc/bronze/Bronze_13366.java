package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigDecimal;

public class Bronze_13366 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i ++){
            String input = br.readLine();
            int sum = 0;
            for(int j = 0; j < input.length(); j++){
                sum += Integer.parseInt(String.valueOf(input.charAt(j)));
            }
            if(sum % 9 ==0) bw.write("YES");
            else bw.write("NO");
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